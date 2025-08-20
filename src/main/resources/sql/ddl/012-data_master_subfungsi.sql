drop table if exists data_master_subfungsi;

create or replace table data_master_subfungsi (
	id         varchar(5)   not null,
	code       varchar(5)   not null,
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
	fungsi_id  varchar(2)   not null,
	constraint ck_data_master_subfungsi_01 check (id = code),
	constraint ck_data_master_subfungsi_02 check (fungsi_id = left(id, length(fungsi_id))),
	constraint fk_data_master_subfungsi_01 foreign key (fungsi_id) references data_master_fungsi (id),
	constraint fk_data_master_subfungsi_02 foreign key (locked_by) references data_user (id),
	constraint fk_data_master_subfungsi_03 foreign key (created_by) references data_user (id),
	constraint fk_data_master_subfungsi_04 foreign key (updated_by) references data_user (id),
	constraint fk_data_master_subfungsi_05 foreign key (deleted_by) references data_user (id),
	constraint uk_data_master_subfungsi_01 unique key (fungsi_id, id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;