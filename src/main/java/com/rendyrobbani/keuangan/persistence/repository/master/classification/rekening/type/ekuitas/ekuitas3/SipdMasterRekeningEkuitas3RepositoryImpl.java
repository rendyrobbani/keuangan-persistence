package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterRekeningEkuitas3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterRekeningEkuitas3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterRekeningEkuitas3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterRekeningEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningEkuitas3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterRekeningEkuitas3Entity, SipdMasterRekeningEkuitas3, DataMasterRekeningEkuitas3> implements SipdMasterRekeningEkuitas3Repository {

	private final SipdMasterRekeningEkuitas3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterRekeningEkuitas3Entity, SipdMasterRekeningEkuitas3, DataMasterRekeningEkuitas3> repositoryOfMasterRekening() {
		return this.repository;
	}

}