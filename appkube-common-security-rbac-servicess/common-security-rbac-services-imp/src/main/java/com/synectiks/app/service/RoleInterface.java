package com.synectiks.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.synectiks.asset.api.model.Role;

public interface RoleInterface {

	ResponseEntity<Role> add(Role role);

	List<Role> getAll();

	Role getbyId(Integer id);

	Role getbyIdAndName(String userName, Integer roleId);

	ResponseEntity<Void> deleteRoleById(Integer id);

}
