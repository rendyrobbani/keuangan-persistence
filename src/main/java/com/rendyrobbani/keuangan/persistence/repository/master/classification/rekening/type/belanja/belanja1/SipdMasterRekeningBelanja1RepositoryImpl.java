package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.DataMasterRekeningBelanja1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterRekeningBelanja1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja1.SipdMasterRekeningBelanja1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterRekeningBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBelanja1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterRekeningBelanja1Entity, SipdMasterRekeningBelanja1, DataMasterRekeningBelanja1> implements SipdMasterRekeningBelanja1Repository {

	private final SipdMasterRekeningBelanja1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterRekeningBelanja1Entity, SipdMasterRekeningBelanja1, DataMasterRekeningBelanja1> repositoryOfMasterRekening() {
		return this.repository;
	}

}