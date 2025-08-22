package com.rendyrobbani.keuangan.persistence.entity.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.DataMasterKomponen;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok.DataMasterKelompokEntity;
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
@Table(name = DataMasterKomponen.TABLE_NAME)
public class DataMasterKomponenEntity extends AbstractDataMasterKomponenEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "kelompok_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	private DataMasterKelompokEntity kelompok;

	@Override
	public DataMasterKomponen toDomain() {
		return this;
	}

}