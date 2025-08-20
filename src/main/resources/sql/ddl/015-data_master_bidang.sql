drop table if exists data_master_bidang;

create or replace table data_master_bidang (
	id         varchar(4)   not null,
	code       varchar(4)   not null,
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
	constraint ck_data_master_bidang_01 check (id = replace(code, 'X', '0')),
	constraint ck_data_master_bidang_02 check (urusan_id = left(id, length(urusan_id))),
	constraint fk_data_master_bidang_01 foreign key (urusan_id) references data_master_urusan (id),
	constraint fk_data_master_bidang_02 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_bidang_03 foreign key (created_by) references data_user (id),
	constraint fk_data_master_bidang_04 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_bidang_05 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_bidang_01 unique key (urusan_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;