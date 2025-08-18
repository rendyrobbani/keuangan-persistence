package com.rendyrobbani.keuangan.persistence.repository.user;

import com.rendyrobbani.keuangan.core.domain.entity.user.LogsUser;
import com.rendyrobbani.keuangan.core.domain.repository.user.LogsUserRepository;
import com.rendyrobbani.keuangan.persistence.entity.user.LogsUserEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LogsUserRepositoryImpl extends AbstractRepository<LogsUserEntity, LogsUser, Long> implements LogsUserRepository {

	private final LogsUserJpaRepository repository;

	@Override
	protected JpaRepository<LogsUserEntity, Long> repository() {
		return repository;
	}

}