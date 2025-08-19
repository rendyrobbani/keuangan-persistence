drop table if exists logs_master_organisasi;

create or replace table logs_master_organisasi (
	id          bigint       not null auto_increment,
	code        varchar(22)  not null,
	name        varchar(255) not null,
	main_bidang tinyint      not null,
	is_locked   bit          not null,
	is_deleted  bit          not null,
	logged_at   datetime     not null,
	logged_by   varchar(18)  not null,
	skpd_id     varchar(22)  not null,
	unit_id     varchar(22)  not null,
	bidang1_id  varchar(4)   not null,
	bidang2_id  varchar(4)   not null,
	bidang3_id  varchar(4)   not null,
	head_id     varchar(22)  null,
    head_status tinyint      null,
	subject_id  varchar(22)  not null,
	constraint ck_logs_master_organisasi_01 check (skpd_id = concat(left(unit_id, 18), '0000')),
	constraint ck_logs_master_organisasi_02 check (main_bidang between 1 and 3),
	constraint ck_logs_master_organisasi_03 check (head_status is null or head_status between 1 and 5),
	constraint ck_logs_master_organisasi_04 check (subject_id = unit_id),
	constraint fk_logs_master_organisasi_01 foreign key (bidang1_id) references data_master_bidang (id),
	constraint fk_logs_master_organisasi_02 foreign key (bidang2_id) references data_master_bidang (id),
	constraint fk_logs_master_organisasi_03 foreign key (bidang3_id) references data_master_bidang (id),
	constraint fk_logs_master_organisasi_04 foreign key (head_id) references data_user (id),
	constraint fk_logs_master_organisasi_05 foreign key (subject_id) references data_master_organisasi (id),
	constraint fk_logs_master_organisasi_06 foreign key (logged_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;