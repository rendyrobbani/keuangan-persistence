package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.DataMasterAset4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset4.SipdMasterAset4;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset4.SipdMasterAset4Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.SipdMasterAset4Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.AbstractSipdMasterRekening4Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening4.SipdMasterRekening4JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterAset4RepositoryImpl extends AbstractSipdMasterRekening4Repository<SipdMasterAset4Entity, SipdMasterAset4, DataMasterAset4> implements SipdMasterAset4Repository {

	private final SipdMasterAset4JpaRepository repository;

	@Override
	protected SipdMasterRekening4JpaRepository<SipdMasterAset4Entity, SipdMasterAset4, DataMasterAset4> repositoryOfMasterRekening() {
		return this.repository;
	}

}