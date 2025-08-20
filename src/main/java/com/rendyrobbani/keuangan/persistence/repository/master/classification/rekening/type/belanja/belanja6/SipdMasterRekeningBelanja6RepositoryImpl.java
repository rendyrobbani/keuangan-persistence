package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterRekeningBelanja6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja6.SipdMasterRekeningBelanja6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterRekeningBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBelanja6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterRekeningBelanja6Entity, SipdMasterRekeningBelanja6, DataMasterRekeningBelanja6> implements SipdMasterRekeningBelanja6Repository {

	private final SipdMasterRekeningBelanja6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterRekeningBelanja6Entity, SipdMasterRekeningBelanja6, DataMasterRekeningBelanja6> repositoryOfMasterRekening() {
		return this.repository;
	}

}