package com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
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
@Table(name = DataMasterSubfungsi.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(columnNames = {"fungsi_id", "id"})})
public class DataMasterSubfungsiEntity extends AbstractDataMasterSubfungsiEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fungsi_id", referencedColumnName = "id", insertable = false, updatable = false)
	private DataMasterFungsiEntity fungsi;

	@Override
	public DataMasterSubfungsi toDomain() {
		return this;
	}

}