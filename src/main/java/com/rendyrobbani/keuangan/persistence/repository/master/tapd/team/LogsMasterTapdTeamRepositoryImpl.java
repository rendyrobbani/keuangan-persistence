package com.rendyrobbani.keuangan.persistence.repository.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.LogsMasterTapdTeam;
import com.rendyrobbani.keuangan.core.domain.repository.master.tapd.team.LogsMasterTapdTeamRepository;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.team.LogsMasterTapdTeamEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.AbstractLogsMasterRepository;
import com.rendyrobbani.keuangan.persistence.repository.master.LogsMasterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LogsMasterTapdTeamRepositoryImpl extends AbstractLogsMasterRepository<LogsMasterTapdTeamEntity, LogsMasterTapdTeam, DataMasterTapdTeam, String> implements LogsMasterTapdTeamRepository {

	private final LogsMasterTapdTeamJpaRepository repository;

	@Override
	protected LogsMasterJpaRepository<LogsMasterTapdTeamEntity, LogsMasterTapdTeam, DataMasterTapdTeam, String> repositoryOfMaster() {
		return this.repository;
	}

}