package com.synectiks.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.synectiks.app.entity.RoleEntity;
import com.synectiks.app.methods.Methods;
import com.synectiks.app.repo.Organizationrepo;
import com.synectiks.app.repo.Permissionrepo;
import com.synectiks.app.repo.PolicyRepo;
import com.synectiks.app.repo.RoleRepo;
import com.synectiks.asset.api.model.Role;

import jakarta.transaction.Transactional;

@Service
public class RoleService implements RoleInterface {

	@Autowired
	private RoleRepo rr;
	@Autowired
	private Organizationrepo or;
	@Autowired
	private Permissionrepo pr;
	@Autowired
	private PolicyRepo pl;
	
	@Override
	public ResponseEntity<Role> add(Role role) {
		RoleEntity re=Methods.RoleModelToEntity(role);
		
		rr.save(re);
		return null;
	}

	@Override
	public List<Role> getAll() {
	List<RoleEntity> r=	rr.findAll();
	List<Role> role=Methods.RoleListEntityToModel(r);
		return role;
	}

	@Override
	public Role getbyId(Integer id) {
		RoleEntity re=  rr.findById(id);
		Role rr=Methods.RoleListEntityToModel(re);
		return rr;
	}

	@Override
	public Role getbyIdAndName(String userName, Integer roleId) {
		RoleEntity re= 	rr.findByNameAndId(userName,roleId);
		Role rr=Methods.RoleListEntityToModel(re);
		return rr;
	}

	@Override
	@Transactional
	public ResponseEntity<Void> deleteRoleById(Integer id) {
		rr.deleteById(id);
		return null;
	}

	

}
