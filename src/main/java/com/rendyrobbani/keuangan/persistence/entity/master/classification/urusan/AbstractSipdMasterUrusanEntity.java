package com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.SipdMasterUrusan;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.AbstractSipdMasterClassifcationEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractSipdMasterUrusanEntity extends AbstractSipdMasterClassifcationEntity<SipdMasterUrusan, DataMasterUrusan> implements SipdMasterUrusan {

	@Id
	@Column(name = "id", nullable = false)
	protected Long id;

	@Column(name = "code", length = 1, nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "subject_id", length = 1, nullable = false)
	protected String subjectId;

}