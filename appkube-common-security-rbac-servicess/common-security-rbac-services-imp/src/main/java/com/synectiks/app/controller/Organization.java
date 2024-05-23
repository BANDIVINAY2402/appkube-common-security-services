package com.synectiks.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.synectiks.app.service.OrganizationI;
import com.synectiks.asset.api.controller.OrganizationApi;

@RestController
public class Organization implements OrganizationApi  {
	@Autowired
	private OrganizationI oi;
@Override
public ResponseEntity<com.synectiks.asset.api.model.Organization> organizationAddPost(Boolean pushToCmdb,
		com.synectiks.asset.api.model.Organization organization) {
	
	return oi.add(pushToCmdb,organization);
}
@Override
public ResponseEntity<List<com.synectiks.asset.api.model.Organization>> organizationGetAllOrganizationsGet() {
	List<com.synectiks.asset.api.model.Organization> dd= oi.getall();
	return ResponseEntity.ok(dd);
}
@Override
public ResponseEntity<com.synectiks.asset.api.model.Organization> organizationGetOrganizationByUserNameGet(
		String userName) {
	com.synectiks.asset.api.model.Organization dd=	oi.getbyname(userName);
	return ResponseEntity.ok(dd);
}
@Override
public ResponseEntity<com.synectiks.asset.api.model.Organization> organizationIdIdGet(Long id) {
	com.synectiks.asset.api.model.Organization dd=	oi.getbyid(id);
	return ResponseEntity.ok(dd);
}
@Override
public ResponseEntity<com.synectiks.asset.api.model.Organization> organizationNameOrganizationNameGet(
		String organizationName) {
	com.synectiks.asset.api.model.Organization dd=	oi.getbyOrganizationName(organizationName);
	return ResponseEntity.ok(dd);
}
@Override
public ResponseEntity<com.synectiks.asset.api.model.Organization> organizationProfileByIdIdGet(Long id) {
	
	return OrganizationApi.super.organizationProfileByIdIdGet(id);
}
@Override
public ResponseEntity<com.synectiks.asset.api.model.Organization> organizationProfileByNameNameGet(String name) {
	// TODO Auto-generated method stub
	return OrganizationApi.super.organizationProfileByNameNameGet(name);
}
@Override
public ResponseEntity<com.synectiks.asset.api.model.Organization> organizationPushToCmdbOrganizationNamePost(
		String organizationName) {

	return OrganizationApi.super.organizationPushToCmdbOrganizationNamePost(organizationName);
}
}
