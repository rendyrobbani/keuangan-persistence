package com.rendyrobbani.keuangan.persistence.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie.DataBudgetCommonOrganisasiRepository;
import com.rendyrobbani.keuangan.persistence.entity.budget.common.ie.AbstractDataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.persistence.repository.budget.AbstractDataBudgetRepository;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDataBudgetCommonOrganisasiRepository<
		ENTITY extends AbstractDataBudgetCommonOrganisasiEntity<DOMAIN>,
		DOMAIN extends DataBudgetCommonOrganisasiEntity
		>
		extends AbstractDataBudgetRepository<ENTITY, DOMAIN, String>
		implements DataBudgetCommonOrganisasiRepository<DOMAIN> {

	@Override
	@SneakyThrows
	public void deleteAll(Connection connection) {
		this.initClass();
		List<String> sql = new ArrayList<>();
		sql.add("delete from " + this.domainClass.getDeclaredField("TABLE_NAME").get(null));

		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), sql))) {
			statement.execute();
		}
	}

	@Override
	@SneakyThrows
	public void updateAll(Connection connection) {
		this.initClass();
		List<String> sql = new ArrayList<>();
		sql.add("delete from " + this.domainClass.getDeclaredField("TABLE_NAME").get(null));

		try (PreparedStatement statement = connection.prepareStatement(String.join(System.lineSeparator(), sql))) {
			statement.execute();
		}
	}

}