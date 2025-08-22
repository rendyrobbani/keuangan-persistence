package com.rendyrobbani.keuangan.persistence.repository.master.priority.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.kegiatan.SelfMasterPriorityOfKegiatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.priority.kegiatan.SelfMasterPriorityOfKegiatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kegiatan.SelfMasterPriorityOfKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.AbstractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SelfMasterPriorityOfKegiatanRepositoryImpl extends AbstractRepository<SelfMasterPriorityOfKegiatanEntity, SelfMasterPriorityOfKegiatan, Long> implements SelfMasterPriorityOfKegiatanRepository {

	private final SelfMasterPriorityOfKegiatanJpaRepository repository;

	@Override
	protected JpaRepository<SelfMasterPriorityOfKegiatanEntity, Long> repository() {
		return this.repository;
	}

}