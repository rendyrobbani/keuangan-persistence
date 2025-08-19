package com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.DataMasterKabupaten;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
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
@Table(name = DataMasterKabupaten.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"provinsi_id", "id"})})
public class DataMasterKabupatenEntity extends AbstractDataMasterKabupatenEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "provinsi_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterProvinsiEntity provinsi;

	@Override
	public DataMasterKabupaten toDomain() {
		return this;
	}

}