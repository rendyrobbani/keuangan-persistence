package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterEkuitas4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterEkuitas4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterEkuitas4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterEkuitas4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterEkuitas4Entity, SipdMasterEkuitas4, DataMasterEkuitas4> implements SipdMasterEkuitas4Repository {

	private final SipdMasterEkuitas4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterEkuitas4Entity, SipdMasterEkuitas4, DataMasterEkuitas4> repositoryOfMasterRekening() {
		return this.repository;
	}

}