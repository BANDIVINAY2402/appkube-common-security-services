package com.synectiks.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.synectiks.app.methods.Methods;
import com.synectiks.app.repo.Organizationrepo;
import com.synectiks.app.repo.Permissionrepo;
import com.synectiks.asset.api.model.Organization;

@Service
public class Permission implements PermissionI {
@Autowired
private Permissionrepo pr;
@Autowired
private Organizationrepo or;
	@Override
	public ResponseEntity<com.synectiks.asset.api.model.Permission> add(
			com.synectiks.asset.api.model.Permission permission) {
		
		Organization org=permission.getOrganization();
		com.synectiks.app.entity.Organization og=Methods.modelToEntity(org);
		og=or.save(og);
		com.synectiks.app.entity.Permission per=Methods.permissionModelToEntity(permission);
		per.setOrganization(og);
		pr.save(per);
		
		return null;
	}
	@Override
	public ResponseEntity<Void> delete(Long id) {
		Long longValue = id;
		Integer integerValue = longValue.intValue();

	pr.deleteById(integerValue);
		return null;
	}
	@Override
	public com.synectiks.asset.api.model.Permission getbyid(Long id) {
		Long longValue = id;
		Integer integerValue = longValue.intValue();
		Optional<com.synectiks.app.entity.Permission> per=pr.findById(integerValue);
		com.synectiks.app.entity.Permission permission=per.get();
		com.synectiks.asset.api.model.Permission pp=Methods.permissionEntityToModel(permission);
		return pp;
	}
	@Override
	public List<com.synectiks.asset.api.model.Permission> getAll() {
		List<com.synectiks.app.entity.Permission> per=pr.findAll();
		List<com.synectiks.asset.api.model.Permission> pp=Methods.PermissionListEntityToModel(per);
		return pp;
	}

}
