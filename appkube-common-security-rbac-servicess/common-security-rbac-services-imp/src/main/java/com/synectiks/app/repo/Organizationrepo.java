package com.synectiks.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synectiks.app.entity.Organization;



@Repository
public interface Organizationrepo extends JpaRepository<Organization, Long> {

	Organization findByName(String name);

}
