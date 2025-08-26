create or replace table data_master_tapd_sign (
	id         varchar(18)  not null,
	number     smallint     null,
	position   varchar(255) null,
	is_locked  bit          not null,
	locked_at  datetime     null,
	locked_by  varchar(18)  null,
	created_at datetime     null,
	created_by varchar(18)  null,
	updated_at datetime     null,
	updated_by varchar(18)  null,
	is_deleted bit          null,
	deleted_at datetime     null,
	deleted_by varchar(18)  null,
	constraint fk_data_master_tapd_sign_01 foreign key (id) references data_user (id),
	constraint fk_data_master_tapd_sign_02 foreign key (id) references data_master_tapd_team (id),
	constraint fk_data_master_tapd_sign_03 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_tapd_sign_04 foreign key (created_by) references data_user (id),
	constraint fk_data_master_tapd_sign_05 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_tapd_sign_06 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;