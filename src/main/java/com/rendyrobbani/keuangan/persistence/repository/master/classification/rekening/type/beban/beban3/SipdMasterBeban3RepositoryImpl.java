package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.DataMasterBeban3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.SipdMasterBeban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban3.SipdMasterBeban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.SipdMasterBeban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBeban3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterBeban3Entity, SipdMasterBeban3, DataMasterBeban3> implements SipdMasterBeban3Repository {

	private final SipdMasterBeban3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterBeban3Entity, SipdMasterBeban3, DataMasterBeban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}