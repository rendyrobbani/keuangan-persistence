drop table if exists data_master_program;

create or replace table data_master_program (
	id         varchar(7)   not null,
	code       varchar(7)   not null,
	name       varchar(255) not null,
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
	urusan_id  varchar(1)   not null,
	bidang_id  varchar(4)   not null,
	constraint ck_data_master_program_01 check (id = replace(code, 'X', '0')),
	constraint fk_data_master_program_01 foreign key (urusan_id) references data_master_urusan (id),
	constraint fk_data_master_program_02 foreign key (urusan_id, bidang_id) references data_master_bidang (urusan_id, id),
	constraint fk_data_master_program_03 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_program_04 foreign key (created_by) references data_user (id),
	constraint fk_data_master_program_05 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_program_06 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_program_01 unique key (urusan_id, bidang_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;