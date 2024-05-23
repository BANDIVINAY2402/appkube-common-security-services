package com.synectiks.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.synectiks.asset.api.model.Policy;
import com.synectiks.asset.api.model.PolicyAssignedPermissions;

public interface PolicyInterface {

	
	ResponseEntity<Policy> add(Policy policy);

	ResponseEntity<PolicyAssignedPermissions> addpolicyAssignedPermissions(
			PolicyAssignedPermissions policyAssignedPermissions);

	List<Policy> getAll();

	ResponseEntity<Void> deletebyid(Long id);


	Policy getbyid(Long id);

	List<PolicyAssignedPermissions> getAllPolicyAssignedPermission();

}
