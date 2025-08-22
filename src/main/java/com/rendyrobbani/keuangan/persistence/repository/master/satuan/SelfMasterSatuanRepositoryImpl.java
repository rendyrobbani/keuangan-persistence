package com.rendyrobbani.keuangan.persistence.repository.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.satuan.SelfMasterSatuan;
import com.rendyrobbani.keuangan.core.domain.repository.master.satuan.SelfMasterSatuanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.satuan.SelfMasterSatuanEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SelfMasterSatuanRepositoryImpl extends AbstractRepository<SelfMasterSatuanEntity, SelfMasterSatuan, Long> implements SelfMasterSatuanRepository {

	private final SelfMasterSatuanJpaRepository repository;

	@Override
	protected JpaRepository<SelfMasterSatuanEntity, Long> repository() {
		return this.repository;
	}

}