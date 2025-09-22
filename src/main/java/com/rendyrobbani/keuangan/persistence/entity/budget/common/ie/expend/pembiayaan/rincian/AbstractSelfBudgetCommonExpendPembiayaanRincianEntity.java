package com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.expend.pembiayaan.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.pembiayaan.rincian.SelfBudgetCommonExpendPembiayaanRincian;
import com.rendyrobbani.keuangan.persistence.entity.AbstractSelfEntity;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter(AccessLevel.NONE)
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractSelfBudgetCommonExpendPembiayaanRincianEntity extends AbstractSelfEntity<SelfBudgetCommonExpendPembiayaanRincian> implements SelfBudgetCommonExpendPembiayaanRincian {

}