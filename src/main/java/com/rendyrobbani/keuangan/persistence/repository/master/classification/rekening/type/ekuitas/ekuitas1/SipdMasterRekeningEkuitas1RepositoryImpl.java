package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterRekeningEkuitas1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterRekeningEkuitas1;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterRekeningEkuitas1Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterRekeningEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.AbstractSipdMasterRekening1Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening1.SipdMasterRekening1JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningEkuitas1RepositoryImpl extends AbstractSipdMasterRekening1Repository<SipdMasterRekeningEkuitas1Entity, SipdMasterRekeningEkuitas1, DataMasterRekeningEkuitas1> implements SipdMasterRekeningEkuitas1Repository {

	private final SipdMasterRekeningEkuitas1JpaRepository repository;

	@Override
	protected SipdMasterRekening1JpaRepository<SipdMasterRekeningEkuitas1Entity, SipdMasterRekeningEkuitas1, DataMasterRekeningEkuitas1> repositoryOfMasterRekening() {
		return this.repository;
	}

}