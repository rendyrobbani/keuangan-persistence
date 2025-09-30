delete from keuangan_dev.data_budget_common_expend_belanja_organisasi;
insert into keuangan_dev.data_budget_common_expend_belanja_organisasi (id, skpd_id, unit_id, belanja_operasi, belanja_modal, belanja_tidak_terduga, belanja_transfer, total, belanja_operasi_sebelum, belanja_modal_sebelum, belanja_tidak_terduga_sebelum, belanja_transfer_sebelum, sebelum, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, is_locked, locked_at, locked_by)
select *
from (
	select concat_ws('|', unit_id)            as id
		 , skpd_id                            as skpd_id
		 , unit_id                            as unit_id
		 , sum(belanja_operasi)               as belanja_operasi
		 , sum(belanja_modal)                 as belanja_modal
		 , sum(belanja_tidak_terduga)         as belanja_tidak_terduga
		 , sum(belanja_transfer)              as belanja_transfer
		 , sum(total)                         as total
		 , sum(belanja_operasi_sebelum)       as belanja_operasi_sebelum
		 , sum(belanja_modal_sebelum)         as belanja_modal_sebelum
		 , sum(belanja_tidak_terduga_sebelum) as belanja_tidak_terduga_sebelum
		 , sum(belanja_transfer_sebelum)      as belanja_transfer_sebelum
		 , sum(sebelum)                       as sebelum
		 , @action_at                         as created_at
		 , @action_by                         as created_by
		 , null                               as updated_at
		 , null                               as updated_by
		 , false                              as is_deleted
		 , null                               as deleted_at
		 , null                               as deleted_by
		 , false                              as is_locked
		 , null                               as locked_at
		 , null                               as locked_by
	from keuangan_dev.data_budget_common_expend_belanja_bidang
	where !is_deleted
	group by skpd_id, unit_id
) t
on duplicate key update skpd_id                       = t.skpd_id
                      , unit_id                       = t.unit_id
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