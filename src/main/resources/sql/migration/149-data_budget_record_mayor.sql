insert into keuangan_dev.data_budget_record_mayor (id, jadwal_id, common_id, status, name, title_prefix, title_suffix, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select concat_ws('|', id_jadwal, lpad(id_common, 4, '0'))     as id
		 , id_jadwal                                              as jadwal_id
		 , id_common                                              as common_id
		 , case
			   when status like 'Definitif' then 1
			   when status like 'Pj' then 2
			   when status like 'Pjs' then 3
			   when status like 'Plt' then 4
			   when status like 'Plh' then 5 end                  as status
		 , nama                                                   as name
		 , gelar_1                                                as title_prefix
		 , gelar_2                                                as title_suffix
		 , @action_at                                             as created_at
		 , @action_by                                             as created_by
		 , null                                                   as updated_at
		 , null                                                   as updated_by
		 , is_deleted is null or is_deleted                       as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null) as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null) as deleted_by
	from espresso_2025_preproduction.data_penganggaran_kepala_daerah_arsip
	where id = 1
) t
on duplicate key update status       = t.status
                      , name         = t.name
                      , title_prefix = t.title_prefix
                      , title_suffix = t.title_suffix
                      , created_at   = t.created_at
                      , created_by   = t.created_by
                      , updated_at   = t.updated_at
                      , updated_by   = t.updated_by
                      , is_deleted   = t.is_deleted
                      , deleted_at   = t.deleted_at
                      , deleted_by   = t.deleted_by