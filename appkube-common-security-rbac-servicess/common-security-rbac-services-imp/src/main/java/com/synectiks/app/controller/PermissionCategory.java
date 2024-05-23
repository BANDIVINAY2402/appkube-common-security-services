package com.synectiks.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.app.service.PermissionCategoryI;
import com.synectiks.asset.api.controller.PermissionCategoriesApi;
import com.synectiks.asset.api.controller.PermissionsApi;
import com.synectiks.asset.api.model.Organization;
import com.synectiks.asset.api.model.Permission;

import jakarta.persistence.Id;

@RestController("permissionCategoryController")
public class PermissionCategory implements PermissionCategoriesApi {
	
@Autowired
private PermissionCategoryI pi;
@Override
	public ResponseEntity<Void> permissionCategoriesPost(
			com.synectiks.asset.api.model.PermissionCategory permissionCategory) {
		// TODO Auto-generated method stub
		return pi.add(permissionCategory);
	}

@Override
	public ResponseEntity<List<com.synectiks.asset.api.model.PermissionCategory>> permissionCategoriesGet() {
	List<com.synectiks.asset.api.model.PermissionCategory> dd= pi.getAll();
	return ResponseEntity.ok(dd);
	}

@Override
	public ResponseEntity<Void> permissionCategoriesIdDelete(Long id) {
		
		return pi.delete(id);
	}
@Override
	public ResponseEntity<com.synectiks.asset.api.model.PermissionCategory> permissionCategoriesIdGet(Long id) {
	com.synectiks.asset.api.model.PermissionCategory dd= pi.getById(id);
	return ResponseEntity.ok(dd);
	}
@Override
	public ResponseEntity<com.synectiks.asset.api.model.PermissionCategory> permissionCategoriesIdPut(Long id) {
		
		return PermissionCategoriesApi.super.permissionCategoriesIdPut(id);
	}

}
