package com.rendyrobbani.keuangan.persistence.repository.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.LogsMasterTapdTeam;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.team.LogsMasterTapdTeamEntity;
import com.rendyrobbani.keuangan.persistence.repository.master.LogsMasterJpaRepository;

public interface LogsMasterTapdTeamJpaRepository extends LogsMasterJpaRepository<LogsMasterTapdTeamEntity, LogsMasterTapdTeam, DataMasterTapdTeam, String> {

}