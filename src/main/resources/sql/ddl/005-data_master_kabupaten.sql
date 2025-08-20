drop table if exists data_master_kabupaten;

create or replace table data_master_kabupaten (
	id          varchar(5)   not null,
	code        varchar(5)   not null,
	name        varchar(255) not null,
	is_locked   bit          not null,
	locked_at   datetime     null,
	locked_by   varchar(18)  null,
	created_at  datetime     null,
	created_by  varchar(18)  null,
	updated_at  datetime     null,
	updated_by  varchar(18)  null,
	is_deleted  bit          null,
	deleted_at  datetime     null,
	deleted_by  varchar(18)  null,
	provinsi_id varchar(2)   not null,
	constraint ck_data_master_kabupaten_01 check (id = code),
	constraint ck_data_master_kabupaten_02 check (provinsi_id = left(id, length(provinsi_id))),
	constraint fk_data_master_kabupaten_01 foreign key (provinsi_id) references data_master_provinsi (id),
	constraint fk_data_master_kabupaten_02 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_kabupaten_03 foreign key (created_by) references data_user (id),
	constraint fk_data_master_kabupaten_04 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_kabupaten_05 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_kabupaten_01 unique key (provinsi_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;