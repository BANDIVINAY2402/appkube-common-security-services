package com.synectiks.app.methods;

import java.util.List;
import java.util.stream.Collectors;

import com.synectiks.app.entity.Organization;
import com.synectiks.app.entity.Permission;
import com.synectiks.app.entity.PermissionCategory;
import com.synectiks.app.entity.PolicyEntity;
import com.synectiks.app.entity.RoleEntity;
import com.synectiks.asset.api.model.Config;
import com.synectiks.asset.api.model.Policy;
import com.synectiks.asset.api.model.PolicyAssignedPermissions;
import com.synectiks.asset.api.model.Role;

public class Methods {
	public static Organization modelToEntity(com.synectiks.asset.api.model.Organization  organization) {
		Organization dto = new Organization();
        dto.setId(organization.getId());
        dto.setName(organization.getName());
        dto.setDescription(organization.getDescription());
        dto.setPhone(organization.getPhone());
        dto.setEmail(organization.getEmail());
        dto.setAddress(organization.getAddress());
        dto.setFax(organization.getFax());
        dto.setDateOfEstablishment(organization.getDateOfEstablishment());
        dto.setStatus(organization.getStatus());
        dto.setCmdbOrgId(organization.getCmdbOrgId());
        dto.setFileName(organization.getFileName());
        dto.setFileStorageLocationType(organization.getFileStorageLocationType());
        dto.setProfileImage(organization.getProfileImage());
       
        return dto;
    }

	public static List<com.synectiks.asset.api.model.Organization> entityToModelOrg(List<Organization> org) {
		List<com.synectiks.asset.api.model.Organization> org1=org.stream().map(entity -> {
			com.synectiks.asset.api.model.Organization o = new com.synectiks.asset.api.model.Organization();
            o.setAddress(entity.getAddress());
            o.setCmdbOrgId(entity.getCmdbOrgId());
            o.setDateOfEstablishment(entity.getDateOfEstablishment());
            o.setDescription(entity.getDescription());
            o.setEmail(entity.getEmail());
            o.setFax(entity.getFax());
            o.setFileName(entity.getFileName());
            o.setFileStorageLocationType(entity.getFileStorageLocationType());
            o.setName(entity.getName());
            o.setPhone(entity.getPhone());
            o.setProfileImage(entity.getProfileImage());
            return o;
        }).collect(Collectors.toList());
		return org1;
	}

	public static com.synectiks.asset.api.model.Organization entitytoModelOrgsingledata(Organization o) {
		com.synectiks.asset.api.model.Organization dto=new com.synectiks.asset.api.model.Organization();
		 dto.setId(o.getId());
	        dto.setName(o.getName());
	        dto.setDescription(o.getDescription());
	        dto.setPhone(o.getPhone());
	        dto.setEmail(o.getEmail());
	        dto.setAddress(o.getAddress());
	        dto.setFax(o.getFax());
	        dto.setDateOfEstablishment(o.getDateOfEstablishment());
	        dto.setStatus(o.getStatus());
	        dto.setCmdbOrgId(o.getCmdbOrgId());
	        dto.setFileName(o.getFileName());
	        dto.setFileStorageLocationType(o.getFileStorageLocationType());
	        dto.setProfileImage(o.getProfileImage());
	       
	        return dto;
		
	}

	

	public static com.synectiks.app.entity.Config configModelToEntity(Config config) {
		com.synectiks.app.entity.Config cf=new  com.synectiks.app.entity.Config();
		
		com.synectiks.asset.api.model.Organization or=config.getOrganization();
Organization og=modelToEntity(or);
		cf.setId(config.getId());
		cf.setIsEncrypted(config.getIsEncrypted());
		cf.setKey(config.getKey());
        cf.setOrganization(og);
		cf.setStatus(config.getStatus());
		cf.setValue(config.getValue());
	
		return cf;
	}

	public static List<Config> configListEntityToModel(List<com.synectiks.app.entity.Config> con) {
		List<Config> cc = con.stream()
        .map(e -> {
            Config c = new Config();
            c.setId(e.getId());
            c.setIsEncrypted(e.getIsEncrypted());
            c.setKey(e.getKey());
            c.setStatus(e.getStatus());
            c.setValue(e.getValue());
            Organization og=e.getOrganization();
            com.synectiks.asset.api.model.Organization ooo=entitytoModelOrgsingledata(og);
            c.setOrganization(ooo);
           
            return c;
        })
       .collect(Collectors.toList());	
		return cc;
	}

	public static Config configEntityToModel(com.synectiks.app.entity.Config co) {
	Organization org=co.getOrganization();
		com.synectiks.asset.api.model.Organization organization=entitytoModelOrgsingledata(org);


			  Config c = new Config();
			//  con.ifPresent(config -> {
				  c.setId(co.getId());
				  c.setIsEncrypted(co.getIsEncrypted());	
				  c.setKey(co.getKey());
			      c.setStatus(co.getStatus());
			      c.setValue(co.getValue());
			     c.setOrganization(organization);
			      
			      
		
		return c;
	}

	public static Permission permissionModelToEntity(com.synectiks.asset.api.model.Permission permission) {
	Permission pp=new Permission();
	pp.setDescription(permission.getDescription());
	
	pp.setId(permission.getId());
	pp.setName(permission.getName());
	pp.setStatus(permission.getStatus());
	pp.setVersion(permission.getVersion());
		return pp;
	}

	public static com.synectiks.asset.api.model.Permission permissionEntityToModel(Permission permission) {
		com.synectiks.asset.api.model.Permission pp=new com.synectiks.asset.api.model.Permission();
		pp.setDescription(permission.getDescription());
		
		pp.setId(permission.getId());
		pp.setName(permission.getName());
		pp.setStatus(permission.getStatus());
		pp.setVersion(permission.getVersion());
		Organization org=permission.getOrganization();
		com.synectiks.asset.api.model.Organization og=entitytoModelOrgsingledata(org);
		pp.setOrganization(og);
		
		return pp;
	}

	public static List<com.synectiks.asset.api.model.Permission> PermissionListEntityToModel(List<Permission> per) {
		
		List<com.synectiks.asset.api.model.Permission> pp=per.stream().map(a->{
			com.synectiks.asset.api.model.Permission pt=new com.synectiks.asset.api.model.Permission();
			pt.setDescription(a.getDescription());
			
			pt.setId(a.getId());
			pt.setName(a.getName());
			pt.setStatus(a.getStatus());
			pt.setVersion(a.getVersion());
			Organization org=a.getOrganization();
			com.synectiks.asset.api.model.Organization og=entitytoModelOrgsingledata(org);
			pt.setOrganization(og);
		      return pt;
		}).collect(Collectors.toList());	
		return pp;
	}

	public static PermissionCategory permissionCategoryModelToEntity(
			com.synectiks.asset.api.model.PermissionCategory permissionCategory) {
		PermissionCategory pc=new PermissionCategory();
		pc.setDescription(permissionCategory.getDescription());
		pc.setId(permissionCategory.getId());
		pc.setName(permissionCategory.getName());
		pc.setStatus(permissionCategory.getStatus());
		pc.setVersion(permissionCategory.getVersion());
		com.synectiks.asset.api.model.Organization og=permissionCategory.getOrganization();
		Organization org=modelToEntity(og);
		pc.setOrganization(org);
		List<com.synectiks.asset.api.model.Permission> per=permissionCategory.getPermissions();
		List<Permission> p=permissionListModelToEntity(per);
		pc.setPermissions(p);
		
		return pc;
	}

	private static List<Permission> permissionListModelToEntity(List<com.synectiks.asset.api.model.Permission> per) {
		

		List<Permission> pp=per.stream().map(a->{
			Permission pt=new Permission();
			pt.setDescription(a.getDescription());
			
			pt.setId(a.getId());
			pt.setName(a.getName());
			pt.setStatus(a.getStatus());
			pt.setVersion(a.getVersion());
			com.synectiks.asset.api.model.Organization org=a.getOrganization();
			Organization og=modelToEntity(org);
			pt.setOrganization(og);

		      return pt;
		}).collect(Collectors.toList());
		
		
		return pp;
	}

	public static List<com.synectiks.asset.api.model.PermissionCategory> PermissionCategoryListEntityToModel(
			List<PermissionCategory> per) {
		
		List<com.synectiks.asset.api.model.PermissionCategory> pr=per.stream().map(a->{
			com.synectiks.asset.api.model.PermissionCategory p=new com.synectiks.asset.api.model.PermissionCategory();
			p.setDescription(a.getDescription());
			p.setId(a.getId());
			p.setName(a.getName());
			p.setStatus(a.getStatus());
			p.setVersion(a.getVersion());
			Organization og=a.getOrganization();
			com.synectiks.asset.api.model.Organization org=entitytoModelOrgsingledata(og);
			p.setOrganization(org);
	      List<Permission> perq= a.getPermissions();
	      List<com.synectiks.asset.api.model.Permission> perc=PermissionListEntityToModel(perq);
	      p.setPermissions(perc);
			return p;
		}).collect(Collectors.toList());
		return pr;
	}

	public static com.synectiks.asset.api.model.PermissionCategory PermissionCategoryEntityToModel(
			PermissionCategory permission) {
		com.synectiks.asset.api.model.PermissionCategory pr=new com.synectiks.asset.api.model.PermissionCategory();
		pr.setDescription(permission.getDescription());
		pr.setId(permission.getId());
		pr.setName(permission.getName());
		pr.setStatus(permission.getStatus());
		pr.setVersion(permission.getVersion());
Organization og=permission.getOrganization();
com.synectiks.asset.api.model.Organization or=entitytoModelOrgsingledata(og);
pr.setOrganization(or);
List<Permission> per=permission.getPermissions();
List<com.synectiks.asset.api.model.Permission> pcr=PermissionListEntityToModel(per);

pr.setPermissions(pcr);

		return pr;
	}

	public static PolicyEntity PolicyModelToEntity(Policy policy) {
		PolicyEntity pe=new PolicyEntity();
		pe.setDescription(policy.getDescription());
		pe.setId(policy.getId());
		pe.setName(policy.getName());
		pe.setStatus(policy.getStatus());
		pe.setVersion(policy.getVersion());
		com.synectiks.asset.api.model.Organization org=policy.getOrganization();
		Organization og=modelToEntity(org);
		pe.setOrganization(og);
		List<PolicyAssignedPermissions> pp=policy.getPermissions();

		List<com.synectiks.app.entity.PolicyAssignedPermissions> pol=PolicyAssignedListModelToEntity(pp);
		pe.setPermissions(pol);

		return pe;
	}

	private static List<com.synectiks.app.entity.PolicyAssignedPermissions> PolicyAssignedListModelToEntity(
			List<PolicyAssignedPermissions> pp) {
		List<com.synectiks.app.entity.PolicyAssignedPermissions> pol=pp.stream().map(a->{
			com.synectiks.app.entity.PolicyAssignedPermissions pe= new com.synectiks.app.entity.PolicyAssignedPermissions();
			pe.setId(a.getId());
			pe.setPermissionCategoryId(a.getPermissionCategoryId());
			pe.setPermissionCategoryName(a.getPermissionCategoryName());
			pe.setPermissionId(a.getPermissionId());
			pe.setPolicyId(a.getPolicyId());
			pe.setPolicyName(a.getPolicyName());
			return pe;
		}).collect(Collectors.toList());
		return pol;
	}

	public static com.synectiks.app.entity.PolicyAssignedPermissions PolicyAssignedModelToEntity(
			PolicyAssignedPermissions policyAssignedPermissions) {
		
		com.synectiks.app.entity.PolicyAssignedPermissions pe=new com.synectiks.app.entity.PolicyAssignedPermissions();
		pe.setId(policyAssignedPermissions.getId());
		pe.setPermissionCategoryId(policyAssignedPermissions.getPermissionCategoryId());
		pe.setPermissionCategoryName(policyAssignedPermissions.getPermissionCategoryName());
		pe.setPermissionId(policyAssignedPermissions.getPermissionId());
		pe.setPolicyId(policyAssignedPermissions.getPolicyId());
		pe.setPolicyName(policyAssignedPermissions.getPolicyName());
		return pe;
	}

	public static List<Policy> PolicyListEntityToModel(List<PolicyEntity> policy) {
		List<Policy> pol=policy.stream().map(a->{
			Policy p=new Policy();
			p.setDescription(a.getDescription());
			p.setId(a.getId());
			p.setName(a.getName());
			p.setStatus(a.getStatus());
			p.setVersion(a.getVersion());
			Organization org=a.getOrganization();
			com.synectiks.asset.api.model.Organization og=entitytoModelOrgsingledata(org);
			p.setOrganization(og);
			List<com.synectiks.app.entity.PolicyAssignedPermissions> pe=a.getPermissions();
			List<PolicyAssignedPermissions> ps=policyAssignedListEntityToModel(pe);
			p.setPermissions(ps);
			
			return p;
		}).collect(Collectors.toList());
		return pol;
	}

	private static List<PolicyAssignedPermissions> policyAssignedListEntityToModel(
			List<com.synectiks.app.entity.PolicyAssignedPermissions> pe) {
		
		List<PolicyAssignedPermissions> per=pe.stream().map(a->{
			PolicyAssignedPermissions pd=new PolicyAssignedPermissions();
			pd.setId(a.getId());
			pd.setPermissionCategoryId(a.getPermissionCategoryId());
			pd.setPermissionCategoryName(a.getPermissionCategoryName());
			pd.setPermissionName(a.getPermissionName());
			pd.setPolicyId(a.getPolicyId());
			pd.setPolicyName(a.getPolicyName());
			return pd;
		}).collect(Collectors.toList());
		
		return per;
	}

	public static Policy PolicyEntityToModel(PolicyEntity policyentity) {
		Policy p=new Policy();
		p.setDescription(policyentity.getDescription());
		p.setId(policyentity.getId());
		p.setName(policyentity.getName());
		p.setStatus(policyentity.getStatus());
		p.setVersion(policyentity.getVersion());
		Organization org=policyentity.getOrganization();
		com.synectiks.asset.api.model.Organization og=entitytoModelOrgsingledata(org);
		p.setOrganization(og);
		List<com.synectiks.app.entity.PolicyAssignedPermissions> pe=policyentity.getPermissions();
		List<PolicyAssignedPermissions> ps=policyAssignedListEntityToModel(pe);
		p.setPermissions(ps);
		return p;
	}

	public static List<PolicyAssignedPermissions> PolicyAssigendListEntityToModel(
			List<com.synectiks.app.entity.PolicyAssignedPermissions> pol) {
		List<PolicyAssignedPermissions>  pl=pol.stream().map(a->{
			PolicyAssignedPermissions pd=new PolicyAssignedPermissions();
			pd.setId(a.getId());
			pd.setPermissionCategoryId(a.getPermissionCategoryId());
			pd.setPermissionCategoryName(a.getPermissionCategoryName());
			pd.setPermissionName(a.getPermissionName());
			pd.setPolicyId(a.getPolicyId());
			pd.setPolicyName(a.getPolicyName());
			return pd;
		}).collect(Collectors.toList());
		return pl;
	}

	public static RoleEntity RoleModelToEntity(Role role) {
		
		RoleEntity re=new RoleEntity();
		re.setDescription(role.getDescription());
		re.setGrp(role.getGrp());
		re.setIsDefault(role.getIsDefault());
		re.setName(role.getName());
		re.setVersion(role.getVersion());
		com.synectiks.asset.api.model.Organization org=role.getOrganization();
		Organization og=modelToEntity(org);
		re.setOrganization(og);
		List<Policy> p=role.getPolicies();
		List<PolicyEntity> pe=PolicyListModelToEntity(p);
		re.setPolicies(pe);
//           List<com.synectiks.asset.api.model.Permission> per= role.getAllowedPermissions();
//           List<Permission> permission=permissionListModelToEntity(per); 
//		re.setAllowedPermissions(permission);
//		re.setDisAllowedPermissions(permission);

		re.setRoles(null);
		re.setUsers(role.getUsers());
	
		
		return re;
	}

	private static List<PolicyEntity> PolicyListModelToEntity(List<Policy> p) {
		List<PolicyEntity> po=p.stream().map(a->{
			PolicyEntity pr=new PolicyEntity();
			pr.setDescription(a.getDescription());
//			pr.setDescription(p.getDescription());
			pr.setId(a.getId());
			pr.setName(a.getName());
			pr.setStatus(a.getStatus());
			pr.setVersion(a.getVersion());
		
			com.synectiks.asset.api.model.Organization org=a.getOrganization();
			Organization og=modelToEntity(org);
			pr.setOrganization(og);
			List<PolicyAssignedPermissions> pe=a.getPermissions();
			List<com.synectiks.app.entity.PolicyAssignedPermissions> ps=PolicyAssignedListModelToEntity(pe);
			pr.setPermissions(ps);
			return pr;
			
		}).collect(Collectors.toList());
		return po;
	}

	public static List<Role> RoleListEntityToModel(List<RoleEntity> r) {
		
		
		List<Role> role= r.stream().map(a ->{
			Role re=new Role();
			re.setDescription(a.getDescription());
			re.setGrp(a.getGrp());
			re.setIsDefault(a.getIsDefault());
			re.setName(a.getName());
			re.setVersion(a.getVersion());
			Organization org=a.getOrganization();
			com.synectiks.asset.api.model.Organization og=entitytoModelOrgsingledata(org);
			re.setOrganization(og);
			List<PolicyEntity> p=a.getPolicies();
			List<Policy> pe=PolicyListEntityToModel(p);
			re.setPolicies(pe);
//	           List<com.synectiks.asset.api.model.Permission> per= role.getAllowedPermissions();
//	           List<Permission> permission=permissionListModelToEntity(per); 
//			re.setAllowedPermissions(permission);
//			re.setDisAllowedPermissions(permission);
			re.setRoles(null);
			re.setUsers(a.getUsers());
		
			
			return re;
		}).collect(Collectors.toList());
		// TODO Auto-generated method stub
		return role;
	}

	public static Role RoleListEntityToModel(RoleEntity re) {
		Role re1=new Role();
		re1.setDescription(re.getDescription());
		re1.setGrp(re.getGrp());
		re1.setIsDefault(re.getIsDefault());
		re1.setName(re.getName());
		re1.setVersion(re.getVersion());
		Organization org=re.getOrganization();
		com.synectiks.asset.api.model.Organization og=entitytoModelOrgsingledata(org);
		re1.setOrganization(og);
		List<PolicyEntity> p=re.getPolicies();
		List<Policy> pe=PolicyListEntityToModel(p);
		re1.setPolicies(pe);
//           List<com.synectiks.asset.api.model.Permission> per= role.getAllowedPermissions();
//           List<Permission> permission=permissionListModelToEntity(per); 
//		re.setAllowedPermissions(permission);
//		re.setDisAllowedPermissions(permission);
		re1.setRoles(null);
		re1.setUsers(re.getUsers());
		return re1;
	}


	


		
	

}
