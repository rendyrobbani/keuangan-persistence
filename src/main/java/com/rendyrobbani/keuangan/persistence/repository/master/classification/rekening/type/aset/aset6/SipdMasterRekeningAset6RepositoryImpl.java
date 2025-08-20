package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.DataMasterRekeningAset6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.SipdMasterRekeningAset6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset6.SipdMasterRekeningAset6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.SipdMasterRekeningAset6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningAset6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterRekeningAset6Entity, SipdMasterRekeningAset6, DataMasterRekeningAset6> implements SipdMasterRekeningAset6Repository {

	private final SipdMasterRekeningAset6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterRekeningAset6Entity, SipdMasterRekeningAset6, DataMasterRekeningAset6> repositoryOfMasterRekening() {
		return this.repository;
	}

}