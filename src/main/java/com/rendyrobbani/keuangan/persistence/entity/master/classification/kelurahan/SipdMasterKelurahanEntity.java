package com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.SipdMasterKelurahan;
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
@Table(name = SipdMasterKelurahan.TABLE_NAME)
public class SipdMasterKelurahanEntity extends AbstractSipdMasterKelurahanEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataMasterKelurahanEntity subject;

	@Override
	public SipdMasterKelurahan toDomain() {
		return this;
	}

}