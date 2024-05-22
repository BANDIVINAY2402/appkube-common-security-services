/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.synectiks.asset.api.controller;

import com.synectiks.asset.api.model.Role;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T08:33:53.267382700-07:00[America/Los_Angeles]")
@Validated
@Api(value = "Role", description = "the Role API")
public interface RoleApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /Role/create : Create a new role
     *
     * @param role  (required)
     * @return Role created successfully (status code 201)
     *         or Expectation failed (status code 417)
     */
    @ApiOperation(value = "Create a new role", nickname = "createRole", notes = "", response = Role.class, tags={ "Role", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Role created successfully", response = Role.class),
        @ApiResponse(code = 417, message = "Expectation failed", response = String.class) })
    @PostMapping(
        value = "/Role/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Role> createRole(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Role role) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isDefault\" : true, \"grp\" : true, \"allowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"roles\" : [ null, null ], \"name\" : \"name\", \"policies\" : [ { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }, { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" } ], \"description\" : \"description\", \"disAllowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"version\" : 0, \"users\" : [ \"{}\", \"{}\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /Role/delete/{id} : Delete role by ID
     *
     * @param id ID of the role to delete (required)
     * @return Role removed successfully (status code 200)
     *         or Role not found (status code 404)
     *         or Expectation failed (status code 417)
     */
    @ApiOperation(value = "Delete role by ID", nickname = "deleteRoleById", notes = "", tags={ "Role", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Role removed successfully"),
        @ApiResponse(code = 404, message = "Role not found"),
        @ApiResponse(code = 417, message = "Expectation failed", response = String.class) })
    @DeleteMapping(
        value = "/Role/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteRoleById(@ApiParam(value = "ID of the role to delete",required=true) @PathVariable("id") Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /Role/{id} : Find role by ID
     *
     * @param id ID of the role to fetch (required)
     * @return Successful operation (status code 200)
     *         or Role not found (status code 404)
     *         or Expectation failed (status code 417)
     */
    @ApiOperation(value = "Find role by ID", nickname = "findRoleById", notes = "", response = Role.class, tags={ "Role", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Role.class),
        @ApiResponse(code = 404, message = "Role not found"),
        @ApiResponse(code = 417, message = "Expectation failed", response = String.class) })
    @GetMapping(
        value = "/Role/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Role> findRoleById(@ApiParam(value = "ID of the role to fetch",required=true) @PathVariable("id") Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isDefault\" : true, \"grp\" : true, \"allowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"roles\" : [ null, null ], \"name\" : \"name\", \"policies\" : [ { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }, { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" } ], \"description\" : \"description\", \"disAllowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"version\" : 0, \"users\" : [ \"{}\", \"{}\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /Role/get-role-group-details : Get details of a role group
     *
     * @param userName The username (required)
     * @param roleId The ID of the role (required)
     * @return Successful operation (status code 200)
     *         or Role not found (status code 426)
     *         or Provided role is not a role group (status code 427)
     *         or User not found (status code 428)
     */
    @ApiOperation(value = "Get details of a role group", nickname = "getRoleGroupDetails", notes = "", response = Role.class, tags={ "Role", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Role.class),
        @ApiResponse(code = 426, message = "Role not found"),
        @ApiResponse(code = 427, message = "Provided role is not a role group"),
        @ApiResponse(code = 428, message = "User not found") })
    @GetMapping(
        value = "/Role/get-role-group-details",
        produces = { "application/json" }
    )
    default ResponseEntity<Role> getRoleGroupDetails(@NotNull @ApiParam(value = "The username", required = true) @Valid @RequestParam(value = "userName", required = true) String userName,@NotNull @ApiParam(value = "The ID of the role", required = true) @Valid @RequestParam(value = "roleId", required = true) Integer roleId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isDefault\" : true, \"grp\" : true, \"allowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"roles\" : [ null, null ], \"name\" : \"name\", \"policies\" : [ { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }, { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" } ], \"description\" : \"description\", \"disAllowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"version\" : 0, \"users\" : [ \"{}\", \"{}\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /Role/listAll : Fetch list of roles
     *
     * @return OK (status code 200)
     *         or Service Not found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Fetch list of roles", nickname = "getRoles", notes = "", response = Role.class, responseContainer = "List", tags={ "Role", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Role.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Service Not found"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @GetMapping(
        value = "/Role/listAll",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Role>> getRoles() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isDefault\" : true, \"grp\" : true, \"allowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"roles\" : [ null, null ], \"name\" : \"name\", \"policies\" : [ { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }, { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" } ], \"description\" : \"description\", \"disAllowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"version\" : 0, \"users\" : [ \"{}\", \"{}\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /Role/find-by-owner : Find roles by owner and group
     *
     * @param createdBy The creator of the roles (required)
     * @param isGroup Indicates whether the roles are group roles (required)
     * @return Successful operation (status code 200)
     *         or Expectation failed (status code 417)
     */
    @ApiOperation(value = "Find roles by owner and group", nickname = "roleFindByOwnerGet", notes = "", response = Role.class, responseContainer = "List", tags={ "Role", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Role.class, responseContainer = "List"),
        @ApiResponse(code = 417, message = "Expectation failed", response = String.class, responseContainer = "List") })
    @GetMapping(
        value = "/Role/find-by-owner",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Role>> roleFindByOwnerGet(@NotNull @ApiParam(value = "The creator of the roles", required = true) @Valid @RequestParam(value = "createdBy", required = true) String createdBy,@NotNull @ApiParam(value = "Indicates whether the roles are group roles", required = true) @Valid @RequestParam(value = "isGroup", required = true) Boolean isGroup) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isDefault\" : true, \"grp\" : true, \"allowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"roles\" : [ null, null ], \"name\" : \"name\", \"policies\" : [ { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }, { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" } ], \"description\" : \"description\", \"disAllowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"version\" : 0, \"users\" : [ \"{}\", \"{}\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /Role/update : Update a role
     *
     * @param role  (required)
     * @return Role updated successfully (status code 200)
     *         or Bad request (status code 400)
     *         or Role not found (status code 404)
     *         or Expectation failed (status code 417)
     */
    @ApiOperation(value = "Update a role", nickname = "updateRole", notes = "", response = Role.class, tags={ "Role", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Role updated successfully", response = Role.class),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Role not found"),
        @ApiResponse(code = 417, message = "Expectation failed") })
    @PutMapping(
        value = "/Role/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Role> updateRole(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Role role) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isDefault\" : true, \"grp\" : true, \"allowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"roles\" : [ null, null ], \"name\" : \"name\", \"policies\" : [ { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }, { \"permissions\" : [ { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" }, { \"permissionCategoryName\" : \"permissionCategoryName\", \"permissionCategoryId\" : 5, \"permissionId\" : 2, \"policyId\" : 5, \"policyName\" : \"policyName\", \"id\" : 1, \"permissionName\" : \"permissionName\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" } ], \"description\" : \"description\", \"disAllowedPermissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"version\" : 0, \"users\" : [ \"{}\", \"{}\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
