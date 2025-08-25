package com.rendyrobbani.keuangan.persistence.repository.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;
import com.rendyrobbani.keuangan.core.domain.repository.master.tapd.team.DataMasterTapdTeamRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.team.DataMasterTapdTeamEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractDataMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.DataMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DataMasterTapdTeamRepositoryImpl extends AbstractDataMasterRepository<DataMasterTapdTeamEntity, DataMasterTapdTeam, String> implements DataMasterTapdTeamRepository {

	private final DataMasterTapdTeamJpaRepository repository;

	@Override
	protected DataMasterJpaRepository<DataMasterTapdTeamEntity, DataMasterTapdTeam, String> repositoryOfMaster() {
		return this.repository;
	}

}