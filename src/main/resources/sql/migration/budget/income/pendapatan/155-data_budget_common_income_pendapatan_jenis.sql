delete from keuangan_dev.data_budget_common_income_pendapatan_jenis;
insert into keuangan_dev.data_budget_common_income_pendapatan_jenis (id, skpd_id, unit_id, urusan_id, bidang_id, rekening1_id, rekening2_id, rekening3_id, sebelum, total, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select concat_ws('|', unit_id, bidang_id, rekening3_id) as id
		 , skpd_id                                          as skpd_id
		 , unit_id                                          as unit_id
		 , urusan_id                                        as urusan_id
		 , bidang_id                                        as bidang_id
		 , rekening1_id                                     as rekening1_id
		 , rekening2_id                                     as rekening2_id
		 , rekening3_id                                     as rekening3_id
		 , sum(sebelum)                                     as sebelum
		 , sum(total)                                       as total
		 , @action_at                                       as created_at
		 , @action_by                                       as created_by
		 , null                                             as updated_at
		 , null                                             as updated_by
		 , false                                            as is_deleted
		 , null                                             as deleted_at
		 , null                                             as deleted_by
	from keuangan_dev.data_budget_common_income_pendapatan_rekening
	where !is_deleted
	group by skpd_id, unit_id, urusan_id, bidang_id, rekening1_id, rekening2_id, rekening3_id
) t
on duplicate key update skpd_id      = t.skpd_id
                      , unit_id      = t.unit_id
                      , urusan_id    = t.urusan_id
                      , bidang_id    = t.bidang_id
                      , rekening1_id = t.rekening1_id
                      , rekening2_id = t.rekening2_id
                      , rekening3_id = t.rekening3_id
                      , total        = t.total
                      , sebelum      = t.sebelum
                      , updated_at   = @action_at
                      , updated_by   = @action_by
                      , is_deleted   = t.is_deleted
                      , deleted_at   = t.deleted_at
                      , deleted_by   = t.deleted_by