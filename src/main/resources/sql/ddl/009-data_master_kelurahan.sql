drop table if exists data_master_kelurahan;

create or replace table data_master_kelurahan (
	id           varchar(13)  not null,
	code         varchar(13)  not null,
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
	kecamatan_id varchar(8)   not null,
	constraint ck_data_master_kelurahan_01 check (id = code),
	constraint ck_data_master_kelurahan_02 check (provinsi_id = left(id, length(provinsi_id))),
	constraint ck_data_master_kelurahan_03 check (kabupaten_id = left(id, length(kabupaten_id))),
	constraint ck_data_master_kelurahan_04 check (kecamatan_id = left(id, length(kecamatan_id))),
	constraint fk_data_master_kelurahan_01 foreign key (provinsi_id) references data_master_provinsi (id),
	constraint fk_data_master_kelurahan_02 foreign key (provinsi_id, kabupaten_id) references data_master_kabupaten (provinsi_id, id),
	constraint fk_data_master_kelurahan_03 foreign key (provinsi_id, kabupaten_id, kecamatan_id) references data_master_kecamatan (provinsi_id, kabupaten_id, id),
	constraint fk_data_master_kelurahan_04 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_kelurahan_05 foreign key (created_by) references data_user (id),
	constraint fk_data_master_kelurahan_06 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_kelurahan_07 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_kelurahan_01 unique key (provinsi_id, kabupaten_id, kecamatan_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;