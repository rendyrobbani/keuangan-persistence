package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.belanja.rekening;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.rekening.DataBudgetCommonExpendBelanjaRekening;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.fungsi.DataMasterFungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.kegiatan.DataMasterKegiatanEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.program.DataMasterProgramEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja1.DataMasterBelanja1Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja2.DataMasterBelanja2Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja3.DataMasterBelanja3Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja4.DataMasterBelanja4Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja5.DataMasterBelanja5Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6Entity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subfungsi.DataMasterSubfungsiEntity;
import com.rendyrobbani.keuangan.persistence.entity.master.classification.subkegiatan.DataMasterSubkegiatanEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Check;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractDataBudgetCommonExpendBelanjaRekeningEntity extends AbstractDataBudgetCommonRekeningEntity<DataBudgetCommonExpendBelanjaRekening> implements DataBudgetCommonExpendBelanjaRekening {

	@Check(constraints = "program_code = if(program_id not like '0.00.01%', program_id, concat(bidang_id, substring(program_id, 5)))")
	@Column(name = "program_code", nullable = false, updatable = false)
	protected String programCode;

	@Column(name = "program_id", nullable = false, updatable = false)
	protected String programId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "program_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterProgramEntity program;

	@Check(constraints = "kegiatan_code = if(kegiatan_id not like '0.00.01%', kegiatan_id, concat(bidang_id, substring(kegiatan_id, 5)))")
	@Column(name = "kegiatan_code", nullable = false, updatable = false)
	protected String kegiatanCode;

	@Column(name = "kegiatan_id", nullable = false, updatable = false)
	protected String kegiatanId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "fungsi_id", referencedColumnName = "fungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "subfungsi_id", referencedColumnName = "subfungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "program_id", referencedColumnName = "program_id", insertable = false, updatable = false),
			@JoinColumn(name = "kegiatan_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterKegiatanEntity kegiatan;

	@Check(constraints = "subkegiatan_code = if(subkegiatan_id not like '0.00.01%', subkegiatan_id, concat(bidang_id, substring(subkegiatan_id, 5)))")
	@Column(name = "subkegiatan_code", nullable = false, updatable = false)
	protected String subkegiatanCode;

	@Column(name = "subkegiatan_id", nullable = false, updatable = false)
	protected String subkegiatanId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "fungsi_id", referencedColumnName = "fungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "subfungsi_id", referencedColumnName = "subfungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "program_id", referencedColumnName = "program_id", insertable = false, updatable = false),
			@JoinColumn(name = "kegiatan_id", referencedColumnName = "kegiatan_id", insertable = false, updatable = false),
			@JoinColumn(name = "subkegiatan_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterSubkegiatanEntity subkegiatan;

	@Column(name = "fungsi_id", nullable = false, updatable = false)
	protected String fungsiId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "fungsi_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterFungsiEntity fungsi;

	@Column(name = "subfungsi_id", nullable = false, updatable = false)
	protected String subfungsiId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "fungsi_id", referencedColumnName = "fungsi_id", insertable = false, updatable = false),
			@JoinColumn(name = "subfungsi_id", referencedColumnName = "id", insertable = false, updatable = false)
	})
	protected DataMasterSubfungsiEntity subfungsi;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterBelanja1Entity rekening1;

	@Check(constraints = "rekening2_id = '6.2'")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterBelanja2Entity rekening2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterBelanja3Entity rekening3;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterBelanja4Entity rekening4;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "rekening4_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening5_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterBelanja5Entity rekening5;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "rekening1_id", referencedColumnName = "rekening1_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening2_id", referencedColumnName = "rekening2_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening3_id", referencedColumnName = "rekening3_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening4_id", referencedColumnName = "rekening4_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening5_id", referencedColumnName = "rekening5_id", insertable = false, updatable = false),
			@JoinColumn(name = "rekening6_id", referencedColumnName = "id", insertable = false, updatable = false),
	})
	protected DataMasterBelanja6Entity rekening6;

}