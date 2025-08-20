package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.SipdMasterRekeningAset2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset2.SipdMasterRekeningAset2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.SipdMasterRekeningAset2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningAset2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterRekeningAset2Entity, SipdMasterRekeningAset2, DataMasterRekeningAset2> implements SipdMasterRekeningAset2Repository {

	private final SipdMasterRekeningAset2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterRekeningAset2Entity, SipdMasterRekeningAset2, DataMasterRekeningAset2> repositoryOfMasterRekening() {
		return this.repository;
	}

}