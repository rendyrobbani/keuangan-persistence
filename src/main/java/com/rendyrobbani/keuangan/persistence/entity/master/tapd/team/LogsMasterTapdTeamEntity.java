package com.rendyrobbani.keuangan.persistence.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.LogsMasterTapdTeam;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = LogsMasterTapdTeam.TABLE_NAME)
public class LogsMasterTapdTeamEntity extends AbstractLogsMasterTapdTeamEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdTeamEntity subject;

	@Override
	public LogsMasterTapdTeam toDomain() {
		return this;
	}

}