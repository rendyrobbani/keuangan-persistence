insert into keuangan_dev.data_user (id, pangkat, name, title_prefix, title_suffix, password, date_of_birth, date_of_start, gender, number, is_pns, is_p3k, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select nip                            as id
		 , id_pangkat                     as pangkat
		 , nama                           as name
		 , gelar_1                        as title_prefix
		 , gelar_2                        as title_suffix
		 , password                       as password
		 , ttl                            as date_of_birth
		 , tmt                            as date_of_start
		 , jenis                          as gender
		 , right(nip, 3)                  as number
		 , id_pangkat regexp '[0-9][A-Z]' as is_pns
		 , id_pangkat regexp '[0-9][0-9]' as is_p3k
		 , true                           as is_locked
		 , @action_at                     as locked_at
		 , @action_by                     as locked_by
		 , @action_at                     as created_at
		 , @action_by                     as created_by
		 , null                           as updated_at
		 , null                           as updated_by
		 , true                           as is_deleted
		 , @action_at                     as deleted_at
		 , @action_by                     as deleted_by
	from espresso_2025_preproduction.data_user
	where nip like @action_by
) t
on duplicate key update pangkat       = t.pangkat
                      , name          = t.name
                      , title_prefix  = t.title_prefix
                      , title_suffix  = t.title_suffix
                      , password      = t.password
                      , date_of_birth = t.date_of_birth
                      , date_of_start = t.date_of_start
                      , gender        = t.gender
                      , number        = t.number
                      , is_pns        = t.is_pns
                      , is_p3k        = t.is_p3k
                      , is_locked     = t.is_locked
                      , locked_at     = t.locked_at
                      , locked_by     = t.locked_by
                      , created_at    = t.created_at
                      , created_by    = t.created_by
                      , updated_at    = t.updated_at
                      , updated_by    = t.updated_by
                      , is_deleted    = t.is_deleted
                      , deleted_at    = t.deleted_at
                      , deleted_by    = t.deleted_by;

insert into keuangan_dev.data_user (id, pangkat, name, title_prefix, title_suffix, password, date_of_birth, date_of_start, gender, number, is_pns, is_p3k, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select nip                                                    as id
		 , id_pangkat                                             as pangkat
		 , nama                                                   as name
		 , gelar_1                                                as title_prefix
		 , gelar_2                                                as title_suffix
		 , '12345'                                                as password
		 , ttl                                                    as date_of_birth
		 , tmt                                                    as date_of_start
		 , jenis                                                  as gender
		 , nomor                                                  as number
		 , id_pangkat regexp '[0-9][A-Z]'                         as is_pns
		 , id_pangkat regexp '[0-9][0-9]'                         as is_p3k
		 , is_kunci is null or is_kunci                           as is_locked
		 , if(is_kunci is null or is_kunci, @action_at, null)     as locked_at
		 , if(is_kunci is null or is_kunci, @action_by, null)     as locked_by
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
	from espresso_2025_preproduction.data_user
	where nip not like @action_by
) t
on duplicate key update pangkat       = t.pangkat
                      , name          = t.name
                      , title_prefix  = t.title_prefix
                      , title_suffix  = t.title_suffix
                      , password      = t.password
                      , date_of_birth = t.date_of_birth
                      , date_of_start = t.date_of_start
                      , gender        = t.gender
                      , number        = t.number
                      , is_pns        = t.is_pns
                      , is_p3k        = t.is_p3k
                      , is_locked     = t.is_locked
                      , locked_at     = t.locked_at
                      , locked_by     = t.locked_by
                      , created_at    = t.created_at
                      , created_by    = t.created_by
                      , updated_at    = t.updated_at
                      , updated_by    = t.updated_by
                      , is_deleted    = t.is_deleted
                      , deleted_at    = t.deleted_at
                      , deleted_by    = t.deleted_by;