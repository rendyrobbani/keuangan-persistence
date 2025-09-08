create or replace table data_master_tapd_team (
	id                 varchar(18)  not null,
	position           varchar(255) null,
	is_can_lock_create bit          not null,
	is_can_lock_update bit          not null,
	is_can_lock_detail bit          not null,
	is_locked          bit          not null,
	locked_at          datetime     null,
	locked_by          varchar(18)  null,
	created_at         datetime     null,
	created_by         varchar(18)  null,
	updated_at         datetime     null,
	updated_by         varchar(18)  null,
	is_deleted         bit          null,
	deleted_at         datetime     null,
	deleted_by         varchar(18)  null,
	constraint fk_data_master_tapd_team_01 foreign key (id) references data_user (id),
	constraint fk_data_master_tapd_team_02 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_tapd_team_03 foreign key (created_by) references data_user (id),
	constraint fk_data_master_tapd_team_04 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_tapd_team_05 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;