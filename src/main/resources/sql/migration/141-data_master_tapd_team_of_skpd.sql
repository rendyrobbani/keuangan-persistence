insert into keuangan_dev.data_master_tapd_team_of_skpd (id, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, tapd_id, skpd_id)
select *
from (
	select id                                                     as id
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
		 , id_tapd                                                as tapd_id
		 , kode_skpd                                              as skpd_id
	from espresso_2025_preproduction.data_master_tapd_tim_skpd
) t
on duplicate key update created_at = t.created_at
                      , created_by = t.created_by
                      , updated_at = t.updated_at
                      , updated_by = t.updated_by
                      , is_deleted = t.is_deleted
                      , deleted_at = t.deleted_at
                      , deleted_by = t.deleted_by
                      , tapd_id    = t.tapd_id
                      , skpd_id    = t.skpd_id