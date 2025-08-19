package com.rendyrobbani.keuangan.persistence.entity.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
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
@Table(name = DataMasterProgram.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"urusan_id", "bidang_id", "id"})})
public class DataMasterProgramEntity extends AbstractDataMasterProgramEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "urusan_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterUrusanEntity urusan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "urusan_id", referencedColumnName = "urusan_id", insertable = false, updatable = false),
			@JoinColumn(name = "bidang_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterBidangEntity bidang;

	@Override
	public DataMasterProgram toDomain() {
		return this;
	}

}