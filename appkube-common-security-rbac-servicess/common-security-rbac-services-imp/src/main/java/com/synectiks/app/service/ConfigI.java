package com.synectiks.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.synectiks.asset.api.model.Config;

public interface ConfigI {

	ResponseEntity<Config> add(Config config);

	ResponseEntity<String> deleteConfig(Long id);

	List<Config> getall();

	Config getbyid(Long id);

	Config getbykey(String key);

	List<Config> getbystatus(String status);

	List<Config> getbyOrgId(Long organizationId);

	Config getbyKeyAndOrgId(String key, Long organizationId);

}
