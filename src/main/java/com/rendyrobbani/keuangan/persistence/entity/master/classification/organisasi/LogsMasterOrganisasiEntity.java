package com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.LogsMasterOrganisasi;
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
@Table(name = LogsMasterOrganisasi.TABLE_NAME)
public class LogsMasterOrganisasiEntity extends AbstractLogsMasterOrganisasiEntity {

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterOrganisasiEntity subject;

	@Override
	public LogsMasterOrganisasi toDomain() {
		return this;
	}

}