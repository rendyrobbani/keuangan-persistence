package com.rendyrobbani.keuangan.persistence.entity.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.penerima.DataMasterPenerima;
import com.rendyrobbani.keuangan.core.domain.vo.PenerimaJenis;
import com.rendyrobbani.keuangan.persistence.converter.PenerimaJenisConverter;
import com.rendyrobbani.keuangan.persistence.entity.master.AbstractDataMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import jakarta.persistence.*;
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
@MappedSuperclass
public abstract class AbstractDataMasterPenerimaEntity extends AbstractDataMasterEntity<DataMasterPenerima, Long> implements DataMasterPenerima {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	protected Long id;

	@Column(name = "name", nullable = false)
	protected String name;

	@Convert(converter = PenerimaJenisConverter.class)
	@Column(name = "jenis", nullable = false)
	protected PenerimaJenis jenis;

	@Column(name = "address")
	protected String address;

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
	public void create(Long id, String name, PenerimaJenis jenis, String address, LocalDateTime createdAt, String createdBy) {
		this.id = id;
		this.name = name;
		this.jenis = jenis;
		this.address = address;
		this.create(createdAt, createdBy);
	}

	@Override
	public void update(String name, PenerimaJenis jenis, String address, LocalDateTime updatedAt, String updatedBy) {
		this.name = name;
		this.jenis = jenis;
		this.address = address;
		this.update(updatedAt, updatedBy);
	}

}