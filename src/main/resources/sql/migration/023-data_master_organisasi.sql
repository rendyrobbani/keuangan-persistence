insert into keuangan_dev.data_master_organisasi (id, code, name, is_skpd, is_unit, is_setda, is_skpkd, main_bidang, head_id, head_status, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, skpd_id, unit_id, bidang1_id, bidang2_id, bidang3_id)
select *
from (
	select kode                                                   as id
		 , kode                                                   as code
		 , nama                                                   as name
		 , kode like '%0000'                                      as is_skpd
		 , kode not like '%0000'                                  as is_unit
		 , is_setda                                               as is_setda
		 , is_skpkd                                               as is_skpkd
		 , ifnull(bidang_utama, 1)                                as main_bidang
		 , nip_kepala                                             as head_id
		 , case
			   when status_kepala like 'Definitif' then 1
			   when status_kepala like 'Pj' then 2
			   when status_kepala like 'Pjs' then 3
			   when status_kepala like 'Plt' then 4
			   when status_kepala like 'Plh' then 5 end           as head_status
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
		 , kode_skpd                                              as skpd_id
		 , kode                                                   as unit_id
		 , kode_bidang1                                           as bidang1_id
		 , kode_bidang2                                           as bidang2_id
		 , kode_bidang3                                           as bidang3_id
	from espresso_2025_preproduction.data_master_unit
) t
on duplicate key update code        = t.code
                      , name        = t.name
                      , is_skpd     = t.is_skpd
                      , is_unit     = t.is_unit
                      , is_setda    = t.is_setda
                      , is_skpkd    = t.is_skpkd
                      , main_bidang = t.main_bidang
                      , head_id     = t.head_id
                      , head_status = t.head_status
                      , is_locked   = t.is_locked
                      , locked_at   = t.locked_at
                      , locked_by   = t.locked_by
                      , created_at  = t.created_at
                      , created_by  = t.created_by
                      , updated_at  = t.updated_at
                      , updated_by  = t.updated_by
                      , is_deleted  = t.is_deleted
                      , deleted_at  = t.deleted_at
                      , deleted_by  = t.deleted_by
                      , skpd_id     = t.skpd_id
                      , unit_id     = t.unit_id
                      , bidang1_id  = t.bidang1_id
                      , bidang2_id  = t.bidang2_id
                      , bidang3_id  = t.bidang3_id