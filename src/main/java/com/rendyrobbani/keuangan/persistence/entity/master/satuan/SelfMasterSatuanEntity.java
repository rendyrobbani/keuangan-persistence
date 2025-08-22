package com.rendyrobbani.keuangan.persistence.entity.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.satuan.SelfMasterSatuan;
import com.rendyrobbani.keuangan.persistence.entity.AbstractSelfEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = SelfMasterSatuan.TABLE_NAME)
public class SelfMasterSatuanEntity extends AbstractSelfEntity<SelfMasterSatuan> implements SelfMasterSatuan {

	@Override
	public SelfMasterSatuan toDomain() {
		return this;
	}

}