create or replace table self_master_priority_of_kabupaten (
	id         bigint      not null auto_increment,
	created_at datetime    null,
	created_by varchar(18) null,
	constraint fk_self_master_priority_of_kabupaten_01 foreign key (created_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;