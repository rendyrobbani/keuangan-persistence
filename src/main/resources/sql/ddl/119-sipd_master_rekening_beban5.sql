drop table if exists sipd_master_rekening_beban5;

create or replace table sipd_master_rekening_beban5 (
	id         bigint       not null,
	code       varchar(1)   not null,
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
	subject_id varchar(1)   not null,
	constraint ck_sipd_master_rekening_beban5_01 check (subject_id = code),
	constraint fk_sipd_master_rekening_beban5_01 foreign key (subject_id) references data_master_rekening_beban5 (id),
	constraint fk_sipd_master_rekening_beban5_02 foreign key (locked_by) references data_user (id),
	constraint fk_sipd_master_rekening_beban5_03 foreign key (created_by) references data_user (id),
	constraint fk_sipd_master_rekening_beban5_04 foreign key (updated_by) references data_user (id),
	constraint fk_sipd_master_rekening_beban5_05 foreign key (deleted_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;