package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.DataMasterRekeningAset4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.SipdMasterRekeningAset4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset4.SipdMasterRekeningAset4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.SipdMasterRekeningAset4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningAset4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterRekeningAset4Entity, SipdMasterRekeningAset4, DataMasterRekeningAset4> implements SipdMasterRekeningAset4Repository {

	private final SipdMasterRekeningAset4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterRekeningAset4Entity, SipdMasterRekeningAset4, DataMasterRekeningAset4> repositoryOfMasterRekening() {
		return this.repository;
	}

}