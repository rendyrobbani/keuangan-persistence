package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.DataMasterAset1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.SipdMasterAset1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset1.SipdMasterAset1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.SipdMasterAset1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterAset1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterAset1Entity, SipdMasterAset1, DataMasterAset1> implements SipdMasterAset1Repository {

	private final SipdMasterAset1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterAset1Entity, SipdMasterAset1, DataMasterAset1> repositoryOfMasterRekening() {
		return this.repository;
	}

}