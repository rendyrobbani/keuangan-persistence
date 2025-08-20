package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.ekuitas.ekuitas2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterRekeningEkuitas2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterRekeningEkuitas2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterRekeningEkuitas2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterRekeningEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningEkuitas2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterRekeningEkuitas2Entity, SipdMasterRekeningEkuitas2, DataMasterRekeningEkuitas2> implements SipdMasterRekeningEkuitas2Repository {

	private final SipdMasterRekeningEkuitas2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterRekeningEkuitas2Entity, SipdMasterRekeningEkuitas2, DataMasterRekeningEkuitas2> repositoryOfMasterRekening() {
		return this.repository;
	}

}