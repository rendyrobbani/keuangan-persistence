package com.rendyrobbani.keuangan.persistence.repository.master.classification.kecamatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.DataMasterKecamatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.SipdMasterKecamatan;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.kecamatan.SipdMasterKecamatanRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.SipdMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractSipdMasterClassificationRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.SipdMasterClassificationJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;



@Repository
@RequiredArgsConstructor

public class DataMasterKecamatanRepositoryImpl extends AbstractSipdMasterClassificationRepository<SipdMasterKecamatanEntity, SipdMasterKecamatan, DataMasterKecamatan> implements SipdMasterKecamatanRepository {

	private final DataMasterKecamatanJpaRepository repository;

	@Override
	protected SipdMasterClassificationJpaRepository<SipdMasterKecamatanEntity, SipdMasterKecamatan, DataMasterKecamatan> repositoryOfMasterClassifcation() {
		return this.repository;
	}

}