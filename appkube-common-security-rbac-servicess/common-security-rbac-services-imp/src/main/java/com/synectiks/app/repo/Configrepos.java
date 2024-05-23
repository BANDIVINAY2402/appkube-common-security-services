package com.synectiks.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synectiks.app.entity.Config;
@Repository
public interface Configrepos extends JpaRepository<Config, Long> {

	Config findByKey(String key);

	List<Config> findByStatus(String status);

	List<com.synectiks.app.entity.Config> findByOrganizationId(Long organizationId);

	Config findByKeyAndOrganizationId(String key, Long organizationId);

}
