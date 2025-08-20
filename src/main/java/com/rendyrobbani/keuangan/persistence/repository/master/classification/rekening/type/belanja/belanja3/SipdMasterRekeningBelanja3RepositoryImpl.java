package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.DataMasterRekeningBelanja3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.SipdMasterRekeningBelanja3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja3.SipdMasterRekeningBelanja3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.SipdMasterRekeningBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBelanja3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterRekeningBelanja3Entity, SipdMasterRekeningBelanja3, DataMasterRekeningBelanja3> implements SipdMasterRekeningBelanja3Repository {

	private final SipdMasterRekeningBelanja3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterRekeningBelanja3Entity, SipdMasterRekeningBelanja3, DataMasterRekeningBelanja3> repositoryOfMasterRekening() {
		return this.repository;
	}

}