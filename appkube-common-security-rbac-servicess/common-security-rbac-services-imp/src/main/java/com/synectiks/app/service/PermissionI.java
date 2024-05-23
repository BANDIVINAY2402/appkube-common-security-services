package com.synectiks.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.synectiks.asset.api.model.Permission;

public interface PermissionI {

	ResponseEntity<Permission> add(Permission permission);

	ResponseEntity<Void> delete(Long id);

	Permission getbyid(Long id);

	List<Permission> getAll();

}
