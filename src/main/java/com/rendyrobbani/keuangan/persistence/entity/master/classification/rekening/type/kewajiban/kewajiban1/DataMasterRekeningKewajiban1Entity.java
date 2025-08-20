package com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1;
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

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataMasterRekeningKewajiban1.TABLE_NAME)
@Checks(value = {@Check(constraints = "id like '2%'")})
public class DataMasterRekeningKewajiban1Entity extends AbstractDataMasterRekening1Entity<DataMasterRekeningKewajiban1> implements DataMasterRekeningKewajiban1 {

	@Override
	public DataMasterRekeningKewajiban1 toDomain() {
		return this;
	}

}