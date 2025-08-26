package com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSignOfSkpd;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.tapd.team.DataMasterTapdTeamEntity;
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
@Table(name = DataMasterTapdSignOfSkpd.TABLE_NAME)
public class DataMasterTapdSignOfSkpdEntity extends AbstractDataMasterTapdSignOfSkpdEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "tapd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "tapd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdTeamEntity tapdTeam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "tapd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterTapdSignEntity tapdSign;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "skpd_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterOrganisasiEntity skpd;

	@Override
	public DataMasterTapdSignOfSkpd toDomain() {
		return this;
	}

}