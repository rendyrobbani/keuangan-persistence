package com.rendyrobbani.keuangan.persistence.entity.master.priority.nasional;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.nasional.DataMasterPriorityOfNasional;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.AbstractDataMasterPriorityEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataMasterPriorityOfNasional.TABLE_NAME)
public class DataMasterPriorityOfNasionalEntity extends AbstractDataMasterPriorityEntity<DataMasterPriorityOfNasional> implements DataMasterPriorityOfNasional {

	@Column(name = "from_year", nullable = false)
	protected Short fromYear;

	@Column(name = "into_year", nullable = false)
	protected Short intoYear;

	@Override
	public DataMasterPriorityOfNasional toDomain() {
		return this;
	}

	@Override
	public void create(Long id, Short year, Short fromYear, Short intoYear, Byte number, String name, String sipdName, LocalDateTime createdAt, String createdBy) {
		this.fromYear = fromYear;
		this.intoYear = intoYear;
		super.create(id, year, number, name, sipdName, createdAt, createdBy);
	}

	@Override
	public void update(Short year, Short fromYear, Short intoYear, Byte number, String name, String sipdName, LocalDateTime updatedAt, String updatedBy) {
		this.fromYear = fromYear;
		this.intoYear = intoYear;
		super.update(year, number, name, sipdName, updatedAt, updatedBy);
	}

}