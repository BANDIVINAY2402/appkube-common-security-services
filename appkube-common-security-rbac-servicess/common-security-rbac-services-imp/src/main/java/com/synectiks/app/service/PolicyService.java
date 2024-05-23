package com.synectiks.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.synectiks.app.entity.PolicyEntity;
import com.synectiks.app.methods.Methods;
import com.synectiks.app.repo.PolicyAssignedRepo;
import com.synectiks.app.repo.PolicyRepo;
import com.synectiks.asset.api.model.Policy;
import com.synectiks.asset.api.model.PolicyAssignedPermissions;

@Service
public class PolicyService implements PolicyInterface {
@Autowired
private PolicyRepo pr;
@Autowired
private PolicyAssignedRepo pa;
	@Override
	public ResponseEntity<Policy> add(Policy policy) {
		PolicyEntity pe=Methods.PolicyModelToEntity(policy);
	pr.save(pe);
	

		return null;
	}
	@Override
	public ResponseEntity<PolicyAssignedPermissions> addpolicyAssignedPermissions(
			PolicyAssignedPermissions policyAssignedPermissions) {
		com.synectiks.app.entity.PolicyAssignedPermissions pol=Methods.PolicyAssignedModelToEntity(policyAssignedPermissions);
		pa.save(pol);
		return null;
	}
	@Override
	public List<Policy> getAll() {
		List<PolicyEntity> policy= pr.findAll();
		List<Policy> p=Methods.PolicyListEntityToModel(policy);
		return p;
	}
	@Override
	public ResponseEntity<Void> deletebyid(Long id) {
		pr.deleteById(id);
		return null;
	}
	@Override
	public Policy getbyid(Long id) {
		Optional<PolicyEntity> pe=pr.findById(id);
		PolicyEntity policyentity=pe.get();
		Policy policy=Methods.PolicyEntityToModel(policyentity);
		return policy;
	}
	@Override
	public List<PolicyAssignedPermissions> getAllPolicyAssignedPermission() {
		List<com.synectiks.app.entity.PolicyAssignedPermissions> pol=pa.findAll();
		List<PolicyAssignedPermissions> p=Methods.PolicyAssigendListEntityToModel(pol);
		return p;
	}

}
