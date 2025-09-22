create or replace table data_budget_common_expend_pembiayaan_organisasi (
	id         varchar(255)    not null,
	skpd_id    varchar(22)    not null,
	unit_id    varchar(22)    not null,
	total      decimal(38, 2) not null,
	sebelum    decimal(38, 2) not null,
	is_locked  bit            not null,
	locked_at  datetime       null,
	locked_by  varchar(18)    null,
	created_at datetime       null,
	created_by varchar(18)    null,
	updated_at datetime       null,
	updated_by varchar(18)    null,
	is_deleted bit            null,
	deleted_at datetime       null,
	deleted_by varchar(18)    null,
	constraint ck_data_budget_common_expend_pembiayaan_organisasi_01 check (id = unit_id),
	constraint fk_data_budget_common_expend_pembiayaan_organisasi_01 foreign key (locked_by) references data_user (id),
	constraint fk_data_budget_common_expend_pembiayaan_organisasi_02 foreign key (skpd_id) references data_master_organisasi (id),
	constraint fk_data_budget_common_expend_pembiayaan_organisasi_03 foreign key (skpd_id, unit_id) references data_master_organisasi (skpd_id, unit_id),
	constraint fk_data_budget_common_expend_pembiayaan_organisasi_04 foreign key (created_by) references data_user (id),
	constraint fk_data_budget_common_expend_pembiayaan_organisasi_05 foreign key (updated_by) references data_user (id),
	constraint fk_data_budget_common_expend_pembiayaan_organisasi_06 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;