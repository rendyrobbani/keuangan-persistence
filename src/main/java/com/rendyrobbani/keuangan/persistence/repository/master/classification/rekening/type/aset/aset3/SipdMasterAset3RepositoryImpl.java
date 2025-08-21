package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.DataMasterAset3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.SipdMasterAset3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset3.SipdMasterAset3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.SipdMasterAset3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterAset3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterAset3Entity, SipdMasterAset3, DataMasterAset3> implements SipdMasterAset3Repository {

	private final SipdMasterAset3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterAset3Entity, SipdMasterAset3, DataMasterAset3> repositoryOfMasterRekening() {
		return this.repository;
	}

}