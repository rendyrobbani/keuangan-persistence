package com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.SipdMasterOrganisasi;
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
@Table(name = SipdMasterOrganisasi.TABLE_NAME)
public class SipdMasterOrganisasiEntity extends AbstractSipdMasterOrganisasiEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	private DataMasterOrganisasiEntity subject;

	@Override
	public SipdMasterOrganisasi toDomain() {
		return this;
	}

}