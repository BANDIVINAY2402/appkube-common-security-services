package com.synectiks.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synectiks.app.entity.RoleEntity;

@Repository
public interface RoleRepo extends JpaRepository<RoleEntity, Long> {

	

	RoleEntity findById(Integer id);

	RoleEntity findByNameAndId(String userName, Integer roleId);

	void deleteById(Integer id);


}
