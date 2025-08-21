package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterBelanja1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja1.SipdMasterBelanja1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBelanja1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterBelanja1Entity, SipdMasterBelanja1, DataMasterBelanja1> implements SipdMasterBelanja1Repository {

	private final SipdMasterBelanja1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterBelanja1Entity, SipdMasterBelanja1, DataMasterBelanja1> repositoryOfMasterRekening() {
		return this.repository;
	}

}