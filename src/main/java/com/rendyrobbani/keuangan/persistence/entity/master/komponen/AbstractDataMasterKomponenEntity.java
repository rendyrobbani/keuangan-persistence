package com.rendyrobbani.keuangan.persistence.entity.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.DataMasterKomponen;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;
import com.rendyrobbani.keuangan.persistence.converter.KomponenTypeConverter;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataMasterKomponenEntity extends AbstractDataMasterEntity<DataMasterKomponen, Long> implements DataMasterKomponen {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

	@Convert(converter = KomponenTypeConverter.class)
	@Column(name = "type", nullable = false)
	protected KomponenType type;

	@Column(name = "code", nullable = false)
	protected String code;

	@Column(name = "name", nullable = false)
	protected String name;

	@Column(name = "spec", length = 2550, nullable = false)
	protected String spec;

	@Column(name = "unit", nullable = false)
	protected String unit;

	@Column(name = "price", nullable = false)
	protected BigDecimal price;

	@Column(name = "is_pdn", nullable = false)
	protected boolean isPDN;

	@Column(name = "tkdn_value", nullable = false)
	protected Float tkdnValue;

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "locked_at")
	protected LocalDateTime lockedAt;

	@Column(name = "locked_by", length = 18)
	protected String lockedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "locked_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity lockedByAsDataUser;

	@Check(constraints = "length(kelompok_id) = 17")
	@Column(name = "kelompok_id", nullable = false)
	protected String kelompokId;

	@Column(name = "rekening_id", length = 2550)
	protected String rekeningId;

	@Override
	public void lock(LocalDateTime lockedAt, String lockedBy) {
		this.isLocked = true;
		this.lockedAt = lockedAt;
		this.lockedBy = lockedBy;
	}

	@Override
	public void unlock(LocalDateTime updatedAt, String updatedBy) {
		this.isLocked = false;
		this.lockedAt = null;
		this.lockedBy = null;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	@Override
	public void delete(LocalDateTime deletedAt, String deletedBy) {
		lock(deletedAt, deletedBy);
		super.delete(deletedAt, deletedBy);
	}

	@Override
	public void create(Long id, KomponenType type, String code, String name, String spec, String unit, BigDecimal price, boolean isPDN, Float tkdnValue, String kelompokId, String rekeningId, LocalDateTime createdAt, String createdBy) {
		this.id = id;
		this.type = type;
		this.code = code;
		this.name = name;
		this.spec = spec;
		this.unit = unit;
		this.price = price;
		this.isPDN = isPDN;
		this.tkdnValue = tkdnValue;
		this.kelompokId = kelompokId;
		this.rekeningId = rekeningId;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(KomponenType type, String code, String name, String spec, String unit, BigDecimal price, boolean isPDN, Float tkdnValue, String kelompokId, String rekeningId, LocalDateTime updatedAt, String updatedBy) {
		this.type = type;
		this.code = code;
		this.name = name;
		this.spec = spec;
		this.unit = unit;
		this.price = price;
		this.isPDN = isPDN;
		this.tkdnValue = tkdnValue;
		this.kelompokId = kelompokId;
		this.rekeningId = rekeningId;
		this.update(updatedAt, updatedBy);
	}

}