package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterBelanja6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja6.SipdMasterBelanja6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBelanja6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterBelanja6Entity, SipdMasterBelanja6, DataMasterBelanja6> implements SipdMasterBelanja6Repository {

	private final SipdMasterBelanja6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterBelanja6Entity, SipdMasterBelanja6, DataMasterBelanja6> repositoryOfMasterRekening() {
		return this.repository;
	}

}