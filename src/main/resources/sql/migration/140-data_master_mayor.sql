insert into keuangan_dev.data_master_mayor (id, status, name, title_prefix, title_suffix, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select id                                                     as id
		 , case
			   when status like 'Definitif' then 1
			   when status like 'Pj' then 2
			   when status like 'Pjs' then 3
			   when status like 'Plt' then 4
			   when status like 'Plh' then 5 end                  as status
		 , nama                                                   as name
		 , gelar_1                                                as title_prefix
		 , gelar_2                                                as title_suffix
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
	from espresso_2025_preproduction.data_master_kepala_daerah
	where id = 1
) t
on duplicate key update status       = t.status
                      , name         = t.name
                      , title_prefix = t.title_prefix
                      , title_suffix = t.title_suffix
                      , is_locked    = t.is_locked
                      , locked_at    = t.locked_at
                      , locked_by    = t.locked_by
                      , created_at   = t.created_at
                      , created_by   = t.created_by
                      , updated_at   = t.updated_at
                      , updated_by   = t.updated_by
                      , is_deleted   = t.is_deleted
                      , deleted_at   = t.deleted_at
                      , deleted_by   = t.deleted_by