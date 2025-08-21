package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterEkuitas1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterEkuitas1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterEkuitas1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterEkuitas1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterEkuitas1Entity, SipdMasterEkuitas1, DataMasterEkuitas1> implements SipdMasterEkuitas1Repository {

	private final SipdMasterEkuitas1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterEkuitas1Entity, SipdMasterEkuitas1, DataMasterEkuitas1> repositoryOfMasterRekening() {
		return this.repository;
	}

}