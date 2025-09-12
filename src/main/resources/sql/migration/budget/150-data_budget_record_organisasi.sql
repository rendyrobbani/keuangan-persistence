insert into keuangan_dev.data_budget_record_organisasi (common_id, code, name, is_skpd, is_unit, is_setda, is_skpkd, main_bidang, head_status, head_pangkat, head_name, head_title_prefix, head_title_suffix, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, skpd_id, unit_id, bidang1_id, bidang2_id, bidang3_id, head_id, id, jadwal_id)
select *
from (
	select b.kode          as common_id
		 , b.kode          as code
		 , b.nama          as name
		 , b.is_skpd       as is_skpd
		 , !b.is_skpd      as is_unit
		 , b.is_setda      as is_setda
		 , b.is_skpkd      as is_skpkd
		 , b.bidang_utama  as main_bidang
		 , b.status_kepala as head_status
		 , a.id_pangkat    as head_pangkat
		 , a.nama_kepala   as head_name
		 , a.gelar1_kepala as head_title_prefix
		 , a.gelar2_kepala as head_title_suffix
		 , b.created_at    as created_at
		 , b.created_by    as created_by
		 , b.updated_at    as updated_at
		 , b.updated_by    as updated_by
		 , b.is_deleted    as is_deleted
		 , b.deleted_at    as deleted_at
		 , b.deleted_by    as deleted_by
		 , b.kode_skpd     as skpd_id
		 , b.kode          as unit_id
		 , b.kode_bidang1  as bidang1_id
		 , b.kode_bidang2  as bidang2_id
		 , b.kode_bidang3  as bidang3_id
		 , b.nip_kepala    as head_id
		 , a.id            as id
		 , a.id_jadwal     as jadwal_id
	from espresso_2025_preproduction.data_penganggaran_unit_arsip a
	left join espresso_2025_preproduction.data_master_unit b on a.kode = b.kode
) t
on duplicate key update code              = t.code
                      , name              = t.name
                      , is_skpd           = t.is_skpd
                      , is_unit           = t.is_unit
                      , is_setda          = t.is_setda
                      , is_skpkd          = t.is_skpkd
                      , main_bidang       = t.main_bidang
                      , head_status       = t.head_status
                      , head_pangkat      = t.head_pangkat
                      , head_name         = t.head_name
                      , head_title_prefix = t.head_title_prefix
                      , head_title_suffix = t.head_title_suffix
                      , created_at        = t.created_at
                      , created_by        = t.created_by
                      , updated_at        = t.updated_at
                      , updated_by        = t.updated_by
                      , is_deleted        = t.is_deleted
                      , deleted_at        = t.deleted_at
                      , deleted_by        = t.deleted_by
                      , skpd_id           = t.skpd_id
                      , unit_id           = t.unit_id
                      , bidang1_id        = t.bidang1_id
                      , bidang2_id        = t.bidang2_id
                      , bidang3_id        = t.bidang3_id
                      , head_id           = t.head_id