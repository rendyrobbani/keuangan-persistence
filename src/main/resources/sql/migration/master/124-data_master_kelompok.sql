insert into keuangan_dev.data_master_kelompok (id, code, name, type, level, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, kelompok1_id, kelompok2_id, kelompok3_id, kelompok4_id, kelompok5_id, kelompok6_id)
select *
from (
	select kode                                                                                                          as id
		 , kode                                                                                                          as code
		 , nama                                                                                                          as name
		 , case when tipe = 'SSH' then 1 when tipe = 'HSPK' then 2 when tipe = 'ASB' then 3 when tipe = 'SBU' then 4 end as type
		 , 6                                                                                                             as level
		 , false                                                                                                         as is_locked
		 , null                                                                                                          as locked_at
		 , null                                                                                                          as locked_by
		 , @action_at                                                                                                    as created_at
		 , @action_by                                                                                                    as created_by
		 , null                                                                                                          as updated_at
		 , null                                                                                                          as updated_by
		 , is_deleted is null or is_deleted                                                                              as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null)                                                        as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null)                                                        as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))                                                                     as kelompok1_id
		 , if(length(kode) < 3, null, left(kode, 3))                                                                     as kelompok2_id
		 , if(length(kode) < 6, null, left(kode, 6))                                                                     as kelompok3_id
		 , if(length(kode) < 9, null, left(kode, 9))                                                                     as kelompok4_id
		 , if(length(kode) < 12, null, left(kode, 12))                                                                   as kelompok5_id
		 , if(length(kode) < 17, null, left(kode, 17))                                                                   as kelompok6_id
	from espresso_2025_preproduction.data_master_kelompok6
	union
	select kode                                                                                                          as id
		 , kode                                                                                                          as code
		 , nama                                                                                                          as name
		 , case when tipe = 'SSH' then 1 when tipe = 'HSPK' then 2 when tipe = 'ASB' then 3 when tipe = 'SBU' then 4 end as type
		 , 5                                                                                                             as level
		 , false                                                                                                         as is_locked
		 , null                                                                                                          as locked_at
		 , null                                                                                                          as locked_by
		 , @action_at                                                                                                    as created_at
		 , @action_by                                                                                                    as created_by
		 , null                                                                                                          as updated_at
		 , null                                                                                                          as updated_by
		 , is_deleted is null or is_deleted                                                                              as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null)                                                        as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null)                                                        as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))                                                                     as kelompok1_id
		 , if(length(kode) < 3, null, left(kode, 3))                                                                     as kelompok2_id
		 , if(length(kode) < 6, null, left(kode, 6))                                                                     as kelompok3_id
		 , if(length(kode) < 9, null, left(kode, 9))                                                                     as kelompok4_id
		 , if(length(kode) < 12, null, left(kode, 12))                                                                   as kelompok5_id
		 , if(length(kode) < 17, null, left(kode, 17))                                                                   as kelompok6_id
	from espresso_2025_preproduction.data_master_kelompok5
	union
	select kode                                                                                                          as id
		 , kode                                                                                                          as code
		 , nama                                                                                                          as name
		 , case when tipe = 'SSH' then 1 when tipe = 'HSPK' then 2 when tipe = 'ASB' then 3 when tipe = 'SBU' then 4 end as type
		 , 4                                                                                                             as level
		 , false                                                                                                         as is_locked
		 , null                                                                                                          as locked_at
		 , null                                                                                                          as locked_by
		 , @action_at                                                                                                    as created_at
		 , @action_by                                                                                                    as created_by
		 , null                                                                                                          as updated_at
		 , null                                                                                                          as updated_by
		 , is_deleted is null or is_deleted                                                                              as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null)                                                        as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null)                                                        as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))                                                                     as kelompok1_id
		 , if(length(kode) < 3, null, left(kode, 3))                                                                     as kelompok2_id
		 , if(length(kode) < 6, null, left(kode, 6))                                                                     as kelompok3_id
		 , if(length(kode) < 9, null, left(kode, 9))                                                                     as kelompok4_id
		 , if(length(kode) < 12, null, left(kode, 12))                                                                   as kelompok5_id
		 , if(length(kode) < 17, null, left(kode, 17))                                                                   as kelompok6_id
	from espresso_2025_preproduction.data_master_kelompok4
	union
	select kode                                                                                                          as id
		 , kode                                                                                                          as code
		 , nama                                                                                                          as name
		 , case when tipe = 'SSH' then 1 when tipe = 'HSPK' then 2 when tipe = 'ASB' then 3 when tipe = 'SBU' then 4 end as type
		 , 3                                                                                                             as level
		 , false                                                                                                         as is_locked
		 , null                                                                                                          as locked_at
		 , null                                                                                                          as locked_by
		 , @action_at                                                                                                    as created_at
		 , @action_by                                                                                                    as created_by
		 , null                                                                                                          as updated_at
		 , null                                                                                                          as updated_by
		 , is_deleted is null or is_deleted                                                                              as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null)                                                        as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null)                                                        as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))                                                                     as kelompok1_id
		 , if(length(kode) < 3, null, left(kode, 3))                                                                     as kelompok2_id
		 , if(length(kode) < 6, null, left(kode, 6))                                                                     as kelompok3_id
		 , if(length(kode) < 9, null, left(kode, 9))                                                                     as kelompok4_id
		 , if(length(kode) < 12, null, left(kode, 12))                                                                   as kelompok5_id
		 , if(length(kode) < 17, null, left(kode, 17))                                                                   as kelompok6_id
	from espresso_2025_preproduction.data_master_kelompok3
	union
	select kode                                                                                                          as id
		 , kode                                                                                                          as code
		 , nama                                                                                                          as name
		 , case when tipe = 'SSH' then 1 when tipe = 'HSPK' then 2 when tipe = 'ASB' then 3 when tipe = 'SBU' then 4 end as type
		 , 2                                                                                                             as level
		 , false                                                                                                         as is_locked
		 , null                                                                                                          as locked_at
		 , null                                                                                                          as locked_by
		 , @action_at                                                                                                    as created_at
		 , @action_by                                                                                                    as created_by
		 , null                                                                                                          as updated_at
		 , null                                                                                                          as updated_by
		 , is_deleted is null or is_deleted                                                                              as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null)                                                        as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null)                                                        as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))                                                                     as kelompok1_id
		 , if(length(kode) < 3, null, left(kode, 3))                                                                     as kelompok2_id
		 , if(length(kode) < 6, null, left(kode, 6))                                                                     as kelompok3_id
		 , if(length(kode) < 9, null, left(kode, 9))                                                                     as kelompok4_id
		 , if(length(kode) < 12, null, left(kode, 12))                                                                   as kelompok5_id
		 , if(length(kode) < 17, null, left(kode, 17))                                                                   as kelompok6_id
	from espresso_2025_preproduction.data_master_kelompok2
	union
	select kode                                                                                                          as id
		 , kode                                                                                                          as code
		 , nama                                                                                                          as name
		 , case when tipe = 'SSH' then 1 when tipe = 'HSPK' then 2 when tipe = 'ASB' then 3 when tipe = 'SBU' then 4 end as type
		 , 1                                                                                                             as level
		 , false                                                                                                         as is_locked
		 , null                                                                                                          as locked_at
		 , null                                                                                                          as locked_by
		 , @action_at                                                                                                    as created_at
		 , @action_by                                                                                                    as created_by
		 , null                                                                                                          as updated_at
		 , null                                                                                                          as updated_by
		 , is_deleted is null or is_deleted                                                                              as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null)                                                        as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null)                                                        as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))                                                                     as kelompok1_id
		 , if(length(kode) < 3, null, left(kode, 3))                                                                     as kelompok2_id
		 , if(length(kode) < 6, null, left(kode, 6))                                                                     as kelompok3_id
		 , if(length(kode) < 9, null, left(kode, 9))                                                                     as kelompok4_id
		 , if(length(kode) < 12, null, left(kode, 12))                                                                   as kelompok5_id
		 , if(length(kode) < 17, null, left(kode, 17))                                                                   as kelompok6_id
	from espresso_2025_preproduction.data_master_kelompok1
) t
on duplicate key update code         = t.code
                      , name         = t.name
                      , level        = t.level
                      , is_locked    = t.is_locked
                      , locked_at    = t.locked_at
                      , locked_by    = t.locked_by
                      , created_at   = t.created_at
                      , created_by   = t.created_by
                      , updated_at   = t.updated_at
                      , updated_by   = t.updated_by
                      , is_deleted   = t.is_deleted
                      , deleted_at   = t.deleted_at
                      , deleted_by   = t.deleted_by
                      , kelompok1_id = t.kelompok1_id
                      , kelompok2_id = t.kelompok2_id
                      , kelompok3_id = t.kelompok3_id
                      , kelompok4_id = t.kelompok4_id
                      , kelompok5_id = t.kelompok5_id
                      , kelompok6_id = t.kelompok6_id