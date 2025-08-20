package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset3.SipdMasterRekeningAset3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset3.SipdMasterRekeningAset3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.SipdMasterRekeningAset3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningAset3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterRekeningAset3Entity, SipdMasterRekeningAset3, DataMasterRekeningAset3> implements SipdMasterRekeningAset3Repository {

	private final SipdMasterRekeningAset3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterRekeningAset3Entity, SipdMasterRekeningAset3, DataMasterRekeningAset3> repositoryOfMasterRekening() {
		return this.repository;
	}

}