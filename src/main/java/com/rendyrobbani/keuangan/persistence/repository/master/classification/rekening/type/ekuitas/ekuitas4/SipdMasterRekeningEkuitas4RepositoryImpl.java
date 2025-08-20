package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterRekeningEkuitas4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterRekeningEkuitas4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterRekeningEkuitas4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterRekeningEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningEkuitas4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterRekeningEkuitas4Entity, SipdMasterRekeningEkuitas4, DataMasterRekeningEkuitas4> implements SipdMasterRekeningEkuitas4Repository {

	private final SipdMasterRekeningEkuitas4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterRekeningEkuitas4Entity, SipdMasterRekeningEkuitas4, DataMasterRekeningEkuitas4> repositoryOfMasterRekening() {
		return this.repository;
	}

}