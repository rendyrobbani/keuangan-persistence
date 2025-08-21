package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.pembiayaan.pembiayaan5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterPembiayaan5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.SipdMasterPembiayaan5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan5.SipdMasterPembiayaan5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.SipdMasterPembiayaan5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterPembiayaan5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterPembiayaan5Entity, SipdMasterPembiayaan5, DataMasterPembiayaan5> implements SipdMasterPembiayaan5Repository {

	private final SipdMasterPembiayaan5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterPembiayaan5Entity, SipdMasterPembiayaan5, DataMasterPembiayaan5> repositoryOfMasterRekening() {
		return this.repository;
	}

}