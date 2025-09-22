delete from keuangan_dev.data_budget_common_income_pendapatan_organisasi;
insert into keuangan_dev.data_budget_common_income_pendapatan_organisasi (id, skpd_id, unit_id, sebelum, total, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select concat_ws('|', unit_id) as id
		 , skpd_id                 as skpd_id
		 , unit_id                 as unit_id
		 , sum(sebelum)            as sebelum
		 , sum(total)              as total
		 , false                   as is_locked
		 , null                    as locked_at
		 , null                    as locked_by
		 , @action_at              as created_at
		 , @action_by              as created_by
		 , null                    as updated_at
		 , null                    as updated_by
		 , false                   as is_deleted
		 , null                    as deleted_at
		 , null                    as deleted_by
	from keuangan_dev.data_budget_common_income_pendapatan_bidang
	where !is_deleted
	group by skpd_id, unit_id
) t
on duplicate key update skpd_id    = t.skpd_id
                      , unit_id    = t.unit_id
                      , total      = t.total
                      , sebelum    = t.sebelum
                      , updated_at = @action_at
                      , updated_by = @action_by
                      , is_deleted = t.is_deleted
                      , deleted_at = t.deleted_at
                      , deleted_by = t.deleted_by