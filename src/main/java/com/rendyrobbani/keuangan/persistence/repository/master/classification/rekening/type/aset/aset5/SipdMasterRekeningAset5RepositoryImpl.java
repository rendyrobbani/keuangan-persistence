package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.DataMasterRekeningAset5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.SipdMasterRekeningAset5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset5.SipdMasterRekeningAset5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.SipdMasterRekeningAset5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningAset5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterRekeningAset5Entity, SipdMasterRekeningAset5, DataMasterRekeningAset5> implements SipdMasterRekeningAset5Repository {

	private final SipdMasterRekeningAset5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterRekeningAset5Entity, SipdMasterRekeningAset5, DataMasterRekeningAset5> repositoryOfMasterRekening() {
		return this.repository;
	}

}