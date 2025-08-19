drop table if exists logs_user;

create or replace table logs_user (
	id            bigint       not null auto_increment,
	pangkat       char(2)      not null,
	name          varchar(255) not null,
	title_prefix  varchar(255) null,
	title_suffix  varchar(255) null,
	password      varchar(255) not null,
	date_of_birth date         not null,
	date_of_start date         null,
	gender        tinyint      not null,
	number        smallint     not null,
	is_pns        bit          not null,
	is_p3k        bit          not null,
	is_locked     bit          not null,
	is_deleted    bit          not null,
	logged_at     datetime     not null,
	logged_by     varchar(18)  not null,
	subject_id    varchar(18)  not null,
	constraint ck_logs_user_01 check (pangkat regexp '[1-4][A-D]|4E|0[1-9]|1[0-7]'),
	constraint ck_logs_user_02 check (gender between 1 and 2),
	constraint ck_logs_user_03 check (number between 1 and 999),
	constraint ck_logs_user_04 check (pangkat regexp '[1-4][A-D]|4E'),
	constraint ck_logs_user_05 check (pangkat regexp '0[1-9]|1[0-7]'),
	constraint fk_logs_user_01 foreign key (subject_id) references data_user (id),
	constraint fk_logs_user_02 foreign key (logged_by) references data_user (id),
	primary key (id)
) engine = innodb
  charset = utf8mb4
  collate = utf8mb4_unicode_ci;