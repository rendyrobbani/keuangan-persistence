package com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
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
@Table(name = DataMasterBidang.TABLE_NAME)
public class DataMasterBidangEntity extends AbstractDataMasterBidangEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "urusan_id", insertable = false, updatable = false)
	protected DataMasterUrusanEntity urusan;

	@Override
	public DataMasterBidang toDomain() {
		return this;
	}

}