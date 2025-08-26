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
	@Column(name = "id", nullable = false, updatable = false)
	protected String id;

	@Column(name = "tapd_id", nullable = false, updatable = false)
	protected String tapdId;

	@Check(constraints = "skpd_id like '%0000'")
	@Column(name = "skpd_id", nullable = false, updatable = false)
	protected String skpdId;

	@Override
	public void create(String id, String tapdId, String skpdId, LocalDateTime createdAt, String createdBy) {
		this.id = String.join("|", tapdId, skpdId);
		this.tapdId = tapdId;
		this.skpdId = skpdId;
		this.create(createdAt, createdBy);
	}

}