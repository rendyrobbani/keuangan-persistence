drop table if exists data_master_rekening_beban4;

create or replace table data_master_rekening_beban4 (
	id           varchar(9)   not null,
	code         varchar(9)   not null,
	name         varchar(510) not null,
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
	rekening1_id varchar(1)   not null,
	rekening2_id varchar(3)   not null,
	rekening3_id varchar(6)   not null,
	constraint ck_data_master_rekening_beban4_01 check (id = code),
	constraint ck_data_master_rekening_beban4_02 check (rekening1_id = left(id, length(rekening1_id))),
	constraint ck_data_master_rekening_beban4_03 check (rekening2_id = left(id, length(rekening2_id))),
	constraint ck_data_master_rekening_beban4_04 check (rekening3_id = left(id, length(rekening3_id))),
	constraint fk_data_master_rekening_beban4_01 foreign key (rekening1_id) references data_master_rekening_beban1 (id),
	constraint fk_data_master_rekening_beban4_02 foreign key (rekening1_id, rekening2_id) references data_master_rekening_beban2 (rekening1_id, id),
	constraint fk_data_master_rekening_beban4_03 foreign key (rekening1_id, rekening2_id, rekening3_id) references data_master_rekening_beban3 (rekening1_id, rekening2_id, id),
	constraint fk_data_master_rekening_beban4_04 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_rekening_beban4_05 foreign key (created_by) references data_user (id),
	constraint fk_data_master_rekening_beban4_06 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_rekening_beban4_07 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_rekening_beban4_01 unique key (rekening1_id, rekening2_id, rekening3_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;