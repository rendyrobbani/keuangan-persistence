package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.belanja.belanja3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.DataMasterBelanja3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja3.SipdMasterBelanja3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja3.SipdMasterBelanja3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.SipdMasterBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterBelanja3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterBelanja3Entity, SipdMasterBelanja3, DataMasterBelanja3> implements SipdMasterBelanja3Repository {

	private final SipdMasterBelanja3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterBelanja3Entity, SipdMasterBelanja3, DataMasterBelanja3> repositoryOfMasterRekening() {
		return this.repository;
	}

}