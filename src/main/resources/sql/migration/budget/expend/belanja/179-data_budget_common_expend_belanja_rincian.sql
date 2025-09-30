delete from keuangan_dev.data_budget_common_expend_belanja_rincian;
insert into keuangan_dev.data_budget_common_expend_belanja_rincian (id, skpd_id, unit_id, urusan_id, bidang_id, program_id, program_code, kegiatan_id, kegiatan_code, subkegiatan_id, subkegiatan_code, fungsi_id, subfungsi_id, rekening1_id, rekening2_id, rekening3_id, rekening4_id, rekening5_id, rekening6_id, sumber_id, jenis, penerima, description, information, volume1, satuan1, volume2, satuan2, volume3, satuan3, volume4, satuan4, volume, satuan, price, total, sebelum, created_at, created_by, updated_at, updated_by, is_deleted, deleted_at, deleted_by)
select *
from (
	select a.id                                                                                                     as id
		 , a.kode_skpd                                                                                              as skpd_id
		 , a.kode_subskpd                                                                                           as unit_id
		 , a.kode_urusan                                                                                            as urusan_id
		 , a.kode_bidang                                                                                            as bidang_id
		 , replace(a.kode_program1, 'X', '0')                                                                       as program_id
		 , replace(a.kode_program, 'X.XX', a.kode_bidang)                                                           as program_code
		 , replace(a.kode_kegiatan1, 'X', '0')                                                                      as kegiatan_id
		 , replace(a.kode_kegiatan, 'X.XX', a.kode_bidang)                                                          as kegiatan_code
		 , replace(a.kode_subkegiatan1, 'X', '0')                                                                   as subkegiatan_id
		 , replace(a.kode_subkegiatan, 'X.XX', a.kode_bidang)                                                       as subkegiatan_code
		 , a.kode_fungsi                                                                                            as fungsi_id
		 , a.kode_subfungsi                                                                                         as subfungsi_id
		 , a.kode_rekening1                                                                                         as rekening1_id
		 , a.kode_rekening2                                                                                         as rekening2_id
		 , a.kode_rekening3                                                                                         as rekening3_id
		 , a.kode_rekening4                                                                                         as rekening4_id
		 , a.kode_rekening5                                                                                         as rekening5_id
		 , a.kode_rekening6                                                                                         as rekening6_id
		 , coalesce(a.kode_sumber6, a.kode_sumber5, a.kode_sumber4, a.kode_sumber3, a.kode_sumber2, a.kode_sumber1) as sumber_id
		 , a.jenis                                                                                                  as jenis
		 , a.teks_penerima                                                                                          as penerima
		 , a.nama_uraian                                                                                            as description
		 , a.nama_keterangan                                                                                        as information
		 , ifnull(a.volume_1, 0)                                                                                    as volume1
		 , a.satuan_1                                                                                               as satuan1
		 , ifnull(a.volume_2, 0)                                                                                    as volume2
		 , a.satuan_2                                                                                               as satuan2
		 , ifnull(a.volume_3, 0)                                                                                    as volume3
		 , a.satuan_3                                                                                               as satuan3
		 , ifnull(a.volume_4, 0)                                                                                    as volume4
		 , a.satuan_4                                                                                               as satuan4
		 , ifnull(a.volume, 0)                                                                                      as volume
		 , a.satuan                                                                                                 as satuan
		 , ifnull(a.harga, 0)                                                                                       as price
		 , ifnull(a.total, 0)                                                                                       as total
		 , ifnull(b.total, 0)                                                                                       as sebelum
		 , a.created_at                                                                                             as created_at
		 , a.created_by                                                                                             as created_by
		 , a.updated_at                                                                                             as updated_at
		 , a.updated_by                                                                                             as updated_by
		 , a.is_deleted                                                                                             as is_deleted
		 , a.deleted_at                                                                                             as deleted_at
		 , a.deleted_by                                                                                             as deleted_by
	from espresso_2025_preproduction.data_penganggaran_pengeluaran_belanja_rincian a
	left join (
		select id_common as id, sum(total) as total
		from espresso_2025_preproduction.data_penganggaran_pengeluaran_belanja_rincian_arsip
		where id_jadwal = 25011
		  and !is_deleted
		group by id_common
	) b on a.id = b.id
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
                      , rekening4_id     = t.rekening4_id
                      , rekening5_id     = t.rekening5_id
                      , rekening6_id     = t.rekening6_id
                      , sumber_id        = t.sumber_id
                      , jenis            = t.jenis
                      , penerima         = t.penerima
                      , description      = t.description
                      , information      = t.information
                      , volume1          = t.volume1
                      , satuan1          = t.satuan1
                      , volume2          = t.volume2
                      , satuan2          = t.satuan2
                      , volume3          = t.volume3
                      , satuan3          = t.satuan3
                      , volume4          = t.volume4
                      , satuan4          = t.satuan4
                      , volume           = t.volume
                      , satuan           = t.satuan
                      , price            = t.price
                      , total            = t.total
                      , sebelum          = t.sebelum
                      , created_at       = t.created_at
                      , created_by       = t.created_by
                      , updated_at       = t.updated_at
                      , updated_by       = t.updated_by
                      , is_deleted       = t.is_deleted
                      , deleted_at       = t.deleted_at
                      , deleted_by       = t.deleted_by