package com.synectiks.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.synectiks.asset.api.model.PermissionCategory;

public interface PermissionCategoryI {

	ResponseEntity<Void> add(PermissionCategory permissionCategory);

	List<PermissionCategory> getAll();

	ResponseEntity<Void> delete(Long id);



	PermissionCategory getById(Long id);

}
