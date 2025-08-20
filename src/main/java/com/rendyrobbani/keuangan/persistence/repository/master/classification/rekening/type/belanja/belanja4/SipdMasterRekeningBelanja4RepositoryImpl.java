package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.DataMasterRekeningBelanja4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterRekeningBelanja4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja4.SipdMasterRekeningBelanja4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterRekeningBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBelanja4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterRekeningBelanja4Entity, SipdMasterRekeningBelanja4, DataMasterRekeningBelanja4> implements SipdMasterRekeningBelanja4Repository {

	private final SipdMasterRekeningBelanja4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterRekeningBelanja4Entity, SipdMasterRekeningBelanja4, DataMasterRekeningBelanja4> repositoryOfMasterRekening() {
		return this.repository;
	}

}