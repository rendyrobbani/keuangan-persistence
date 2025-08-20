package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterRekeningEkuitas6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterRekeningEkuitas6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterRekeningEkuitas6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterRekeningEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningEkuitas6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterRekeningEkuitas6Entity, SipdMasterRekeningEkuitas6, DataMasterRekeningEkuitas6> implements SipdMasterRekeningEkuitas6Repository {

	private final SipdMasterRekeningEkuitas6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterRekeningEkuitas6Entity, SipdMasterRekeningEkuitas6, DataMasterRekeningEkuitas6> repositoryOfMasterRekening() {
		return this.repository;
	}

}