package com.synectiks.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synectiks.app.entity.PolicyAssignedPermissions;

@Repository
public interface PolicyAssignedRepo extends JpaRepository<PolicyAssignedPermissions, Long> {

}
