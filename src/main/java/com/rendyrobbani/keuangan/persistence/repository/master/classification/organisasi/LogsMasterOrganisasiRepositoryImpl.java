package com.rendyrobbani.keuangan.persistence.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.LogsMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.organisasi.LogsMasterOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.LogsMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.classification.AbstractLogsMasterClassificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LogsMasterOrganisasiRepositoryImpl extends AbstractLogsMasterClassificationRepository<LogsMasterOrganisasiEntity, LogsMasterOrganisasi, DataMasterOrganisasi> implements LogsMasterOrganisasiRepository {

	private final LogsMasterOrganisasiJpaRepository repository;

	@Override
	protected JpaRepository<LogsMasterOrganisasiEntity, Long> repository() {
		return repository;
	}

}