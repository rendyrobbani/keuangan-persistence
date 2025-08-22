package com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.SipdMasterProvinsi;
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
@Table(name = SipdMasterProvinsi.TABLE_NAME)
public class SipdMasterProvinsiEntity extends AbstractSipdMasterProvinsiEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterProvinsiEntity subject;

	@Override
	public SipdMasterProvinsi toDomain() {
		return this;
	}

}