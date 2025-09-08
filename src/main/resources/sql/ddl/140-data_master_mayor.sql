create or replace table data_master_mayor (
	id           tinyint      not null,
	status       tinyint      not null,
	name         varchar(255) not null,
	title_prefix varchar(255) null,
	title_suffix varchar(255) null,
	is_locked    bit          not null,
	locked_at    datetime     null,
	locked_by    varchar(18)  null,
	created_at   datetime     null,
	created_by   varchar(18)  null,
	updated_at   datetime     null,
	updated_by   varchar(18)  null,
	is_deleted   bit          null,
	deleted_at   datetime     null,
	deleted_by   varchar(18)  null,
	constraint ck_data_master_mayor_01 check (id = 1),
	constraint fk_data_master_mayor_01 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_mayor_02 foreign key (created_by) references data_user (id),
	constraint fk_data_master_mayor_03 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_mayor_04 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;