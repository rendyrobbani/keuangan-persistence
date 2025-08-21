package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterBelanja4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja4.SipdMasterBelanja4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBelanja4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterBelanja4Entity, SipdMasterBelanja4, DataMasterBelanja4> implements SipdMasterBelanja4Repository {

	private final SipdMasterBelanja4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterBelanja4Entity, SipdMasterBelanja4, DataMasterBelanja4> repositoryOfMasterRekening() {
		return this.repository;
	}

}