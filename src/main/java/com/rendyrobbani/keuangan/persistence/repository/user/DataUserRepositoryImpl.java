package com.rendyrobbani.keuangan.persistence.repository.user;

import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.repository.user.DataUserRepository;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataUserRepositoryImpl extends AbstractRepository<DataUserEntity, DataUser, String> implements DataUserRepository {

	private final DataUserJpaRepository repository;

	@Override
	protected JpaRepository<DataUserEntity, String> repository() {
		return repository;
	}

}