package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterRekeningEkuitas5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterRekeningEkuitas5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterRekeningEkuitas5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterRekeningEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningEkuitas5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterRekeningEkuitas5Entity, SipdMasterRekeningEkuitas5, DataMasterRekeningEkuitas5> implements SipdMasterRekeningEkuitas5Repository {

	private final SipdMasterRekeningEkuitas5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterRekeningEkuitas5Entity, SipdMasterRekeningEkuitas5, DataMasterRekeningEkuitas5> repositoryOfMasterRekening() {
		return this.repository;
	}

}