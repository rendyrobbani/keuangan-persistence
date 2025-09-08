create or replace table data_master_tapd_team_of_skpd (
	id         varchar(41) not null,
	created_at datetime    null,
	created_by varchar(18) null,
	updated_at datetime    null,
	updated_by varchar(18) null,
	is_deleted bit         null,
	deleted_at datetime    null,
	deleted_by varchar(18) null,
	tapd_id    varchar(18) not null,
	skpd_id    varchar(22) not null,
	constraint ck_data_master_tapd_team_of_skpd_01 check (id = concat_ws('|', tapd_id, skpd_id)),
	constraint ck_data_master_tapd_team_of_skpd_02 check (skpd_id like '%0000'),
	constraint fk_data_master_tapd_team_of_skpd_01 foreign key (tapd_id) references data_user (id),
	constraint fk_data_master_tapd_team_of_skpd_02 foreign key (tapd_id) references data_master_tapd_team (id),
	constraint fk_data_master_tapd_team_of_skpd_03 foreign key (skpd_id) references data_master_organisasi (id),
	constraint fk_data_master_tapd_team_of_skpd_04 foreign key (created_by) references data_user (id),
	constraint fk_data_master_tapd_team_of_skpd_05 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_tapd_team_of_skpd_06 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;