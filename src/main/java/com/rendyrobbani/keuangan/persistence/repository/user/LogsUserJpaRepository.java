package com.rendyrobbani.keuangan.persistence.repository.user;

import com.rendyrobbani.keuangan.persistence.entity.user.LogsUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsUserJpaRepository extends JpaRepository<LogsUserEntity, Long> {

}