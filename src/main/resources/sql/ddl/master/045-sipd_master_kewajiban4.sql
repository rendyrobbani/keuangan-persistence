create or replace table sipd_master_kewajiban4 (
	id         bigint       not null,
	code       varchar(9)   not null,
	name       varchar(510) not null,
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
	subject_id varchar(9)   not null,
	constraint ck_sipd_master_kewajiban4_01 check (subject_id = code),
	constraint fk_sipd_master_kewajiban4_01 foreign key (subject_id) references data_master_kewajiban4 (id),
	constraint fk_sipd_master_kewajiban4_02 foreign key (locked_by) references data_user (id),
	constraint fk_sipd_master_kewajiban4_03 foreign key (created_by) references data_user (id),
	constraint fk_sipd_master_kewajiban4_04 foreign key (updated_by) references data_user (id),
	constraint fk_sipd_master_kewajiban4_05 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;