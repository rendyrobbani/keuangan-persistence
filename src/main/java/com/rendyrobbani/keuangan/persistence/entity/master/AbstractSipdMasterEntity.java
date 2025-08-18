package com.rendyrobbani.keuangan.persistence.entity.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.SipdMasterEntity;
import com.rendyrobbani.keuangan.persistence.entity.AbstractSipdEntity;
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
public abstract class AbstractSipdMasterEntity<DOMAIN extends SipdMasterEntity<SUBJECT, SUBJECTID, ID>, SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID, ID> extends AbstractSipdEntity<DOMAIN, SUBJECT, SUBJECTID, ID> implements SipdMasterEntity<SUBJECT, SUBJECTID, ID> {

}