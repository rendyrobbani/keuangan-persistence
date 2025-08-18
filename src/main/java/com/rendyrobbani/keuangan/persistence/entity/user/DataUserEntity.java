package com.rendyrobbani.keuangan.persistence.entity.user;

import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.PROTECTED)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = DataUser.TABLE_NAME)
public class DataUserEntity extends AbstractDataUserEntity {

	@Override
	public DataUser toDomain() {
		return this;
	}

}