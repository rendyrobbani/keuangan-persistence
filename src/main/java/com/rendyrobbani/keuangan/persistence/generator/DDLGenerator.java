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
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.DataMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kelurahan.SipdMasterKelurahanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.DataMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.LogsMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.organisasi.SipdMasterOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.SipdMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.DataMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.provinsi.SipdMasterProvinsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.DataMasterRekeningAset1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset1.SipdMasterRekeningAset1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.DataMasterRekeningAset2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset2.SipdMasterRekeningAset2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.DataMasterRekeningAset3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset3.SipdMasterRekeningAset3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.DataMasterRekeningAset4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset4.SipdMasterRekeningAset4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.DataMasterRekeningAset5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset5.SipdMasterRekeningAset5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.DataMasterRekeningAset6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.aset.aset6.SipdMasterRekeningAset6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.DataMasterRekeningKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban1.SipdMasterRekeningKewajiban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.DataMasterRekeningKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban2.SipdMasterRekeningKewajiban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.DataMasterRekeningKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban3.SipdMasterRekeningKewajiban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.DataMasterRekeningKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban4.SipdMasterRekeningKewajiban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.DataMasterRekeningKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban5.SipdMasterRekeningKewajiban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.DataMasterRekeningKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.kewajiban.kewajiban6.SipdMasterRekeningKewajiban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.DataMasterRekeningEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas1.SipdMasterRekeningEkuitas1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.DataMasterRekeningEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas2.SipdMasterRekeningEkuitas2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.DataMasterRekeningEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas3.SipdMasterRekeningEkuitas3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.DataMasterRekeningEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas4.SipdMasterRekeningEkuitas4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.DataMasterRekeningEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas5.SipdMasterRekeningEkuitas5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.DataMasterRekeningEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.ekuitas.ekuitas6.SipdMasterRekeningEkuitas6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.DataMasterRekeningPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan1.SipdMasterRekeningPendapatan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.DataMasterRekeningPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan2.SipdMasterRekeningPendapatan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.DataMasterRekeningPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan3.SipdMasterRekeningPendapatan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.DataMasterRekeningPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan4.SipdMasterRekeningPendapatan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.DataMasterRekeningPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan5.SipdMasterRekeningPendapatan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan.pendapatan6.SipdMasterRekeningPendapatan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.DataMasterRekeningBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.SipdMasterRekeningBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.DataMasterRekeningBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.SipdMasterRekeningBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.DataMasterRekeningBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.SipdMasterRekeningBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.DataMasterRekeningBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.SipdMasterRekeningBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.DataMasterRekeningBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.SipdMasterRekeningBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.SipdMasterRekeningBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.DataMasterRekeningPembiayaan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan1.SipdMasterRekeningPembiayaan1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.DataMasterRekeningPembiayaan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan2.SipdMasterRekeningPembiayaan2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.DataMasterRekeningPembiayaan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan3.SipdMasterRekeningPembiayaan3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.DataMasterRekeningPembiayaan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan4.SipdMasterRekeningPembiayaan4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.DataMasterRekeningPembiayaan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan5.SipdMasterRekeningPembiayaan5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.SipdMasterRekeningPembiayaan6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.DataMasterRekeningPendapatanLo1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo1.SipdMasterRekeningPendapatanLo1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.DataMasterRekeningPendapatanLo2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2.SipdMasterRekeningPendapatanLo2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.DataMasterRekeningPendapatanLo3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo3.SipdMasterRekeningPendapatanLo3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.DataMasterRekeningPendapatanLo4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4.SipdMasterRekeningPendapatanLo4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.DataMasterRekeningPendapatanLo5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo5.SipdMasterRekeningPendapatanLo5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.DataMasterRekeningPendapatanLo6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo6.SipdMasterRekeningPendapatanLo6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.DataMasterRekeningBeban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban1.SipdMasterRekeningBeban1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.DataMasterRekeningBeban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban2.SipdMasterRekeningBeban2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.DataMasterRekeningBeban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban3.SipdMasterRekeningBeban3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.DataMasterRekeningBeban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban4.SipdMasterRekeningBeban4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.DataMasterRekeningBeban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban5.SipdMasterRekeningBeban5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.DataMasterRekeningBeban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.beban.beban6.SipdMasterRekeningBeban6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi.DataMasterSubfungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.SipdMasterSubkegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.DataMasterUrusanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.urusan.SipdMasterUrusanEntity;
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

			entityClasses.add(DataMasterRekeningAset1Entity.class);
			entityClasses.add(SipdMasterRekeningAset1Entity.class);
			entityClasses.add(DataMasterRekeningAset2Entity.class);
			entityClasses.add(SipdMasterRekeningAset2Entity.class);
			entityClasses.add(DataMasterRekeningAset3Entity.class);
			entityClasses.add(SipdMasterRekeningAset3Entity.class);
			entityClasses.add(DataMasterRekeningAset4Entity.class);
			entityClasses.add(SipdMasterRekeningAset4Entity.class);
			entityClasses.add(DataMasterRekeningAset5Entity.class);
			entityClasses.add(SipdMasterRekeningAset5Entity.class);
			entityClasses.add(DataMasterRekeningAset6Entity.class);
			entityClasses.add(SipdMasterRekeningAset6Entity.class);

			entityClasses.add(DataMasterRekeningKewajiban1Entity.class);
			entityClasses.add(SipdMasterRekeningKewajiban1Entity.class);
			entityClasses.add(DataMasterRekeningKewajiban2Entity.class);
			entityClasses.add(SipdMasterRekeningKewajiban2Entity.class);
			entityClasses.add(DataMasterRekeningKewajiban3Entity.class);
			entityClasses.add(SipdMasterRekeningKewajiban3Entity.class);
			entityClasses.add(DataMasterRekeningKewajiban4Entity.class);
			entityClasses.add(SipdMasterRekeningKewajiban4Entity.class);
			entityClasses.add(DataMasterRekeningKewajiban5Entity.class);
			entityClasses.add(SipdMasterRekeningKewajiban5Entity.class);
			entityClasses.add(DataMasterRekeningKewajiban6Entity.class);
			entityClasses.add(SipdMasterRekeningKewajiban6Entity.class);

			entityClasses.add(DataMasterRekeningEkuitas1Entity.class);
			entityClasses.add(SipdMasterRekeningEkuitas1Entity.class);
			entityClasses.add(DataMasterRekeningEkuitas2Entity.class);
			entityClasses.add(SipdMasterRekeningEkuitas2Entity.class);
			entityClasses.add(DataMasterRekeningEkuitas3Entity.class);
			entityClasses.add(SipdMasterRekeningEkuitas3Entity.class);
			entityClasses.add(DataMasterRekeningEkuitas4Entity.class);
			entityClasses.add(SipdMasterRekeningEkuitas4Entity.class);
			entityClasses.add(DataMasterRekeningEkuitas5Entity.class);
			entityClasses.add(SipdMasterRekeningEkuitas5Entity.class);
			entityClasses.add(DataMasterRekeningEkuitas6Entity.class);
			entityClasses.add(SipdMasterRekeningEkuitas6Entity.class);

			entityClasses.add(DataMasterRekeningPendapatan1Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatan1Entity.class);
			entityClasses.add(DataMasterRekeningPendapatan2Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatan2Entity.class);
			entityClasses.add(DataMasterRekeningPendapatan3Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatan3Entity.class);
			entityClasses.add(DataMasterRekeningPendapatan4Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatan4Entity.class);
			entityClasses.add(DataMasterRekeningPendapatan5Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatan5Entity.class);
			entityClasses.add(DataMasterRekeningPendapatan6Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatan6Entity.class);

			entityClasses.add(DataMasterRekeningBelanja1Entity.class);
			entityClasses.add(SipdMasterRekeningBelanja1Entity.class);
			entityClasses.add(DataMasterRekeningBelanja2Entity.class);
			entityClasses.add(SipdMasterRekeningBelanja2Entity.class);
			entityClasses.add(DataMasterRekeningBelanja3Entity.class);
			entityClasses.add(SipdMasterRekeningBelanja3Entity.class);
			entityClasses.add(DataMasterRekeningBelanja4Entity.class);
			entityClasses.add(SipdMasterRekeningBelanja4Entity.class);
			entityClasses.add(DataMasterRekeningBelanja5Entity.class);
			entityClasses.add(SipdMasterRekeningBelanja5Entity.class);
			entityClasses.add(DataMasterRekeningBelanja6Entity.class);
			entityClasses.add(SipdMasterRekeningBelanja6Entity.class);

			entityClasses.add(DataMasterRekeningPembiayaan1Entity.class);
			entityClasses.add(SipdMasterRekeningPembiayaan1Entity.class);
			entityClasses.add(DataMasterRekeningPembiayaan2Entity.class);
			entityClasses.add(SipdMasterRekeningPembiayaan2Entity.class);
			entityClasses.add(DataMasterRekeningPembiayaan3Entity.class);
			entityClasses.add(SipdMasterRekeningPembiayaan3Entity.class);
			entityClasses.add(DataMasterRekeningPembiayaan4Entity.class);
			entityClasses.add(SipdMasterRekeningPembiayaan4Entity.class);
			entityClasses.add(DataMasterRekeningPembiayaan5Entity.class);
			entityClasses.add(SipdMasterRekeningPembiayaan5Entity.class);
			entityClasses.add(DataMasterRekeningPembiayaan6Entity.class);
			entityClasses.add(SipdMasterRekeningPembiayaan6Entity.class);

			entityClasses.add(DataMasterRekeningPendapatanLo1Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatanLo1Entity.class);
			entityClasses.add(DataMasterRekeningPendapatanLo2Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatanLo2Entity.class);
			entityClasses.add(DataMasterRekeningPendapatanLo3Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatanLo3Entity.class);
			entityClasses.add(DataMasterRekeningPendapatanLo4Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatanLo4Entity.class);
			entityClasses.add(DataMasterRekeningPendapatanLo5Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatanLo5Entity.class);
			entityClasses.add(DataMasterRekeningPendapatanLo6Entity.class);
			entityClasses.add(SipdMasterRekeningPendapatanLo6Entity.class);

			entityClasses.add(DataMasterRekeningBeban1Entity.class);
			entityClasses.add(SipdMasterRekeningBeban1Entity.class);
			entityClasses.add(DataMasterRekeningBeban2Entity.class);
			entityClasses.add(SipdMasterRekeningBeban2Entity.class);
			entityClasses.add(DataMasterRekeningBeban3Entity.class);
			entityClasses.add(SipdMasterRekeningBeban3Entity.class);
			entityClasses.add(DataMasterRekeningBeban4Entity.class);
			entityClasses.add(SipdMasterRekeningBeban4Entity.class);
			entityClasses.add(DataMasterRekeningBeban5Entity.class);
			entityClasses.add(SipdMasterRekeningBeban5Entity.class);
			entityClasses.add(DataMasterRekeningBeban6Entity.class);
			entityClasses.add(SipdMasterRekeningBeban6Entity.class);

			entityClasses = entityClasses.stream().filter(entityClass -> entityClass.isAnnotationPresent(Table.class)).toList();
		}
		return entityClasses;
	}

	private static String type(Field field) {
		Column column = field.getAnnotation(Column.class);
		if (List.of(Long.class, long.class).contains(field.getType())) return "bigint";
		if (List.of(Integer.class, int.class).contains(field.getType())) return "int";
		if (List.of(Short.class, short.class).contains(field.getType())) return "smallint";
		if (List.of(Byte.class, byte.class, Gender.class, JabatanStatus.class).contains(field.getType())) return "tinyint";
		if (List.of(Boolean.class, boolean.class).contains(field.getType())) return "bit";
		if (List.of(Double.class, double.class).contains(field.getType())) return "double";
		if (List.of(Float.class, float.class).contains(field.getType())) return "float";
		if (field.getType() == LocalDate.class) return "date";
		if (field.getType() == LocalDateTime.class) return "datetime";
		if (field.getType() == BigDecimal.class) return "decimal(38, 2)";
		if (List.of(Character.class, char.class, Pangkat.class).contains(field.getType())) return "char(" + column.length() + ")";
		if (List.of(String.class, BelanjaJenis.class, BelanjaLokus.class).contains(field.getType())) return "varchar(" + column.length() + ")";
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