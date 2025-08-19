drop table if exists data_master_kecamatan;

create or replace table data_master_kecamatan (
	id           varchar(8)   not null,
	code         varchar(8)   not null,
	name         varchar(255) not null,
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
	provinsi_id  varchar(2)   not null,
	kabupaten_id varchar(5)   not null,
	constraint ck_data_master_kecamatan_01 check (id = code),
	constraint fk_data_master_kecamatan_01 foreign key (provinsi_id) references data_master_provinsi (id),
	constraint fk_data_master_kecamatan_02 foreign key (provinsi_id, kabupaten_id) references data_master_kabupaten (provinsi_id, id),
	constraint fk_data_master_kecamatan_03 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_kecamatan_04 foreign key (created_by) references data_user (id),
	constraint fk_data_master_kecamatan_05 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_kecamatan_06 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_kecamatan_01 unique key (provinsi_id, kabupaten_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;