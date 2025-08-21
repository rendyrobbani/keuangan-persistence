package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterBelanja5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja5.SipdMasterBelanja5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBelanja5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterBelanja5Entity, SipdMasterBelanja5, DataMasterBelanja5> implements SipdMasterBelanja5Repository {

	private final SipdMasterBelanja5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterBelanja5Entity, SipdMasterBelanja5, DataMasterBelanja5> repositoryOfMasterRekening() {
		return this.repository;
	}

}