package com.synectiks.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.synectiks.app.methods.Methods;
import com.synectiks.app.repo.Configrepos;
import com.synectiks.app.repo.Organizationrepo;



@Service
public class Config implements ConfigI {

	@Autowired
	private Organizationrepo or;
	@Autowired
	private Configrepos cr;
	@Override
	public ResponseEntity<com.synectiks.asset.api.model.Config> add(com.synectiks.asset.api.model.Config config) {
		com.synectiks.asset.api.model.Organization dt=config.getOrganization();
		com.synectiks.app.entity.Organization og=Methods.modelToEntity(dt);
		og=or.save(og);
	  com.synectiks.app.entity.Config cf=	Methods.configModelToEntity(config);
	    cf.setOrganization(og);
     cr.save(cf);
		return null;
	}
	@Override
	public ResponseEntity<String> deleteConfig(Long id) {
		cr.deleteById(id);
		return null;
	}
	@Override
	public List<com.synectiks.asset.api.model.Config> getall() {
	List<com.synectiks.app.entity.Config> con=cr.findAll();
	List<com.synectiks.asset.api.model.Config> cf=Methods.configListEntityToModel(con);
	
		return cf;
	}
	@Override
	public com.synectiks.asset.api.model.Config getbyid(Long id) {
		Optional<com.synectiks.app.entity.Config> cf=cr.findById(id);
		com.synectiks.app.entity.Config co= cf.get();
		com.synectiks.asset.api.model.Config config=Methods.configEntityToModel(co);

		return config;
	}
	@Override
	public com.synectiks.asset.api.model.Config getbykey(String key) {
		com.synectiks.app.entity.Config con=cr.findByKey(key);
		com.synectiks.asset.api.model.Config config=Methods.configEntityToModel(con);
		return config;
	}
	@Override
	public List<com.synectiks.asset.api.model.Config> getbystatus(String status) {
		List<com.synectiks.app.entity.Config> con=cr.findByStatus(status);
		List<com.synectiks.asset.api.model.Config> cf=Methods.configListEntityToModel(con);
		return cf;
	}
	@Override
	public List<com.synectiks.asset.api.model.Config> getbyOrgId(Long organizationId) {
		List<com.synectiks.app.entity.Config> config=cr.findByOrganizationId(organizationId);
		List<com.synectiks.asset.api.model.Config> cf=Methods.configListEntityToModel(config);
		return cf;
	}
	@Override
	public com.synectiks.asset.api.model.Config getbyKeyAndOrgId(String key, Long organizationId) {
		com.synectiks.app.entity.Config	config=cr.findByKeyAndOrganizationId(key, organizationId);
		com.synectiks.asset.api.model.Config config1=Methods.configEntityToModel(config);
		return config1;
	}
	

}
