insert into keuangan_dev.sipd_master_subkegiatan (id, code, name, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, subject_id)
select *
from (
	select a.id                                                       as id
		 , a.kode                                                     as code
		 , b.nama                                                     as name
		 , false                                                      as is_locked
		 , null                                                       as locked_at
		 , null                                                       as locked_by
		 , @action_at                                                 as created_at
		 , @action_by                                                 as created_by
		 , null                                                       as updated_at
		 , null                                                       as updated_by
		 , a.is_deleted is null or a.is_deleted                       as is_deleted
		 , if(a.is_deleted is null or a.is_deleted, @action_at, null) as deleted_at
		 , if(a.is_deleted is null or a.is_deleted, @action_by, null) as deleted_by
		 , replace(a.kode, 'X', '0')                                  as subject_id
	from espresso_2025_preproduction.sipd_master_subkegiatan a
	left join espresso_2025_preproduction.data_master_subkegiatan b on a.kode = b.kode
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