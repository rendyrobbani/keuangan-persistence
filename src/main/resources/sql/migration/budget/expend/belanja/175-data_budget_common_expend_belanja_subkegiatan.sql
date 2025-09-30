delete from keuangan_dev.data_budget_common_expend_belanja_subkegiatan;
insert into keuangan_dev.data_budget_common_expend_belanja_subkegiatan (id, skpd_id, unit_id, urusan_id, bidang_id, program_id, program_code, kegiatan_id, kegiatan_code, subkegiatan_id, subkegiatan_code, fungsi_id, subfungsi_id, belanja_operasi, belanja_modal, belanja_tidak_terduga, belanja_transfer, total, belanja_operasi_sebelum, belanja_modal_sebelum, belanja_tidak_terduga_sebelum, belanja_transfer_sebelum, sebelum, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, is_locked, locked_at, locked_by, is_rincian_locked, rincian_locked_at, rincian_locked_by)
select *
from (
	select concat_ws('|', unit_id, bidang_id, subkegiatan_id) as id
		 , skpd_id                                            as skpd_id
		 , unit_id                                            as unit_id
		 , urusan_id                                          as urusan_id
		 , bidang_id                                          as bidang_id
		 , program_id                                         as program_id
		 , program_code                                       as program_code
		 , kegiatan_id                                        as kegiatan_id
		 , kegiatan_code                                      as kegiatan_code
		 , subkegiatan_id                                     as subkegiatan_id
		 , subkegiatan_code                                   as subkegiatan_code
		 , fungsi_id                                          as fungsi_id
		 , subfungsi_id                                       as subfungsi_id
		 , sum(if(rekening2_id like '5.1', total, 0))         as belanja_operasi
		 , sum(if(rekening2_id like '5.2', total, 0))         as belanja_modal
		 , sum(if(rekening2_id like '5.3', total, 0))         as belanja_tidak_terduga
		 , sum(if(rekening2_id like '5.4', total, 0))         as belanja_transfer
		 , sum(total)                                         as total
		 , sum(if(rekening2_id like '5.1', sebelum, 0))       as belanja_operasi_sebelum
		 , sum(if(rekening2_id like '5.2', sebelum, 0))       as belanja_modal_sebelum
		 , sum(if(rekening2_id like '5.3', sebelum, 0))       as belanja_tidak_terduga_sebelum
		 , sum(if(rekening2_id like '5.4', sebelum, 0))       as belanja_transfer_sebelum
		 , sum(sebelum)                                       as sebelum
		 , @action_at                                         as created_at
		 , @action_by                                         as created_by
		 , null                                               as updated_at
		 , null                                               as updated_by
		 , false                                              as is_deleted
		 , null                                               as deleted_at
		 , null                                               as deleted_by
		 , false                                              as is_locked
		 , null                                               as locked_at
		 , null                                               as locked_by
		 , false                                              as is_rincian_locked
		 , null                                               as rincian_locked_at
		 , null                                               as rincian_locked_by
	from keuangan_dev.data_budget_common_expend_belanja_jenis
	where !is_deleted
	group by skpd_id, unit_id, urusan_id, bidang_id, program_id, program_code, kegiatan_id, kegiatan_code, subkegiatan_id, subkegiatan_code, fungsi_id, subfungsi_id
) t
on duplicate key update skpd_id                       = t.skpd_id
                      , unit_id                       = t.unit_id
                      , urusan_id                     = t.urusan_id
                      , bidang_id                     = t.bidang_id
                      , program_id                    = t.program_id
                      , program_code                  = t.program_code
                      , kegiatan_id                   = t.kegiatan_id
                      , kegiatan_code                 = t.kegiatan_code
                      , subkegiatan_id                = t.subkegiatan_id
                      , subkegiatan_code              = t.subkegiatan_code
                      , fungsi_id                     = t.fungsi_id
                      , subfungsi_id                  = t.subfungsi_id
                      , belanja_operasi               = t.belanja_operasi
                      , belanja_modal                 = t.belanja_modal
                      , belanja_tidak_terduga         = t.belanja_tidak_terduga
                      , belanja_transfer              = t.belanja_transfer
                      , total                         = t.total
                      , belanja_operasi_sebelum       = t.belanja_operasi_sebelum
                      , belanja_modal_sebelum         = t.belanja_modal_sebelum
                      , belanja_tidak_terduga_sebelum = t.belanja_tidak_terduga_sebelum
                      , belanja_transfer_sebelum      = t.belanja_transfer_sebelum
                      , sebelum                       = t.sebelum
                      , updated_at                    = @action_at
                      , updated_by                    = @action_by
                      , is_deleted                    = t.is_deleted
                      , deleted_at                    = t.deleted_at
                      , deleted_by                    = t.deleted_by