delete from keuangan_dev.data_budget_common_expend_belanja_jenis;
insert into keuangan_dev.data_budget_common_expend_belanja_jenis (id, skpd_id, unit_id, urusan_id, bidang_id, program_id, program_code, kegiatan_id, kegiatan_code, subkegiatan_id, subkegiatan_code, fungsi_id, subfungsi_id, rekening1_id, rekening2_id, rekening3_id, sebelum, total, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select concat_ws('|', unit_id, bidang_id, subkegiatan_id, rekening3_id) as id
		 , skpd_id                                                          as skpd_id
		 , unit_id                                                          as unit_id
		 , urusan_id                                                        as urusan_id
		 , bidang_id                                                        as bidang_id
		 , program_id                                                       as program_id
		 , program_code                                                     as program_code
		 , kegiatan_id                                                      as kegiatan_id
		 , kegiatan_code                                                    as kegiatan_code
		 , subkegiatan_id                                                   as subkegiatan_id
		 , subkegiatan_code                                                 as subkegiatan_code
		 , fungsi_id                                                        as fungsi_id
		 , subfungsi_id                                                     as subfungsi_id
		 , rekening1_id                                                     as rekening1_id
		 , rekening2_id                                                     as rekening2_id
		 , rekening3_id                                                     as rekening3_id
		 , sum(sebelum)                                                     as sebelum
		 , sum(total)                                                       as total
		 , @action_at                                                       as created_at
		 , @action_by                                                       as created_by
		 , null                                                             as updated_at
		 , null                                                             as updated_by
		 , false                                                            as is_deleted
		 , null                                                             as deleted_at
		 , null                                                             as deleted_by
	from keuangan_dev.data_budget_common_expend_belanja_rekening
	where !is_deleted
	group by skpd_id, unit_id, urusan_id, bidang_id, program_id, program_code, kegiatan_id, kegiatan_code, subkegiatan_id, subkegiatan_code, fungsi_id, subfungsi_id, rekening1_id, rekening2_id, rekening3_id
) t
on duplicate key update skpd_id          = t.skpd_id
                      , unit_id          = t.unit_id
                      , urusan_id        = t.urusan_id
                      , bidang_id        = t.bidang_id
                      , program_id       = t.program_id
                      , program_code     = t.program_code
                      , kegiatan_id      = t.kegiatan_id
                      , kegiatan_code    = t.kegiatan_code
                      , subkegiatan_id   = t.subkegiatan_id
                      , subkegiatan_code = t.subkegiatan_code
                      , fungsi_id        = t.fungsi_id
                      , subfungsi_id     = t.subfungsi_id
                      , rekening1_id     = t.rekening1_id
                      , rekening2_id     = t.rekening2_id
                      , rekening3_id     = t.rekening3_id
                      , total            = t.total
                      , sebelum          = t.sebelum
                      , updated_at       = @action_at
                      , updated_by       = @action_by
                      , is_deleted       = t.is_deleted
                      , deleted_at       = t.deleted_at
                      , deleted_by       = t.deleted_by