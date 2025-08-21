package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.DataMasterAset2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2.SipdMasterAset2;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.aset.aset2.SipdMasterAset2Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.SipdMasterAset2Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.AbstractSipdMasterRekening2Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening2.SipdMasterRekening2JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterAset2RepositoryImpl extends AbstractSipdMasterRekening2Repository<SipdMasterAset2Entity, SipdMasterAset2, DataMasterAset2> implements SipdMasterAset2Repository {

	private final SipdMasterAset2JpaRepository repository;

	@Override
	protected SipdMasterRekening2JpaRepository<SipdMasterAset2Entity, SipdMasterAset2, DataMasterAset2> repositoryOfMasterRekening() {
		return this.repository;
	}

}