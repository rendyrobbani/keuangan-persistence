package com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
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
@Table(name = DataMasterOrganisasi.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"skpd_id", "unit_id"})})
public class DataMasterOrganisasiEntity extends AbstractDataMasterOrganisasiEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "bidang1_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterBidangEntity bidang1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "bidang2_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterBidangEntity bidang2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "bidang3_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterBidangEntity bidang3;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "head_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity head;

	@Override
	public DataMasterOrganisasi toDomain() {
		return this;
	}

}