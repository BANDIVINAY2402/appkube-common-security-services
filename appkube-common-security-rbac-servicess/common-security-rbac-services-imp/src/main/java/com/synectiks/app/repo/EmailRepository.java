package com.synectiks.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synectiks.app.entity.EmailEntity;

@Repository
public interface EmailRepository extends JpaRepository<EmailEntity, Long>{
	
}
