package com.rendyrobbani.keuangan.persistence.entity.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.AbstractDataEntity;
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
public abstract class AbstractDataMasterEntity<DOMAIN extends DataMasterEntity<ID>, ID> extends AbstractDataEntity<DOMAIN, ID> implements DataMasterEntity<ID> {

}