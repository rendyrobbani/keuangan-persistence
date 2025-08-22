set @action_by = '199510172019031003';
set @action_at = now();

insert into keuangan_dev.data_user (id, pangkat, name, title_prefix, title_suffix, password, date_of_birth, date_of_start, gender, number, is_pns, is_p3k, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
    select nip                            id
         , id_pangkat                     pangkat
         , nama                           name
         , gelar_1                        title_prefix
         , gelar_2                        title_suffix
         , password                       password
         , ttl                            date_of_birth
         , tmt                            date_of_start
         , jenis                          gender
         , nomor                          number
         , id_pangkat regexp '[0-9][A-Z]' is_pns
         , id_pangkat regexp '[0-9][0-9]' is_p3k
         , true                           is_locked
         , @action_at                     locked_at
         , @action_by                     locked_by
         , @action_at                     created_at
         , @action_by                     created_by
         , null                           updated_at
         , null                           updated_by
         , true                           is_deleted
         , @action_at                     deleted_at
         , @action_by                     deleted_by
    from espresso_2025_preproduction.data_user
    where nip like @action_by
) t
on duplicate key update pangkat       = t.pangkat
                      , name          = t.name
                      , title_prefix  = t.title_prefix
                      , title_suffix  = t.title_suffix
                      , password      = t.password
                      , date_of_birth = t.date_of_birth
                      , date_of_start = t.date_of_start
                      , gender        = t.gender
                      , number        = t.number
                      , is_pns        = t.is_pns
                      , is_p3k        = t.is_p3k
                      , is_locked     = t.is_locked
                      , locked_at     = t.locked_at
                      , locked_by     = t.locked_by
                      , created_at    = t.created_at
                      , created_by    = t.created_by
                      , updated_at    = t.updated_at
                      , updated_by    = t.updated_by
                      , is_deleted    = t.is_deleted
                      , deleted_at    = t.deleted_at
                      , deleted_by    = t.deleted_by;