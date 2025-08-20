package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset1.SipdMasterRekeningAset1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset1.SipdMasterRekeningAset1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.SipdMasterRekeningAset1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningAset1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterRekeningAset1Entity, SipdMasterRekeningAset1, DataMasterRekeningAset1> implements SipdMasterRekeningAset1Repository {

	private final SipdMasterRekeningAset1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterRekeningAset1Entity, SipdMasterRekeningAset1, DataMasterRekeningAset1> repositoryOfMasterRekening() {
		return this.repository;
	}

}