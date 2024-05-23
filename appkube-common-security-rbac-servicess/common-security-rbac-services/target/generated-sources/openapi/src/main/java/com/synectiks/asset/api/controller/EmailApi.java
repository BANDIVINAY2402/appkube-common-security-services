/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.synectiks.asset.api.controller;

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
@Api(value = "email", description = "the email API")
public interface EmailApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /email/send-new-org-user-registration-mail : Sends a new organization user registration email.
     *
     * @return The request was successful, and the new organization user&#39;s registration email has been sent. (status code 200)
     */
    @ApiOperation(value = "Sends a new organization user registration email.", nickname = "sendNewOrgUserRegistrationMail", notes = "", response = String.class, tags={ "Email", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request was successful, and the new organization user's registration email has been sent.", response = String.class) })
    @GetMapping(
        value = "/email/send-new-org-user-registration-mail",
        produces = { "text/plain" }
    )
    default ResponseEntity<String> sendNewOrgUserRegistrationMail() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /email/send-new-user-registration-mail : Sends a new user registration email.
     * This endpoint triggers the sending of a new user registration email. It is designed to be called periodically (e.g., every minute) to ensure that all eligible users receive their registration emails promptly. 
     *
     * @return The request was successful, and the user&#39;s registration email has been sent. (status code 200)
     */
    @ApiOperation(value = "Sends a new user registration email.", nickname = "sendNewUserRegistrationMail", notes = "This endpoint triggers the sending of a new user registration email. It is designed to be called periodically (e.g., every minute) to ensure that all eligible users receive their registration emails promptly. ", response = String.class, tags={ "Email", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request was successful, and the user's registration email has been sent.", response = String.class) })
    @GetMapping(
        value = "/email/send-new-user-registration-mail",
        produces = { "text/plain" }
    )
    default ResponseEntity<String> sendNewUserRegistrationMail() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
