package com.synectiks.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.synectiks.asset.api.model.Organization;

public interface OrganizationI {

	ResponseEntity<Organization> add(Boolean pushToCmdb, Organization organization);

	List<Organization> getall();

	

	Organization getbyname(String userName);

	Organization getbyid(Long id);

	Organization getbyOrganizationName(String organizationName);

}
