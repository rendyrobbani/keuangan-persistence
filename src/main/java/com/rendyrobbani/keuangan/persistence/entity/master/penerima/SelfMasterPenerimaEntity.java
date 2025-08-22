package com.rendyrobbani.keuangan.persistence.entity.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.penerima.SelfMasterPenerima;
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
@Table(name = SelfMasterPenerima.TABLE_NAME)
public class SelfMasterPenerimaEntity extends AbstractSelfEntity<SelfMasterPenerima> implements SelfMasterPenerima {

	@Override
	public SelfMasterPenerima toDomain() {
		return this;
	}

}