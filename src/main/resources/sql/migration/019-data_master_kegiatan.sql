insert into keuangan_dev.data_master_kegiatan (id, code, name, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, urusan_id, bidang_id, program_id, fungsi_id, subfungsi_id)
select *
from (
	select replace(kode, 'X', '0')                                as id
		 , kode                                                   as code
		 , nama                                                   as name
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
		 , left(replace(kode, 'X', '0'), 1)                       as urusan_id
		 , left(replace(kode, 'X', '0'), 4)                       as bidang_id
		 , left(replace(kode, 'X', '0'), 7)                       as program_id
		 , kode_fungsi                                            as fungsi_id
		 , kode_subfungsi                                         as subfungsi_id
	from espresso_2025_preproduction.data_master_kegiatan
) t
on duplicate key update code       = t.code
                      , name       = t.name
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