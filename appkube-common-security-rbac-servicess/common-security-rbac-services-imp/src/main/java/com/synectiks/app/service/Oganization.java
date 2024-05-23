package com.synectiks.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.synectiks.app.methods.Methods;
import com.synectiks.app.repo.Organizationrepo;
import com.synectiks.asset.api.model.Organization;


@Service
public class Oganization implements OrganizationI {
@Autowired
private Organizationrepo or;
	@Override
	public ResponseEntity<Organization> add(Boolean pushToCmdb, Organization organization) {
		Organization org=organization;
		com.synectiks.app.entity.Organization og=Methods.modelToEntity(org);
		or.save(og);
		return null;
	}
	@Override
	public List<Organization> getall() {
		List<com.synectiks.app.entity.Organization> org=	or.findAll();
		List<Organization>  og=Methods.entityToModelOrg(org);
		return og;
	}
	@Override
	public Organization getbyname(String userName) {
		com.synectiks.app.entity.Organization o=	or.findByName(userName);
		Organization og=Methods.entitytoModelOrgsingledata(o);
		return og;
	}
	@Override
	public Organization getbyid(Long id) {
		Optional<com.synectiks.app.entity.Organization> o=	or.findById(id);
		System.out.println(o);
		com.synectiks.app.entity.Organization og=o.get();
		Organization og1=Methods.entitytoModelOrgsingledata(og);
		System.out.println(og1);
		return og1;
	}
	@Override
	public Organization getbyOrganizationName(String organizationName) {
		com.synectiks.app.entity.Organization o=	or.findByName(organizationName);
		Organization og=Methods.entitytoModelOrgsingledata(o);
		return og;
	}

	

}
