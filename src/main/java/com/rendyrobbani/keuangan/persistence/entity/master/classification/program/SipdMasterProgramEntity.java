package com.rendyrobbani.keuangan.persistence.entity.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.SipdMasterProgram;
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
@Table(name = SipdMasterProgram.TABLE_NAME)
public class SipdMasterProgramEntity extends AbstractSipdMasterProgramEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	private DataMasterProgramEntity subject;

	@Override
	public SipdMasterProgram toDomain() {
		return this;
	}

}