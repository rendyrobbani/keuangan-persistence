package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterEkuitas2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterEkuitas2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterEkuitas2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterEkuitas2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterEkuitas2Entity, SipdMasterEkuitas2, DataMasterEkuitas2> implements SipdMasterEkuitas2Repository {

	private final SipdMasterEkuitas2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterEkuitas2Entity, SipdMasterEkuitas2, DataMasterEkuitas2> repositoryOfMasterRekening() {
		return this.repository;
	}

}