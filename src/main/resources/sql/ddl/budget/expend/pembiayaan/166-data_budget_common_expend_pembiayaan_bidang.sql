create or replace table data_budget_common_expend_pembiayaan_bidang (
	id         varchar(255)   not null,
	skpd_id    varchar(22)    not null,
	unit_id    varchar(22)    not null,
	urusan_id  varchar(1)     not null,
	bidang_id  varchar(4)     not null,
	total      decimal(38, 2) not null,
	sebelum    decimal(38, 2) not null,
	created_at datetime       null,
	created_by varchar(18)    null,
	updated_at datetime       null,
	updated_by varchar(18)    null,
	is_deleted bit            null,
	deleted_at datetime       null,
	deleted_by varchar(18)    null,
	constraint ck_data_budget_common_expend_pembiayaan_bidang_01 check (id = concat_ws('|', unit_id, bidang_id)),
	constraint fk_data_budget_common_expend_pembiayaan_bidang_01 foreign key (skpd_id) references data_master_organisasi (id),
	constraint fk_data_budget_common_expend_pembiayaan_bidang_02 foreign key (skpd_id, unit_id) references data_master_organisasi (skpd_id, unit_id),
	constraint fk_data_budget_common_expend_pembiayaan_bidang_03 foreign key (urusan_id) references data_master_urusan (id),
	constraint fk_data_budget_common_expend_pembiayaan_bidang_04 foreign key (urusan_id, bidang_id) references data_master_bidang (urusan_id, id),
	constraint fk_data_budget_common_expend_pembiayaan_bidang_05 foreign key (created_by) references data_user (id),
	constraint fk_data_budget_common_expend_pembiayaan_bidang_06 foreign key (updated_by) references data_user (id),
	constraint fk_data_budget_common_expend_pembiayaan_bidang_07 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;