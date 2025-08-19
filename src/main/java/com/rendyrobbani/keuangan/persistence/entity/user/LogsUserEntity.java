package com.rendyrobbani.keuangan.persistence.entity.user;

import com.rendyrobbani.keuangan.core.domain.entity.user.LogsUser;
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
@Table(name = LogsUser.TABLE_NAME)
public class LogsUserEntity extends AbstractLogsUserEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	private DataUserEntity subject;

	@Override
	public LogsUser toDomain() {
		return this;
	}

}