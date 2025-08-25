insert into keuangan_dev.data_master_komponen (id, type, code, name, spec, unit, price, is_pdn, tkdn_value, is_locked, locked_at, locked_by, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by, kelompok_id, rekening_id)
select *
from (
	select id                                                                                                            as id
		 , case when tipe = 'SSH' then 1 when tipe = 'HSPK' then 2 when tipe = 'ASB' then 3 when tipe = 'SBU' then 4 end as type
		 , kode                                                                                                          as code
		 , nama                                                                                                          as name
		 , spek                                                                                                          as spec
		 , satuan                                                                                                        as unit
		 , harga                                                                                                         as price
		 , is_pdn is not null and is_pdn                                                                                 as is_pdn
		 , ifnull(nilai_tkdn, 0)                                                                                         as tkdn_value
		 , is_kunci is null or is_kunci                                                                                  as is_locked
		 , if(is_kunci is null or is_kunci, @action_at, null)                                                            as locked_at
		 , if(is_kunci is null or is_kunci, @action_by, null)                                                            as locked_by
		 , @action_at                                                                                                    as created_at
		 , @action_by                                                                                                    as created_by
		 , null                                                                                                          as updated_at
		 , null                                                                                                          as updated_by
		 , is_deleted is null or is_deleted                                                                              as is_deleted
		 , if(is_deleted is null or is_deleted, @action_at, null)                                                        as deleted_at
		 , if(is_deleted is null or is_deleted, @action_by, null)                                                        as deleted_by
		 , kode_kelompok6                                                                                                as kelompok_id
		 , kode_rekening                                                                                                 as rekening_id
	from espresso_2025_preproduction.data_master_standar_harga
) t
on duplicate key update type        = t.type
                      , code        = t.code
                      , name        = t.name
                      , spec        = t.spec
                      , unit        = t.unit
                      , price       = t.price
                      , is_pdn      = t.is_pdn
                      , tkdn_value  = t.tkdn_value
                      , is_locked   = t.is_locked
                      , locked_at   = t.locked_at
                      , locked_by   = t.locked_by
                      , created_at  = t.created_at
                      , created_by  = t.created_by
                      , updated_at  = t.updated_at
                      , updated_by  = t.updated_by
                      , is_deleted  = t.is_deleted
                      , deleted_at  = t.deleted_at
                      , deleted_by  = t.deleted_by
                      , kelompok_id = t.kelompok_id
                      , rekening_id = t.rekening_id