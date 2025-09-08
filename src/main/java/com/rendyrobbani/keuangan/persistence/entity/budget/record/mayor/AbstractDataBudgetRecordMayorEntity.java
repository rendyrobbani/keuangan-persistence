package com.rendyrobbani.keuangan.persistence.entity.budget.record.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.mayor.DataBudgetRecordMayor;
import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.persistence.converter.JabatanStatusConverter;
import com.rendyrobbani.keuangan.persistence.entity.budget.record.AbstractDataBudgetRecordEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataBudgetRecordMayorEntity extends AbstractDataBudgetRecordEntity<DataBudgetRecordMayor, DataMasterMayor, Byte> implements DataBudgetRecordMayor {

	@Id
	@Check(constraints = "id = concat_ws('|', jadwal_id, lpad(common_id, 4, '0'))")
	@Column(name = "id", nullable = false, updatable = false)
	protected String id;

	@Column(name = "common_id", nullable = false, updatable = false)
	protected Byte commonId;

	@Convert(converter = JabatanStatusConverter.class)
	@Column(name = "status", nullable = false)
	protected JabatanStatus status;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "title_prefix")
	protected String titlePrefix;

	@Column(name = "title_suffix")
	protected String titleSuffix;

}