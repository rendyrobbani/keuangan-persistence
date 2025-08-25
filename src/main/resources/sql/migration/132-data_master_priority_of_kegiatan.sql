insert into keuangan_dev.data_master_priority_of_kegiatan (id, year, number, name, sipd_name, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select id                                                     as id
		 , tahun                                                  as year
		 , nomor                                                  as number
		 , nama                                                   as name
		 , nama                                                   as sipd_name
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
	from espresso_2025_preproduction.data_master_label_kegiatan
) t
on duplicate key update year       = t.year
                      , number     = t.number
                      , name       = t.name
                      , sipd_name  = t.sipd_name
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