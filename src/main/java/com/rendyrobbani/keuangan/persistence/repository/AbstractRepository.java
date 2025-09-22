package com.rendyrobbani.keuangan.persistence.repository;

import com.rendyrobbani.keuangan.core.domain.entity.BaseEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;
import com.rendyrobbani.keuangan.persistence.entity.AbstractBaseEntity;
import jakarta.persistence.Column;
import lombok.SneakyThrows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractRepository<ENTITY extends AbstractBaseEntity<DOMAIN, ID>, DOMAIN extends BaseEntity<ID>, ID> implements Repository<DOMAIN, ID> {

	protected abstract JpaRepository<ENTITY, ID> repository();

	@Override
	public List<DOMAIN> findAll() {
		return this.repository().findAll().stream().map(AbstractBaseEntity::toDomain).toList();
	}

	@Override
	public DOMAIN findById(ID id) {
		return this.repository().findById(id).map(AbstractBaseEntity::toDomain).orElse(null);
	}

	@Override
	public DOMAIN save(DOMAIN domain) {
		if (domain == null) throw new RuntimeException("Entity cannot be null");
		ENTITY entity = null;
		if (domain.id() != null) entity = this.repository().findById(domain.id()).orElse(null);
		entity = copy(domain, entity);
		entity = repository().save(entity);
		return entity.toDomain();
	}

	protected Class<ENTITY> entityClass;

	protected Class<DOMAIN> domainClass;

	@SuppressWarnings("unchecked")
	protected void initClass() {
		if (domainClass == null || entityClass == null) {
			ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
			this.entityClass = (Class<ENTITY>) type.getActualTypeArguments()[0];
			this.domainClass = (Class<DOMAIN>) type.getActualTypeArguments()[1];
		}
	}

	protected List<Method> domainMethods() {
		initClass();
		Map<String, Method> methods = new HashMap<>();
		Class<?> domainClass = this.domainClass;
		while (domainClass != null) {
			for (Method method : domainClass.getDeclaredMethods()) if (!methods.containsKey(method.getName()) && method.getParameterCount() == 0) methods.put(method.getName(), method);
			domainClass = domainClass.getSuperclass();
		}
		return List.copyOf(methods.values());
	}

	protected List<Field> entityFields() {
		this.initClass();
		Map<String, Field> fields = new HashMap<>();
		Class<?> entityClass = this.entityClass;
		while (entityClass != null) {
			for (Field field : entityClass.getDeclaredFields()) if (!fields.containsKey(field.getName()) && field.isAnnotationPresent(Column.class)) fields.put(field.getName(), field);
			entityClass = entityClass.getSuperclass();
		}
		return List.copyOf(fields.values());
	}

	@SneakyThrows
	private ENTITY copy(DOMAIN from, ENTITY into) {
		this.initClass();
		if (into == null) into = entityClass.getDeclaredConstructor().newInstance();
		Map<String, Method> methods = domainMethods().stream().collect(Collectors.toMap(Method::getName, Function.identity()));
		for (Field field : entityFields()) {
			if (methods.containsKey(field.getName())) {
				Method method = methods.get(field.getName());
				field.setAccessible(true);
				field.set(into, method.invoke(from));
			}
		}
		return into;
	}

}