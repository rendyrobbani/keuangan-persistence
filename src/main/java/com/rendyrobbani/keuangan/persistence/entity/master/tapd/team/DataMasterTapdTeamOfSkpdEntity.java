package com.rendyrobbani.keuangan.persistence.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeamOfSkpd;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
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
@Table(name = DataMasterTapdTeamOfSkpd.TABLE_NAME)
public class DataMasterTapdTeamOfSkpdEntity extends AbstractDataMasterTapdTeamOfSkpdEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "tapd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "tapd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdTeamEntity tapd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "skpd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterOrganisasiEntity skpd;

	@Override
	public DataMasterTapdTeamOfSkpd toDomain() {
		return this;
	}

}