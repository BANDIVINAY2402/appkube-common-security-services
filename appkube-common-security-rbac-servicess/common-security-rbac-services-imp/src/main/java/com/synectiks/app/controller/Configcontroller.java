package com.synectiks.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.synectiks.app.service.ConfigI;
import com.synectiks.asset.api.controller.ConfigApi;
import com.synectiks.asset.api.model.Config;
@RestController
public class Configcontroller implements ConfigApi {
	@Autowired
	private ConfigI ci;
	@Override
	public ResponseEntity<com.synectiks.asset.api.model.Config> createConfig(
			com.synectiks.asset.api.model.Config config) {
		
		return ci.add(config);
	}
	@Override
	public ResponseEntity<String> deleteConfigById(Long id) {
	
		return ci.deleteConfig(id);
	}
	@Override
	public ResponseEntity<List<Config>> findAllConfigs() {
		List<Config> dd= ci.getall();
		
		return ResponseEntity.ok(dd);
	}
	@Override
	public ResponseEntity<Config> findConfigById(Long id) {
		Config cc=ci.getbyid(id);
		
		return ResponseEntity.ok(cc);
	}
	@Override
	public ResponseEntity<Config> findConfigByKey(String key) {
		Config cc=ci.getbykey(key);
		return ResponseEntity.ok(cc);
	}
	@Override
	public ResponseEntity<List<Config>> findConfigsByStatus(String status) {
		List<Config> cc=ci.getbystatus(status);
		return ResponseEntity.ok(cc);
	}
	@Override
	public ResponseEntity<List<Config>> findConfigsByOrgId(Long organizationId) {
		List<Config> cc=ci.getbyOrgId(organizationId);
		return ResponseEntity.ok(cc);
	}
	@Override
	public ResponseEntity<Config> findConfigByKeyAndOrgId(String key, Long organizationId) {
		Config cc=ci.getbyKeyAndOrgId(key,organizationId);
		 return ResponseEntity.ok(cc);
	}
	@Override
	public ResponseEntity<List<Config>> findConfigsByCreatedBy(String createdBy) {
		// TODO Auto-generated method stub
		return ConfigApi.super.findConfigsByCreatedBy(createdBy);
	}
	@Override
	public ResponseEntity<List<Config>> findConfigsByUpdatedBy(String updatedBy) {
		// TODO Auto-generated method stub
		return ConfigApi.super.findConfigsByUpdatedBy(updatedBy);
	}
	@Override
	public ResponseEntity<Config> createEncryptedConfig(Config config) {
		// TODO Auto-generated method stub
		return ConfigApi.super.createEncryptedConfig(config);
	}
}
