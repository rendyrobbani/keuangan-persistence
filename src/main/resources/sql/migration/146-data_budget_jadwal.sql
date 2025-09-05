insert into data_budget_jadwal (id, year, name, from_time, into_time, is_perda, perda_date, perda_number, is_perkada, perkada_date, perkada_number, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, tahapan_id, rkpd_id, ppas_id, apbd_id, sipd_id)
select *
from (
	select id              as id
		 , tahun           as year
		 , nama            as name
		 , waktu_mulai     as from_time
		 , waktu_selesai   as into_time
		 , is_perda        as is_perda
		 , tanggal_perda   as perda_date
		 , nomor_perda     as perda_number
		 , is_perkada      as is_perkada
		 , tanggal_perkada as perkada_date
		 , nomor_perkada   as perkada_number
		 , is_kunci        as is_locked
		 , kunci_at        as locked_at
		 , kunci_by        as locked_by
		 , created_at      as created_at
		 , created_by      as created_by
		 , updated_at      as updated_at
		 , updated_by      as updated_by
		 , is_deleted      as is_deleted
		 , deleted_at      as deleted_at
		 , deleted_by      as deleted_by
		 , id_tahapan      as tahapan_id
		 , id_rkpd         as rkpd_id
		 , id_ppas         as ppas_id
		 , id_sebelum      as apbd_id
		 , id_sipd         as sipd_id
	from espresso_2025_preproduction.data_penganggaran_jadwal
) t
on duplicate key update year           = t.year
                      , name           = t.name
                      , from_time      = t.from_time
                      , into_time      = t.into_time
                      , is_perda       = t.is_perda
                      , perda_date     = t.perda_date
                      , perda_number   = t.perda_number
                      , is_perkada     = t.is_perkada
                      , perkada_date   = t.perkada_date
                      , perkada_number = t.perkada_number
                      , is_locked      = t.is_locked
                      , locked_at      = t.locked_at
                      , locked_by      = t.locked_by
                      , created_at     = t.created_at
                      , created_by     = t.created_by
                      , updated_at     = t.updated_at
                      , updated_by     = t.updated_by
                      , is_deleted     = t.is_deleted
                      , deleted_at     = t.deleted_at
                      , deleted_by     = t.deleted_by
                      , tahapan_id     = t.tahapan_id
                      , rkpd_id        = t.rkpd_id
                      , ppas_id        = t.ppas_id
                      , apbd_id        = t.apbd_id
                      , sipd_id        = t.sipd_id