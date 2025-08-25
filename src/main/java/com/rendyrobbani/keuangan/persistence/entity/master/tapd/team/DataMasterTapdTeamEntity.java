package com.rendyrobbani.keuangan.persistence.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
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
@Table(name = DataMasterTapdTeam.TABLE_NAME)
public class DataMasterTapdTeamEntity extends AbstractDataMasterTapdTeamEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity user;

	@Override
	public DataMasterTapdTeam toDomain() {
		return this;
	}

}