package com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.SipdMasterBidang;
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
@Table(name = SipdMasterBidang.TABLE_NAME)
public class SipdMasterBidangEntity extends AbstractSipdMasterBidangEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	})
	private DataMasterBidangEntity subject;

	@Override
	public SipdMasterBidang toDomain() {
		return this;
	}

}