package com.synectiks.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.synectiks.app.service.Permission;
import com.synectiks.app.service.PermissionI;
import com.synectiks.asset.api.controller.PermissionsApi;
import com.synectiks.asset.api.model.Config;

@RestController
public class PermissionController implements PermissionsApi {
	
@Autowired
private PermissionI pi;
@Override
	public ResponseEntity<com.synectiks.asset.api.model.Permission> permissionsCreatePost(
			com.synectiks.asset.api.model.Permission permission) {
		
		return pi.add(permission);
	}
@Override
	public ResponseEntity<Void> permissionsIdDelete(Long id) {
		
		return pi.delete(id);
	}
@Override
	public ResponseEntity<com.synectiks.asset.api.model.Permission> permissionsIdGet(Long id) {
	com.synectiks.asset.api.model.Permission dd= pi.getbyid(id);
	
	return ResponseEntity.ok(dd);
	}
@Override
	public ResponseEntity<List<com.synectiks.asset.api.model.Permission>> permissionsListAllGet() {
	List<com.synectiks.asset.api.model.Permission> dd= pi.getAll();
		return ResponseEntity.ok(dd);
	}
@Override
	public ResponseEntity<com.synectiks.asset.api.model.Permission> permissionsUpdatePost(
			com.synectiks.asset.api.model.Permission permission) {
		
		return pi.add(permission);
	}
@Override
	public ResponseEntity<List<com.synectiks.asset.api.model.Permission>> permissionsCreatePermissionInBatchPost(
			Map<String, List<Object>> requestBody) {
		// TODO Auto-generated method stub
		return PermissionsApi.super.permissionsCreatePermissionInBatchPost(requestBody);
	}
@Override
	public ResponseEntity<Void> permissionsCreatePermissionsByFilePost(MultipartFile inputFile, String str) {
		// TODO Auto-generated method stub
		return PermissionsApi.super.permissionsCreatePermissionsByFilePost(inputFile, str);
	}
@Override
	public ResponseEntity<Void> permissionsDeleteDelete(com.synectiks.asset.api.model.Permission permission) {
	
		return PermissionsApi.super.permissionsDeleteDelete(permission);
	}
}
