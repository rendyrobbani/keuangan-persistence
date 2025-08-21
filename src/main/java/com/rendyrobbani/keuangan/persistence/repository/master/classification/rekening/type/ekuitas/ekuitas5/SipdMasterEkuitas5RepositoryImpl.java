package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterEkuitas5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterEkuitas5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterEkuitas5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterEkuitas5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterEkuitas5Entity, SipdMasterEkuitas5, DataMasterEkuitas5> implements SipdMasterEkuitas5Repository {

	private final SipdMasterEkuitas5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterEkuitas5Entity, SipdMasterEkuitas5, DataMasterEkuitas5> repositoryOfMasterRekening() {
		return this.repository;
	}

}