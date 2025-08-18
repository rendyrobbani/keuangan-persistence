package com.rendyrobbani.keuangan.persistence.entity;

import com.rendyrobbani.keuangan.core.domain.entity.BaseEntity;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serial;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode
@MappedSuperclass
public abstract class AbstractBaseEntity<DOMAIN extends BaseEntity<ID>, ID> implements BaseEntity<ID> {

	@Serial
	private final static long serialVersionUID = 1L;

	public abstract DOMAIN toDomain();

}