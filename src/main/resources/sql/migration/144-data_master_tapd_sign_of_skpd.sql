insert into keuangan_dev.data_master_tapd_sign_of_skpd (id, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, team_id, sign_id, skpd_id)
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
		 , right(id_tapd_ttd, 18)                                 as team_id
		 , id_tapd_ttd                                            as sign_id
		 , kode_skpd                                              as skpd_id
	from espresso_2025_preproduction.data_master_tapd_ttd_unit
) t
on duplicate key update created_at = t.created_at
                      , created_by = t.created_by
                      , updated_at = t.updated_at
                      , updated_by = t.updated_by
                      , is_deleted = t.is_deleted
                      , deleted_at = t.deleted_at
                      , deleted_by = t.deleted_by
                      , team_id    = t.team_id
                      , sign_id    = t.sign_id
                      , skpd_id    = t.skpd_id