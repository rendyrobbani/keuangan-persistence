drop table if exists data_master_rekening_belanja2;

create or replace table data_master_rekening_belanja2 (
	id           varchar(3)   not null,
	code         varchar(3)   not null,
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
	rekening1_id varchar(1)   not null,
	constraint ck_data_master_rekening_belanja2_01 check (id = code),
	constraint ck_data_master_rekening_belanja2_02 check (rekening1_id = left(id, length(rekening1_id))),
	constraint fk_data_master_rekening_belanja2_01 foreign key (rekening1_id) references data_master_rekening_belanja1 (id),
	constraint fk_data_master_rekening_belanja2_02 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_rekening_belanja2_03 foreign key (created_by) references data_user (id),
	constraint fk_data_master_rekening_belanja2_04 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_rekening_belanja2_05 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_rekening_belanja2_01 unique key (rekening1_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;