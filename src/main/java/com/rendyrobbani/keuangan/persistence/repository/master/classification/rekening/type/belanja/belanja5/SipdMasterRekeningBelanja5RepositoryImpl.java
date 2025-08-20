package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.DataMasterRekeningBelanja5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterRekeningBelanja5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja5.SipdMasterRekeningBelanja5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterRekeningBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBelanja5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterRekeningBelanja5Entity, SipdMasterRekeningBelanja5, DataMasterRekeningBelanja5> implements SipdMasterRekeningBelanja5Repository {

	private final SipdMasterRekeningBelanja5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterRekeningBelanja5Entity, SipdMasterRekeningBelanja5, DataMasterRekeningBelanja5> repositoryOfMasterRekening() {
		return this.repository;
	}

}