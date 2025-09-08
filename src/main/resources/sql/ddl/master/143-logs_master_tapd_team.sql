create or replace table logs_master_tapd_team (
	id                 bigint       not null auto_increment,
	position           varchar(255) null,
	is_can_lock_create bit          not null,
	is_can_lock_update bit          not null,
	is_can_lock_detail bit          not null,
	is_locked          bit          not null,
	is_deleted         bit          not null,
	logged_at          datetime     not null,
	logged_by          varchar(18)  not null,
	subject_id         varchar(18) not null,
	constraint fk_logs_master_tapd_team_01 foreign key (subject_id) references data_master_tapd_team (id),
	constraint fk_logs_master_tapd_team_02 foreign key (logged_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;