insert into keuangan_dev.data_master_sumber (id, code, name, level, is_enabled, is_umum, is_khusus, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, sumber1_id, sumber2_id, sumber3_id, sumber4_id, sumber5_id, sumber6_id)
select *
from (
	select kode                                                   as id
		 , kode                                                   as code
		 , nama                                                   as name
		 , 6                                                      as level
		 , is_input is not null and is_input                      as is_enabled
		 , kode like '1%'                                         as is_umum
		 , kode like '2%'                                         as is_khusus
		 , false                                                  as is_locked
		 , null                                                   as locked_at
		 , null                                                   as locked_by
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))              as sumber1_id
		 , if(length(kode) < 3, null, left(kode, 3))              as sumber2_id
		 , if(length(kode) < 6, null, left(kode, 6))              as sumber3_id
		 , if(length(kode) < 9, null, left(kode, 9))              as sumber4_id
		 , if(length(kode) < 12, null, left(kode, 12))            as sumber5_id
		 , if(length(kode) < 17, null, left(kode, 17))            as sumber6_id
	from espresso_2025_preproduction.data_master_sumber6
	union
	select kode                                                   as id
		 , kode                                                   as code
		 , nama                                                   as name
		 , 5                                                      as level
		 , is_input is not null and is_input                      as is_enabled
		 , kode like '1%'                                         as is_umum
		 , kode like '2%'                                         as is_khusus
		 , false                                                  as is_locked
		 , null                                                   as locked_at
		 , null                                                   as locked_by
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))              as sumber1_id
		 , if(length(kode) < 3, null, left(kode, 3))              as sumber2_id
		 , if(length(kode) < 6, null, left(kode, 6))              as sumber3_id
		 , if(length(kode) < 9, null, left(kode, 9))              as sumber4_id
		 , if(length(kode) < 12, null, left(kode, 12))            as sumber5_id
		 , if(length(kode) < 17, null, left(kode, 17))            as sumber6_id
	from espresso_2025_preproduction.data_master_sumber5
	union
	select kode                                                   as id
		 , kode                                                   as code
		 , nama                                                   as name
		 , 4                                                      as level
		 , is_input is not null and is_input                      as is_enabled
		 , kode like '1%'                                         as is_umum
		 , kode like '2%'                                         as is_khusus
		 , false                                                  as is_locked
		 , null                                                   as locked_at
		 , null                                                   as locked_by
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))              as sumber1_id
		 , if(length(kode) < 3, null, left(kode, 3))              as sumber2_id
		 , if(length(kode) < 6, null, left(kode, 6))              as sumber3_id
		 , if(length(kode) < 9, null, left(kode, 9))              as sumber4_id
		 , if(length(kode) < 12, null, left(kode, 12))            as sumber5_id
		 , if(length(kode) < 17, null, left(kode, 17))            as sumber6_id
	from espresso_2025_preproduction.data_master_sumber4
	union
	select kode                                                   as id
		 , kode                                                   as code
		 , nama                                                   as name
		 , 3                                                      as level
		 , is_input is not null and is_input                      as is_enabled
		 , kode like '1%'                                         as is_umum
		 , kode like '2%'                                         as is_khusus
		 , false                                                  as is_locked
		 , null                                                   as locked_at
		 , null                                                   as locked_by
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))              as sumber1_id
		 , if(length(kode) < 3, null, left(kode, 3))              as sumber2_id
		 , if(length(kode) < 6, null, left(kode, 6))              as sumber3_id
		 , if(length(kode) < 9, null, left(kode, 9))              as sumber4_id
		 , if(length(kode) < 12, null, left(kode, 12))            as sumber5_id
		 , if(length(kode) < 17, null, left(kode, 17))            as sumber6_id
	from espresso_2025_preproduction.data_master_sumber3
	union
	select kode                                                   as id
		 , kode                                                   as code
		 , nama                                                   as name
		 , 2                                                      as level
		 , is_input is not null and is_input                      as is_enabled
		 , kode like '1%'                                         as is_umum
		 , kode like '2%'                                         as is_khusus
		 , false                                                  as is_locked
		 , null                                                   as locked_at
		 , null                                                   as locked_by
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))              as sumber1_id
		 , if(length(kode) < 3, null, left(kode, 3))              as sumber2_id
		 , if(length(kode) < 6, null, left(kode, 6))              as sumber3_id
		 , if(length(kode) < 9, null, left(kode, 9))              as sumber4_id
		 , if(length(kode) < 12, null, left(kode, 12))            as sumber5_id
		 , if(length(kode) < 17, null, left(kode, 17))            as sumber6_id
	from espresso_2025_preproduction.data_master_sumber2
	union
	select kode                                                   as id
		 , kode                                                   as code
		 , nama                                                   as name
		 , 1                                                      as level
		 , is_input is not null and is_input                      as is_enabled
		 , kode like '1%'                                         as is_umum
		 , kode like '2%'                                         as is_khusus
		 , false                                                  as is_locked
		 , null                                                   as locked_at
		 , null                                                   as locked_by
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
		 , if(length(kode) < 1, null, left(kode, 1))              as sumber1_id
		 , if(length(kode) < 3, null, left(kode, 3))              as sumber2_id
		 , if(length(kode) < 6, null, left(kode, 6))              as sumber3_id
		 , if(length(kode) < 9, null, left(kode, 9))              as sumber4_id
		 , if(length(kode) < 12, null, left(kode, 12))            as sumber5_id
		 , if(length(kode) < 17, null, left(kode, 17))            as sumber6_id
	from espresso_2025_preproduction.data_master_sumber1
) t
on duplicate key update code       = t.code
                      , name       = t.name
                      , level      = t.level
                      , is_enabled = t.is_enabled
                      , is_umum    = t.is_umum
                      , is_khusus  = t.is_khusus
                      , is_locked  = t.is_locked
                      , locked_at  = t.locked_at
                      , locked_by  = t.locked_by
                      , created_at = t.created_at
                      , created_by = t.created_by
                      , updated_at = t.updated_at
                      , updated_by = t.updated_by
                      , is_deleted = t.is_deleted
                      , deleted_at = t.deleted_at
                      , deleted_by = t.deleted_by
                      , sumber1_id = t.sumber1_id
                      , sumber2_id = t.sumber2_id
                      , sumber3_id = t.sumber3_id
                      , sumber4_id = t.sumber4_id
                      , sumber5_id = t.sumber5_id
                      , sumber6_id = t.sumber6_id