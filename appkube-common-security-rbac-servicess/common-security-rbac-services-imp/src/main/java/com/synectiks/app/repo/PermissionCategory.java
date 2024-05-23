package com.synectiks.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("permissionCategoryRepo")
public interface PermissionCategory extends JpaRepository<com.synectiks.app.entity.PermissionCategory, Long> {

	

}
