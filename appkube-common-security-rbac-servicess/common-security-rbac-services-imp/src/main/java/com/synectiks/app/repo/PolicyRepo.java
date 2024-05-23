package com.synectiks.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synectiks.app.entity.PolicyEntity;

@Repository
public interface PolicyRepo extends JpaRepository<PolicyEntity, Long> {

}
