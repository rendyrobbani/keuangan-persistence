package com.rendyrobbani.keuangan.persistence.repository.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeamOfSkpd;
import com.rendyrobbani.keuangan.core.domain.repository.master.tapd.team.DataMasterTapdTeamOfSkpdRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.team.DataMasterTapdTeamOfSkpdEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterTapdTeamOfSkpdRepositoryImpl extends AbstractDataMasterRepository<DataMasterTapdTeamOfSkpdEntity, DataMasterTapdTeamOfSkpd, String> implements DataMasterTapdTeamOfSkpdRepository {

	private final DataMasterTapdTeamOfSkpdJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterTapdTeamOfSkpdEntity, DataMasterTapdTeamOfSkpd, String> repositoryOfMaster() {
		return this.repository;
	}

}