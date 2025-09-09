create or replace table data_budget_record_mayor (
	common_id    tinyint      not null,
	status       tinyint      not null,
	name         varchar(255) not null,
	title_prefix varchar(255) null,
	title_suffix varchar(255) null,
	created_at   datetime     null,
	created_by   varchar(18)  null,
	updated_at   datetime     null,
	updated_by   varchar(18)  null,
	is_deleted   bit          null,
	deleted_at   datetime     null,
	deleted_by   varchar(18)  null,
	id           varchar(255) not null,
	jadwal_id    bigint       not null,
	constraint ck_data_budget_record_mayor_01 check (id = concat_ws('|', jadwal_id, lpad(common_id, 4, '0'))),
	constraint fk_data_budget_record_mayor_01 foreign key (jadwal_id) references data_budget_jadwal (id),
	constraint fk_data_budget_record_mayor_02 foreign key (common_id) references data_master_mayor (id),
	constraint fk_data_budget_record_mayor_03 foreign key (created_by) references data_user (id),
	constraint fk_data_budget_record_mayor_04 foreign key (updated_by) references data_user (id),
	constraint fk_data_budget_record_mayor_05 foreign key (deleted_by) references data_user (id),
	constraint uk_data_budget_record_mayor_01 unique key (jadwal_id, common_id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;