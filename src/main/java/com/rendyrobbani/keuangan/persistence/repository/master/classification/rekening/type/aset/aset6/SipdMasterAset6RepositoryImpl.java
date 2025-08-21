package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.DataMasterAset6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset6.SipdMasterAset6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset6.SipdMasterAset6Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.SipdMasterAset6Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.AbstractSipdMasterRekening6Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening6.SipdMasterRekening6JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterAset6RepositoryImpl extends AbstractSipdMasterRekening6Repository<SipdMasterAset6Entity, SipdMasterAset6, DataMasterAset6> implements SipdMasterAset6Repository {

	private final SipdMasterAset6JpaRepository repository;

	@Override
	protected SipdMasterRekening6JpaRepository<SipdMasterAset6Entity, SipdMasterAset6, DataMasterAset6> repositoryOfMasterRekening() {
		return this.repository;
	}

}