package com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
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
@Table(name = DataMasterTapdSign.TABLE_NAME)
public class DataMasterTapdSignEntity extends AbstractDataMasterTapdSignEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity user;

	@Override
	public DataMasterTapdSign toDomain() {
		return this;
	}

}