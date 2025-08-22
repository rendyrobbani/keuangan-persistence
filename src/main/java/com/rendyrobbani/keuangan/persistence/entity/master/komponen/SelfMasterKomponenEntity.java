package com.rendyrobbani.keuangan.persistence.entity.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.SelfMasterKomponen;
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
@Table(name = SelfMasterKomponen.TABLE_NAME)
public class SelfMasterKomponenEntity extends AbstractSelfEntity<SelfMasterKomponen> implements SelfMasterKomponen {

	@Override
	public SelfMasterKomponen toDomain() {
		return this;
	}

}