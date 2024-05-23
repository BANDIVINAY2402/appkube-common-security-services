package com.synectiks.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import com.synectiks.app.service.RoleInterface;
import com.synectiks.asset.api.controller.RoleApi;
import com.synectiks.asset.api.model.Policy;
import com.synectiks.asset.api.model.Role;

@RestController
public class RoleController implements RoleApi {
	@Autowired
	private RoleInterface ri;
	
	@Override
	public ResponseEntity<Role> createRole(Role role) {
		
		return ri.add(role);
	}

@Override
public ResponseEntity<Role> findRoleById(Integer id) {
	Role dd= ri.getbyId(id);
	return ResponseEntity.ok(dd);
}
@Override
public ResponseEntity<List<Role>> getRoles() {
	List<Role> dd= ri.getAll();
	return ResponseEntity.ok(dd);
}

@Override
public ResponseEntity<List<Role>> roleFindByOwnerGet(String createdBy, Boolean isGroup) {
	
	return RoleApi.super.roleFindByOwnerGet(createdBy, isGroup);
}
@Override
public ResponseEntity<Role> getRoleGroupDetails(String userName, Integer roleId) {
	Role dd= ri.getbyIdAndName(userName,roleId);
	return ResponseEntity.ok(dd);
}
@Override
public ResponseEntity<Void> deleteRoleById(Integer id) {
	
	return ri.deleteRoleById(id);
}
@Override
public ResponseEntity<Role> updateRole(Role role) {
	
	return ri.add(role);
}

}
