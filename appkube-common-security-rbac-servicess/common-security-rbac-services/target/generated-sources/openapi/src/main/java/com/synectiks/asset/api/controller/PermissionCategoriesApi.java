/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.synectiks.asset.api.controller;

import com.synectiks.asset.api.model.PermissionCategory;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
@Validated
@Api(value = "permission-categories", description = "the permission-categories API")
public interface PermissionCategoriesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /permission-categories : Get all permission categories
     *
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Get all permission categories", nickname = "permissionCategoriesGet", notes = "", response = PermissionCategory.class, responseContainer = "List", tags={ "Permissioncategory", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PermissionCategory.class, responseContainer = "List") })
    @GetMapping(
        value = "/permission-categories",
        produces = { "application/json" }
    )
    default ResponseEntity<List<PermissionCategory>> permissionCategoriesGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"permissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /permission-categories/{id} : Delete a permission category by ID
     *
     * @param id  (required)
     * @return Successful operation. (status code 200)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "Delete a permission category by ID", nickname = "permissionCategoriesIdDelete", notes = "", tags={ "Permissioncategory", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation."),
        @ApiResponse(code = 404, message = "Not Found") })
    @DeleteMapping(
        value = "/permission-categories/{id}"
    )
    default ResponseEntity<Void> permissionCategoriesIdDelete(@ApiParam(value = "",required=true) @PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /permission-categories/{id} : Get a permission category by ID
     *
     * @param id  (required)
     * @return Successful operation. (status code 200)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "Get a permission category by ID", nickname = "permissionCategoriesIdGet", notes = "", response = PermissionCategory.class, tags={ "Permissioncategory", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation.", response = PermissionCategory.class),
        @ApiResponse(code = 404, message = "Not Found") })
    @GetMapping(
        value = "/permission-categories/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<PermissionCategory> permissionCategoriesIdGet(@ApiParam(value = "",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"permissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /permission-categories/{id} : Update a permission category
     *
     * @param id  (required)
     * @return Successful operation. (status code 200)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "Update a permission category", nickname = "permissionCategoriesIdPut", notes = "", response = PermissionCategory.class, tags={ "Permissioncategory", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation.", response = PermissionCategory.class),
        @ApiResponse(code = 404, message = "Not Found") })
    @PutMapping(
        value = "/permission-categories/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<PermissionCategory> permissionCategoriesIdPut(@ApiParam(value = "",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"permissions\" : [ { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" }, { \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 6, \"version\" : 1, \"status\" : \"status\" } ], \"organization\" : { \"fileName\" : \"fileName\", \"address\" : \"address\", \"description\" : \"description\", \"profileImage\" : \"profileImage\", \"phone\" : \"phone\", \"name\" : \"name\", \"dateOfEstablishment\" : \"2000-01-23T04:56:07.000+00:00\", \"cmdbOrgId\" : 6, \"fileStorageLocationType\" : \"fileStorageLocationType\", \"id\" : 0, \"fax\" : \"fax\", \"email\" : \"email\", \"status\" : \"status\" }, \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"version\" : 6, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /permission-categories : Create a new permission category
     *
     * @param permissionCategory  (required)
     * @return Successful. (status code 200)
     */
    @ApiOperation(value = "Create a new permission category", nickname = "permissionCategoriesPost", notes = "", tags={ "Permissioncategory", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful.") })
    @PostMapping(
        value = "/permission-categories",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> permissionCategoriesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PermissionCategory permissionCategory) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
