package com.rendyrobbani.keuangan.persistence.repository.user;

import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataUserJpaRepository extends JpaRepository<DataUserEntity, String> {

}