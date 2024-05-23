package com.synectiks.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.synectiks.app.service.PolicyInterface;
import com.synectiks.asset.api.controller.PoliciesApi;
import com.synectiks.asset.api.model.Policy;
import com.synectiks.asset.api.model.PolicyAssignedPermissions;

@RestController
public class PolicyController  implements PoliciesApi{
@Autowired
private PolicyInterface pi;

@Override
	public ResponseEntity<Policy> policiesPost(Policy policy) {
		
		return pi.add(policy);
	}
@Override
	public ResponseEntity<PolicyAssignedPermissions> policiesPolicyAssignedPermissionsPost(
			PolicyAssignedPermissions policyAssignedPermissions) {
		
		return pi.addpolicyAssignedPermissions(policyAssignedPermissions);
	}

	
	@Override
		public ResponseEntity<List<Policy>> policiesGet() {
		List<Policy> dd= pi.getAll();
		return ResponseEntity.ok(dd);
		}
	@Override
		public ResponseEntity<Void> policiesIdDelete(Long id) {
			// TODO Auto-generated method stub
			return pi.deletebyid(id);
		}
	@Override
		public ResponseEntity<Policy> policiesIdGet(Long id) {
		Policy dd= pi.getbyid(id);
		return ResponseEntity.ok(dd);
		}
	@Override
		public ResponseEntity<List<PolicyAssignedPermissions>> policiesPolicyAssignedPermissionsGet() {
		List<PolicyAssignedPermissions> dd= pi.getAllPolicyAssignedPermission();
		return ResponseEntity.ok(dd);
		}
}
