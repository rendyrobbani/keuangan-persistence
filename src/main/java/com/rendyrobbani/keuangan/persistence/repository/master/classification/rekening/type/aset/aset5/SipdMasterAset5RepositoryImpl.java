package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.DataMasterAset5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset5.SipdMasterAset5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset5.SipdMasterAset5Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.SipdMasterAset5Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.AbstractSipdMasterRekening5Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening5.SipdMasterRekening5JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterAset5RepositoryImpl extends AbstractSipdMasterRekening5Repository<SipdMasterAset5Entity, SipdMasterAset5, DataMasterAset5> implements SipdMasterAset5Repository {

	private final SipdMasterAset5JpaRepository repository;

	@Override
	protected SipdMasterRekening5JpaRepository<SipdMasterAset5Entity, SipdMasterAset5, DataMasterAset5> repositoryOfMasterRekening() {
		return this.repository;
	}

}