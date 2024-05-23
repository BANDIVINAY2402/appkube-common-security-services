package com.synectiks.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.synectiks.app.entity.Permission;
import com.synectiks.app.methods.Methods;
import com.synectiks.app.repo.Organizationrepo;
import com.synectiks.app.repo.Permissionrepo;
import com.synectiks.asset.api.model.Organization;

@Service("permissionCategoryService")
public class PermissionCategory implements PermissionCategoryI{
@Autowired
private com.synectiks.app.repo.PermissionCategory pc;
@Autowired
private Organizationrepo or;
@Autowired
private Permissionrepo pr;

	@Override
	public ResponseEntity<Void> add(com.synectiks.asset.api.model.PermissionCategory permissionCategory) {
	com.synectiks.app.entity.PermissionCategory per=Methods.permissionCategoryModelToEntity(permissionCategory);
	com.synectiks.app.entity.Organization og=per.getOrganization();
		og=or.save(og);
		per.setOrganization(og);
		
  List<Permission> pe=per.getPermissions();
  for (Permission permission : pe) {
	    com.synectiks.app.entity.Organization organization = permission.getOrganization();
	    or.save(organization);
	    System.out.println("Organization name: " + organization.getName());
	}
  System.out.println(pe);
   pe=pr.saveAll(pe);
	 per.setPermissions(pe);
	 
		pc.save(per);
		return null;
	}

	@Override
	public List<com.synectiks.asset.api.model.PermissionCategory> getAll() {
		List<com.synectiks.app.entity.PermissionCategory> per=pc.findAll();
		List<com.synectiks.asset.api.model.PermissionCategory> permission=Methods.PermissionCategoryListEntityToModel(per);
		return permission;
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		pc.deleteById(id);
		return null;
	}

	@Override
	public com.synectiks.asset.api.model.PermissionCategory getById(Long id) {
		Optional<com.synectiks.app.entity.PermissionCategory> per=pc.findById(id);
		com.synectiks.app.entity.PermissionCategory permission=per.get();
		
		com.synectiks.asset.api.model.PermissionCategory pm=Methods.PermissionCategoryEntityToModel(permission);
		return pm;
	}

	
}
