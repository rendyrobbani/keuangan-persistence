package com.rendyrobbani.keuangan.persistence.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeamOfSkpd;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
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
public abstract class AbstractDataMasterTapdTeamOfSkpdEntity extends AbstractDataMasterEntity<DataMasterTapdTeamOfSkpd, String> implements DataMasterTapdTeamOfSkpd {

	@Id
	@Check(constraints = "id = concat_ws('|', tapd_id, skpd_id)")
	@Column(name = "id", length = 41, nullable = false, updatable = false)
	protected String id;

	@Column(name = "tapd_id", length = 18, nullable = false, updatable = false)
	protected String tapdId;

	@Check(constraints = "skpd_id like '%0000'")
	@Column(name = "skpd_id", length = 22, nullable = false, updatable = false)
	protected String skpdId;

	@Override
	public void create(String tapdId, String skpdId, LocalDateTime createdAt, String createdBy) {
		this.id = String.join("|", tapdId, skpdId);
		this.tapdId = tapdId;
		this.skpdId = skpdId;
		this.create(createdAt, createdBy);
	}

}