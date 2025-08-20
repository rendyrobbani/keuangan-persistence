package com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.type.beban.beban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.DataMasterRekeningBeban3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3.SipdMasterRekeningBeban3;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.beban.beban3.SipdMasterRekeningBeban3Repository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.SipdMasterRekeningBeban3Entity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.AbstractSipdMasterRekening3Repository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.rekening.base.rekening3.SipdMasterRekening3JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SipdMasterRekeningBeban3RepositoryImpl extends AbstractSipdMasterRekening3Repository<SipdMasterRekeningBeban3Entity, SipdMasterRekeningBeban3, DataMasterRekeningBeban3> implements SipdMasterRekeningBeban3Repository {

	private final SipdMasterRekeningBeban3JpaRepository repository;

	@Override
	protected SipdMasterRekening3JpaRepository<SipdMasterRekeningBeban3Entity, SipdMasterRekeningBeban3, DataMasterRekeningBeban3> repositoryOfMasterRekening() {
		return this.repository;
	}

}