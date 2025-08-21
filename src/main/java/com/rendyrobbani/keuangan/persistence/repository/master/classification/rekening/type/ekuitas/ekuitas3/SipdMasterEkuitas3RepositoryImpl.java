package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterEkuitas3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterEkuitas3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterEkuitas3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterEkuitas3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterEkuitas3Entity, SipdMasterEkuitas3, DataMasterEkuitas3> implements SipdMasterEkuitas3Repository {

	private final SipdMasterEkuitas3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterEkuitas3Entity, SipdMasterEkuitas3, DataMasterEkuitas3> repositoryOfMasterRekening() {
		return this.repository;
	}

}