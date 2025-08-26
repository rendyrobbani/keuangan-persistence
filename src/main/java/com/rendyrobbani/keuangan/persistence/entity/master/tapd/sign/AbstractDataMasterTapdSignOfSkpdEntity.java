package com.rendyrobbani.keuangan.persistence.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSignOfSkpd;
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
public abstract class AbstractDataMasterTapdSignOfSkpdEntity extends AbstractDataMasterEntity<DataMasterTapdSignOfSkpd, String> implements DataMasterTapdSignOfSkpd {

	@Id
	@Check(constraints = "id = concat_ws('|', sign_id, skpd_id)")
	@Column(name = "id", length = 44, nullable = false, updatable = false)
	protected String id;

	@Column(name = "team_id", length = 18, nullable = false, updatable = false)
	protected String teamId;

	@Column(name = "sign_id", length = 21, nullable = false, updatable = false)
	protected String signId;

	@Check(constraints = "skpd_id like '%0000'")
	@Column(name = "skpd_id", length = 22, nullable = false, updatable = false)
	protected String skpdId;

	@Override
	public void create(String teamId, String signId, String skpdId, LocalDateTime createdAt, String createdBy) {
		this.id = String.join("|", signId, skpdId);
		this.teamId = teamId;
		this.signId = signId;
		this.skpdId = skpdId;
		this.create(createdAt, createdBy);
	}

}