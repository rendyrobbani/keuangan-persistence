package com.rendyrobbani.keuangan.persistence.entity.user;

import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
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
@Table(name = DataUser.TABLE_NAME)
public class DataUserEntity extends AbstractDataUserEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "locked_by", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataUserEntity lockedByAsDataUser;

	@Override
	public DataUser toDomain() {
		return this;
	}

}