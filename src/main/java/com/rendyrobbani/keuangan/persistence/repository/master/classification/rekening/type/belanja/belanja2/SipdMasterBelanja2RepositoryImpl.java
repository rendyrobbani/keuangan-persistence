package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterBelanja2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja2.SipdMasterBelanja2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBelanja2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterBelanja2Entity, SipdMasterBelanja2, DataMasterBelanja2> implements SipdMasterBelanja2Repository {

	private final SipdMasterBelanja2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterBelanja2Entity, SipdMasterBelanja2, DataMasterBelanja2> repositoryOfMasterRekening() {
		return this.repository;
	}

}