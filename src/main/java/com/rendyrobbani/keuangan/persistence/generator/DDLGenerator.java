package com.rendyrobbani.keuangan.persistence.generator;

import com.rendyrobbani.keuangan.core.domain.vo.*;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.DataMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.bidang.SipdMasterBidangEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.DataMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kabupaten.SipdMasterKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.DataMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kecamatan.SipdMasterKecamatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.DataMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.SipdMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok.DataMasterKelompokEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelompok.SipdMasterKelompokEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.DataMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.SipdMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.LogsMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.SipdMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.SipdMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.SipdMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.DataMasterAset1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.SipdMasterAset1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.DataMasterAset2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.SipdMasterAset2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.DataMasterAset3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.SipdMasterAset3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.DataMasterAset4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.SipdMasterAset4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.DataMasterAset5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.SipdMasterAset5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.DataMasterAset6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.SipdMasterAset6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.SipdMasterPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.SipdMasterPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.SipdMasterPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.SipdMasterPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.SipdMasterPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.SipdMasterPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.DataMasterBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.SipdMasterBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterPembiayaan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.SipdMasterPembiayaan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterPembiayaan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.SipdMasterPembiayaan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterPembiayaan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.SipdMasterPembiayaan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterPembiayaan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.SipdMasterPembiayaan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterPembiayaan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.SipdMasterPembiayaan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.SipdMasterPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.DataMasterPendapatanLo1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.SipdMasterPendapatanLo1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.DataMasterPendapatanLo2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.SipdMasterPendapatanLo2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.DataMasterPendapatanLo3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.SipdMasterPendapatanLo3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.DataMasterPendapatanLo4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.SipdMasterPendapatanLo4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.DataMasterPendapatanLo5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.SipdMasterPendapatanLo5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.DataMasterPendapatanLo6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.SipdMasterPendapatanLo6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.DataMasterBeban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.SipdMasterBeban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.DataMasterBeban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.SipdMasterBeban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.DataMasterBeban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.SipdMasterBeban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.DataMasterBeban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.SipdMasterBeban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.DataMasterBeban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.SipdMasterBeban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.DataMasterBeban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.SipdMasterBeban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi.DataMasterSubfungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.SipdMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber.DataMasterSumberEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.sumber.SipdMasterSumberEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.SipdMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.komponen.DataMasterKomponenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.komponen.SelfMasterKomponenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.penerima.DataMasterPenerimaEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.penerima.SelfMasterPenerimaEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kabupaten.DataMasterPriorityOfKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kabupaten.SelfMasterPriorityOfKabupatenEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kegiatan.DataMasterPriorityOfKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.kegiatan.SelfMasterPriorityOfKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.nasional.DataMasterPriorityOfNasionalEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.nasional.SelfMasterPriorityOfNasionalEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.provinsi.DataMasterPriorityOfProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.priority.provinsi.SelfMasterPriorityOfProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.satuan.DataMasterSatuanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.satuan.SelfMasterSatuanEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.DataUserEntity;
import com.rendyrobbani.keuangan.persistence.entity.user.LogsUserEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.Checks;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DDLGenerator {

	private static List<Class<?>> entityClasses;

	private static List<Class<?>> entityClasses() {
		if (entityClasses == null) {
			entityClasses = new ArrayList<>();

			entityClasses.add(DataUserEntity.class);
			entityClasses.add(LogsUserEntity.class);

			entityClasses.add(DataMasterProvinsiEntity.class);
			entityClasses.add(SipdMasterProvinsiEntity.class);
			entityClasses.add(DataMasterKabupatenEntity.class);
			entityClasses.add(SipdMasterKabupatenEntity.class);
			entityClasses.add(DataMasterKecamatanEntity.class);
			entityClasses.add(SipdMasterKecamatanEntity.class);
			entityClasses.add(DataMasterKelurahanEntity.class);
			entityClasses.add(SipdMasterKelurahanEntity.class);

			entityClasses.add(DataMasterFungsiEntity.class);
			entityClasses.add(DataMasterSubfungsiEntity.class);

			entityClasses.add(DataMasterUrusanEntity.class);
			entityClasses.add(SipdMasterUrusanEntity.class);
			entityClasses.add(DataMasterBidangEntity.class);
			entityClasses.add(SipdMasterBidangEntity.class);
			entityClasses.add(DataMasterProgramEntity.class);
			entityClasses.add(SipdMasterProgramEntity.class);
			entityClasses.add(DataMasterKegiatanEntity.class);
			entityClasses.add(SipdMasterKegiatanEntity.class);
			entityClasses.add(DataMasterSubkegiatanEntity.class);
			entityClasses.add(SipdMasterSubkegiatanEntity.class);

			entityClasses.add(DataMasterOrganisasiEntity.class);
			entityClasses.add(LogsMasterOrganisasiEntity.class);
			entityClasses.add(SipdMasterOrganisasiEntity.class);

			entityClasses.add(DataMasterAset1Entity.class);
			entityClasses.add(SipdMasterAset1Entity.class);
			entityClasses.add(DataMasterAset2Entity.class);
			entityClasses.add(SipdMasterAset2Entity.class);
			entityClasses.add(DataMasterAset3Entity.class);
			entityClasses.add(SipdMasterAset3Entity.class);
			entityClasses.add(DataMasterAset4Entity.class);
			entityClasses.add(SipdMasterAset4Entity.class);
			entityClasses.add(DataMasterAset5Entity.class);
			entityClasses.add(SipdMasterAset5Entity.class);
			entityClasses.add(DataMasterAset6Entity.class);
			entityClasses.add(SipdMasterAset6Entity.class);

			entityClasses.add(DataMasterKewajiban1Entity.class);
			entityClasses.add(SipdMasterKewajiban1Entity.class);
			entityClasses.add(DataMasterKewajiban2Entity.class);
			entityClasses.add(SipdMasterKewajiban2Entity.class);
			entityClasses.add(DataMasterKewajiban3Entity.class);
			entityClasses.add(SipdMasterKewajiban3Entity.class);
			entityClasses.add(DataMasterKewajiban4Entity.class);
			entityClasses.add(SipdMasterKewajiban4Entity.class);
			entityClasses.add(DataMasterKewajiban5Entity.class);
			entityClasses.add(SipdMasterKewajiban5Entity.class);
			entityClasses.add(DataMasterKewajiban6Entity.class);
			entityClasses.add(SipdMasterKewajiban6Entity.class);

			entityClasses.add(DataMasterEkuitas1Entity.class);
			entityClasses.add(SipdMasterEkuitas1Entity.class);
			entityClasses.add(DataMasterEkuitas2Entity.class);
			entityClasses.add(SipdMasterEkuitas2Entity.class);
			entityClasses.add(DataMasterEkuitas3Entity.class);
			entityClasses.add(SipdMasterEkuitas3Entity.class);
			entityClasses.add(DataMasterEkuitas4Entity.class);
			entityClasses.add(SipdMasterEkuitas4Entity.class);
			entityClasses.add(DataMasterEkuitas5Entity.class);
			entityClasses.add(SipdMasterEkuitas5Entity.class);
			entityClasses.add(DataMasterEkuitas6Entity.class);
			entityClasses.add(SipdMasterEkuitas6Entity.class);

			entityClasses.add(DataMasterPendapatan1Entity.class);
			entityClasses.add(SipdMasterPendapatan1Entity.class);
			entityClasses.add(DataMasterPendapatan2Entity.class);
			entityClasses.add(SipdMasterPendapatan2Entity.class);
			entityClasses.add(DataMasterPendapatan3Entity.class);
			entityClasses.add(SipdMasterPendapatan3Entity.class);
			entityClasses.add(DataMasterPendapatan4Entity.class);
			entityClasses.add(SipdMasterPendapatan4Entity.class);
			entityClasses.add(DataMasterPendapatan5Entity.class);
			entityClasses.add(SipdMasterPendapatan5Entity.class);
			entityClasses.add(DataMasterPendapatan6Entity.class);
			entityClasses.add(SipdMasterPendapatan6Entity.class);

			entityClasses.add(DataMasterBelanja1Entity.class);
			entityClasses.add(SipdMasterBelanja1Entity.class);
			entityClasses.add(DataMasterBelanja2Entity.class);
			entityClasses.add(SipdMasterBelanja2Entity.class);
			entityClasses.add(DataMasterBelanja3Entity.class);
			entityClasses.add(SipdMasterBelanja3Entity.class);
			entityClasses.add(DataMasterBelanja4Entity.class);
			entityClasses.add(SipdMasterBelanja4Entity.class);
			entityClasses.add(DataMasterBelanja5Entity.class);
			entityClasses.add(SipdMasterBelanja5Entity.class);
			entityClasses.add(DataMasterBelanja6Entity.class);
			entityClasses.add(SipdMasterBelanja6Entity.class);

			entityClasses.add(DataMasterPembiayaan1Entity.class);
			entityClasses.add(SipdMasterPembiayaan1Entity.class);
			entityClasses.add(DataMasterPembiayaan2Entity.class);
			entityClasses.add(SipdMasterPembiayaan2Entity.class);
			entityClasses.add(DataMasterPembiayaan3Entity.class);
			entityClasses.add(SipdMasterPembiayaan3Entity.class);
			entityClasses.add(DataMasterPembiayaan4Entity.class);
			entityClasses.add(SipdMasterPembiayaan4Entity.class);
			entityClasses.add(DataMasterPembiayaan5Entity.class);
			entityClasses.add(SipdMasterPembiayaan5Entity.class);
			entityClasses.add(DataMasterPembiayaan6Entity.class);
			entityClasses.add(SipdMasterPembiayaan6Entity.class);

			entityClasses.add(DataMasterPendapatanLo1Entity.class);
			entityClasses.add(SipdMasterPendapatanLo1Entity.class);
			entityClasses.add(DataMasterPendapatanLo2Entity.class);
			entityClasses.add(SipdMasterPendapatanLo2Entity.class);
			entityClasses.add(DataMasterPendapatanLo3Entity.class);
			entityClasses.add(SipdMasterPendapatanLo3Entity.class);
			entityClasses.add(DataMasterPendapatanLo4Entity.class);
			entityClasses.add(SipdMasterPendapatanLo4Entity.class);
			entityClasses.add(DataMasterPendapatanLo5Entity.class);
			entityClasses.add(SipdMasterPendapatanLo5Entity.class);
			entityClasses.add(DataMasterPendapatanLo6Entity.class);
			entityClasses.add(SipdMasterPendapatanLo6Entity.class);

			entityClasses.add(DataMasterBeban1Entity.class);
			entityClasses.add(SipdMasterBeban1Entity.class);
			entityClasses.add(DataMasterBeban2Entity.class);
			entityClasses.add(SipdMasterBeban2Entity.class);
			entityClasses.add(DataMasterBeban3Entity.class);
			entityClasses.add(SipdMasterBeban3Entity.class);
			entityClasses.add(DataMasterBeban4Entity.class);
			entityClasses.add(SipdMasterBeban4Entity.class);
			entityClasses.add(DataMasterBeban5Entity.class);
			entityClasses.add(SipdMasterBeban5Entity.class);
			entityClasses.add(DataMasterBeban6Entity.class);
			entityClasses.add(SipdMasterBeban6Entity.class);

			entityClasses.add(DataMasterSumberEntity.class);
			entityClasses.add(SipdMasterSumberEntity.class);

			entityClasses.add(DataMasterKelompokEntity.class);
			entityClasses.add(SipdMasterKelompokEntity.class);

			entityClasses.add(DataMasterPriorityOfNasionalEntity.class);
			entityClasses.add(SelfMasterPriorityOfNasionalEntity.class);
			entityClasses.add(DataMasterPriorityOfProvinsiEntity.class);
			entityClasses.add(SelfMasterPriorityOfProvinsiEntity.class);
			entityClasses.add(DataMasterPriorityOfKabupatenEntity.class);
			entityClasses.add(SelfMasterPriorityOfKabupatenEntity.class);
			entityClasses.add(DataMasterPriorityOfKegiatanEntity.class);
			entityClasses.add(SelfMasterPriorityOfKegiatanEntity.class);

			entityClasses.add(DataMasterSatuanEntity.class);
			entityClasses.add(SelfMasterSatuanEntity.class);

			entityClasses.add(DataMasterPenerimaEntity.class);
			entityClasses.add(SelfMasterPenerimaEntity.class);

			entityClasses.add(DataMasterKomponenEntity.class);
			entityClasses.add(SelfMasterKomponenEntity.class);

			entityClasses = entityClasses.stream().filter(entityClass -> entityClass.isAnnotationPresent(Table.class)).toList();
		}
		return entityClasses;
	}

	private static String type(Field field) {
		Column column = field.getAnnotation(Column.class);
		if (List.of(Long.class,
		            long.class).contains(field.getType())) return "bigint";
		if (List.of(Integer.class,
		            int.class).contains(field.getType())) return "int";
		if (List.of(Short.class,
		            short.class).contains(field.getType())) return "smallint";
		if (List.of(Byte.class,
		            byte.class,
		            Gender.class,
		            JabatanStatus.class,
		            KomponenType.class).contains(field.getType())) return "tinyint";
		if (List.of(Boolean.class,
		            boolean.class).contains(field.getType())) return "bit";
		if (List.of(Double.class,
		            double.class).contains(field.getType())) return "double";
		if (List.of(Float.class,
		            float.class).contains(field.getType())) return "float";
		if (field.getType() == LocalDate.class) return "date";
		if (field.getType() == LocalDateTime.class) return "datetime";
		if (field.getType() == BigDecimal.class) return "decimal(38, 2)";
		if (List.of(Character.class,
		            char.class,
		            Pangkat.class).contains(field.getType())) return "char(" + column.length() + ")";
		if (List.of(String.class,
		            BelanjaJenis.class,
		            BelanjaLokus.class,
		            PenerimaJenis.class).contains(field.getType())) return "varchar(" + column.length() + ")";
		throw new IllegalArgumentException("Type '" + field.getType().getName() + "' is not supported");
	}

	private static List<Field> fields(Class<?> entityClass) {
		List<String> names = new ArrayList<>();
		List<Field> fields = new ArrayList<>();
		Class<?> currentClass = entityClass;
		while (currentClass != null) {
			for (Field field : currentClass.getDeclaredFields()) {
				if ((field.isAnnotationPresent(Column.class) || field.isAnnotationPresent(JoinColumns.class)) && !names.contains(field.getName())) {
					fields.add(field);
					names.add(field.getName());
				}
			}
			currentClass = currentClass.getSuperclass();
		}
		return fields;
	}

	private static List<Field> fieldsOfColumn(Class<?> entityClass) {
		List<Field> fields = new ArrayList<>();
		for (Field field : fields(entityClass)) if (field.isAnnotationPresent(Column.class)) fields.add(field);
		return sortFieldsOfColumn(fields);
	}

	private static List<Field> fieldsOfJoinColumns(Class<?> entityClass) {
		return fields(entityClass).stream().filter(field -> field.isAnnotationPresent(JoinColumns.class)).toList();
	}

	private static List<Field> fieldsOfCheck(Class<?> entityClass) {
		return fields(entityClass).stream().filter(field -> field.isAnnotationPresent(Check.class)).toList();
	}

	private static List<Field> sortFieldsOfColumn(List<Field> fields) {
		Map<Field, Integer> indexes = new HashMap<>();
		for (int i = 0; i < fields.size(); i++) {
			int index = i + 1;
			Column column = fields.get(i).getAnnotation(Column.class);
			if (column.name().equals("id")) index = 0;
			else if (column.name().contains("locked")) index = 1000 + i;
			else if (column.name().contains("created")) index = 2000 + i;
			else if (column.name().contains("updated")) index = 2000 + i;
			else if (column.name().contains("deleted")) index = 2000 + i;
			else if (column.name().contains("logged")) index = 3000 + i;
			else if (column.name().endsWith("_id")) index = 9000 + i;
			indexes.put(fields.get(i), index);
		}
		fields.sort(Comparator.comparing(indexes::get));
		return fields;
	}

	private static String check(Table table, Check check, int index) {
		String name = "ck" + "_" + table.name();
		name = name.length() < 61 ? name : name.substring(0, 61);
		name = name + "_" + String.format("%02d", index);
		return String.join(" ", "constraint", name, "check", "(" + check.constraints() + ")");
	}

	private static String foreignKey(Table table, JoinColumns joinColumns, int index, Field field) {
		String name = "fk" + "_" + table.name();
		name = name.length() < 61 ? name : name.substring(0, 61);
		name = name + "_" + String.format("%02d", index);
		List<String> fromColumns = new ArrayList<>();
		List<String> intoColumns = new ArrayList<>();
		for (JoinColumn joinColumn : joinColumns.value()) {
			fromColumns.add(joinColumn.name());
			intoColumns.add(joinColumn.referencedColumnName());
		}
		return String.join(" ", "constraint", name, "foreign key", "(" + String.join(", ", fromColumns) + ")", "references", field.getType().getAnnotation(Table.class).name(), "(" + String.join(", ", intoColumns) + ")");
	}

	private static String uniqueKey(Table table, UniqueConstraint unique, int index) {
		String name = "uk" + "_" + table.name();
		name = name.length() < 61 ? name : name.substring(0, 61);
		name = name + "_" + String.format("%02d", index);
		return String.join(" ", "constraint", name, "unique key", "(" + String.join(", ", unique.columnNames()) + ")");
	}

	private static List<String> rowsOfColumn(Class<?> entityClass) {
		List<String> rows = new ArrayList<>();
		List<String> colNames = new ArrayList<>();
		List<String> colTypes = new ArrayList<>();
		List<String> colAttrs = new ArrayList<>();

		int maxNames = 0;
		int maxTypes = 0;

		for (Field field : fieldsOfColumn(entityClass)) {
			Column column = field.getAnnotation(Column.class);

			String name = column.name();
			colNames.add(name);
			maxNames = Math.max(maxNames, name.length());

			String type = type(field);
			colTypes.add(type);
			maxTypes = Math.max(maxTypes, type.length());

			boolean nullable = column.nullable();
			boolean increment = false;
			if ((field.getType() == Long.class || field.getType() == long.class) && field.isAnnotationPresent(GeneratedValue.class)) {
				GeneratedValue value = field.getAnnotation(GeneratedValue.class);
				if (value.strategy() == GenerationType.IDENTITY) increment = true;
			}
			colAttrs.add((nullable ? "null" : "not null") + (increment ? " auto_increment" : ""));
		}

		for (int i = 0; i < colNames.size(); i++) {
			List<String> row = new ArrayList<>();

			String colName = colNames.get(i);
			row.add(colName + " ".repeat(maxNames - colName.length()));

			String colType = colTypes.get(i);
			row.add(colType + " ".repeat(maxTypes - colType.length()));

			String colAttr = colAttrs.get(i);
			row.add(colAttr);

			rows.add(String.join(" ", row));
		}
		return rows;
	}

	private static List<String> rowsOfUnique(Class<?> entityClass) {
		List<String> rows = new ArrayList<>();

		Table table = entityClass.getAnnotation(Table.class);
		for (UniqueConstraint unique : table.uniqueConstraints()) rows.add(uniqueKey(table, unique, rows.size() + 1));

		return rows;
	}

	private static List<String> rowsOfForeignKey(Class<?> entityClass) {
		List<String> rows = new ArrayList<>();
		Table table = entityClass.getAnnotation(Table.class);
		for (Field field : fieldsOfJoinColumns(entityClass)) {
			JoinColumns joinColumns = field.getAnnotation(JoinColumns.class);
			rows.add(foreignKey(table, joinColumns, rows.size() + 1, field));
		}
		return rows;
	}

	private static List<String> rowsOfCheck(Class<?> entityClass) {
		Table table = entityClass.getAnnotation(Table.class);
		List<String> rows = new ArrayList<>();
		if (entityClass.isAnnotationPresent(Checks.class)) {
			Checks checks = entityClass.getAnnotation(Checks.class);
			for (Check check : checks.value()) rows.add(check(table, check, rows.size() + 1));
		}
		for (Field field : fieldsOfCheck(entityClass)) {
			Check check = field.getAnnotation(Check.class);
			rows.add(check(table, check, rows.size() + 1));
		}
		return rows;
	}

	@SneakyThrows
	private static String generateDDL(Class<?> entityClass) {
		List<String> ddl = new ArrayList<>();

		Table table = entityClass.getAnnotation(Table.class);

		ddl.add("drop table if exists " + table.name() + ";");
		ddl.add("");
		ddl.add("create or replace table " + table.name() + " (");
		for (String row : rowsOfColumn(entityClass)) ddl.add("\t" + row + ",");
		for (String row : rowsOfCheck(entityClass)) ddl.add("\t" + row + ",");
		for (String row : rowsOfForeignKey(entityClass)) ddl.add("\t" + row + ",");
		for (String row : rowsOfUnique(entityClass)) ddl.add("\t" + row + ",");
		ddl.add("\t" + "primary key (id)");
		ddl.add(") engine = innodb");
		ddl.add("  charset = utf8mb4");
		ddl.add("  collate = utf8mb4_unicode_ci;");
		return String.join(System.lineSeparator(), ddl);
	}

	public static List<String> generateDDLs() {
		List<String> ddl = new ArrayList<>();
		for (Class<?> entityClass : entityClasses()) ddl.add(generateDDL(entityClass));
		return ddl;
	}

	@SneakyThrows
	public static void generateDDLsToFile(File directory) {
		if (directory.exists() || directory.mkdirs()) {
			List<Class<?>> classes = entityClasses();
			for (int i = 0; i < classes.size(); i++) {
				Class<?> entityClass = classes.get(i);
				String ddl = generateDDL(entityClass);

				String fileName = String.format("%03d", i + 1) + "-" + entityClass.getAnnotation(Table.class).name() + ".sql";
				File file = new File(directory, fileName);
				try (FileOutputStream fos = new FileOutputStream(file)) {
					fos.write(ddl.getBytes());
				}
			}
		}
	}

}