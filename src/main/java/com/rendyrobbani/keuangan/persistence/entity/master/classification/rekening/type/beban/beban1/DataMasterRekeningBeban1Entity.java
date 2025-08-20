package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.base.rekening1.AbstractDataMasterRekening1Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.Checks;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataMasterRekeningBeban1.TABLE_NAME)
@Checks(value = {@Check(constraints = "id like '1%'")})
public class DataMasterRekeningBeban1Entity extends AbstractDataMasterRekening1Entity<DataMasterRekeningBeban1> implements DataMasterRekeningBeban1 {

	@Override
	public DataMasterRekeningBeban1 toDomain() {
		return this;
	}

	@Override
	public void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		if (!classification.isBeban()) throw new RuntimeException("Invalid classification");
		super.create(classification, name, createdAt, createdBy);
	}

}