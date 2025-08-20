package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.DataMasterRekeningBelanja2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterRekeningBelanja2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja2.SipdMasterRekeningBelanja2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterRekeningBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBelanja2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterRekeningBelanja2Entity, SipdMasterRekeningBelanja2, DataMasterRekeningBelanja2> implements SipdMasterRekeningBelanja2Repository {

	private final SipdMasterRekeningBelanja2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterRekeningBelanja2Entity, SipdMasterRekeningBelanja2, DataMasterRekeningBelanja2> repositoryOfMasterRekening() {
		return this.repository;
	}

}