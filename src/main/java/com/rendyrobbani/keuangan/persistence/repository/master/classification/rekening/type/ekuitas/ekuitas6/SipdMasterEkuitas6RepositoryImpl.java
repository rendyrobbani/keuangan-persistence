package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterEkuitas6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterEkuitas6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterEkuitas6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterEkuitas6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterEkuitas6Entity, SipdMasterEkuitas6, DataMasterEkuitas6> implements SipdMasterEkuitas6Repository {

	private final SipdMasterEkuitas6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterEkuitas6Entity, SipdMasterEkuitas6, DataMasterEkuitas6> repositoryOfMasterRekening() {
		return this.repository;
	}

}