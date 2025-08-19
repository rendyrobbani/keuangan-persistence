package com.rendyrobbani.keuangan.persistence.entity.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.vo.classification.program.ProgramClassification;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractDataMasterClassifcationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataMasterProgramEntity extends AbstractDataMasterClassifcationEntity<DataMasterProgram> implements DataMasterProgram {

	@Id
	@Check(constraints = "id = replace(code, 'X', '0')")
	@Column(name = "id", length = 7, nullable = false)
	protected String id;

	@Column(name = "code", length = 7, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "urusan_id", length = 1, nullable = false)
	protected String urusanId;

	@Column(name = "bidang_id", length = 4, nullable = false)
	protected String bidangId;

	@Override
	public void create(ProgramClassification classification, String name, LocalDateTime createdAt, String createdBy) {
		this.id = classification.programCode().replaceAll("X", "0");
		this.code = classification.programCode();
		this.name = name;
		this.urusanId = classification.urusanCode().replaceAll("X", "0");
		this.bidangId = classification.bidangCode().replaceAll("X", "0");
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.create(createdAt, createdBy);
	}

}