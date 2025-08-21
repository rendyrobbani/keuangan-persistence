package com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.DataMasterSumber;
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
@Table(name = DataMasterSumber.TABLE_NAME)
public class DataMasterSumberEntity extends AbstractDataMasterSumberEntity {

	@Override
	public DataMasterSumber toDomain() {
		return this;
	}

}