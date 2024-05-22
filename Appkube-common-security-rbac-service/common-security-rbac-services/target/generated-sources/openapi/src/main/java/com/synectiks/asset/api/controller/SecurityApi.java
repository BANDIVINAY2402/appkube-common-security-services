/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.synectiks.asset.api.controller;

import com.synectiks.asset.api.model.InlineObject1;
import java.util.List;
import com.synectiks.asset.api.model.LoginRequest;
import com.synectiks.asset.api.model.User;
import com.synectiks.asset.api.model.UsernamePasswordToken;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T21:34:23.682367100-07:00[America/Los_Angeles]")
@Validated
@Api(value = "security", description = "the security API")
public interface SecurityApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /security/authenticate : Authenticate user
     *
     * @param usernamePasswordToken  (optional)
     * @return Successful authentication (status code 200)
     *         or Authentication failed (status code 417)
     */
    @ApiOperation(value = "Authenticate user", nickname = "securityAuthenticatePost", notes = "", tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful authentication"),
        @ApiResponse(code = 417, message = "Authentication failed", response = Object.class) })
    @PostMapping(
        value = "/security/authenticate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> securityAuthenticatePost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) UsernamePasswordToken usernamePasswordToken) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /security/authenticateSession : Authenticate user session
     *
     * @param inlineObject1  (optional)
     * @return Session authenticated (status code 200)
     */
    @ApiOperation(value = "Authenticate user session", nickname = "securityAuthenticateSessionPost", notes = "", tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Session authenticated") })
    @PostMapping(
        value = "/security/authenticateSession",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> securityAuthenticateSessionPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) InlineObject1 inlineObject1) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /security/authenticateUser : Authenticate user by username
     *
     * @param userName  (required)
     * @return User authenticated (status code 200)
     *         or Authentication failed (status code 417)
     */
    @ApiOperation(value = "Authenticate user by username", nickname = "securityAuthenticateUserGet", notes = "", tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User authenticated"),
        @ApiResponse(code = 417, message = "Authentication failed") })
    @GetMapping(
        value = "/security/authenticateUser"
    )
    default ResponseEntity<Void> securityAuthenticateUserGet(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "userName", required = true) String userName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /security/forgot-password : Send forgot password email
     *
     * @param userName  (required)
     * @return Email sent successfully (status code 200)
     *         or Email send failed (status code 417)
     */
    @ApiOperation(value = "Send forgot password email", nickname = "securityForgotPasswordGet", notes = "", tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Email sent successfully"),
        @ApiResponse(code = 417, message = "Email send failed") })
    @GetMapping(
        value = "/security/forgot-password"
    )
    default ResponseEntity<Void> securityForgotPasswordGet(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "userName", required = true) String userName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /security/importUser : Import users
     *
     * @param requestBody  (optional)
     * @return Users imported successfully (status code 201)
     *         or Import failed (status code 417)
     */
    @ApiOperation(value = "Import users", nickname = "securityImportUserPost", notes = "", response = String.class, tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Users imported successfully", response = String.class),
        @ApiResponse(code = 417, message = "Import failed", response = Object.class) })
    @PostMapping(
        value = "/security/importUser",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> securityImportUserPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) List<String> requestBody) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /security/login : User login
     *
     * @param username  (required)
     * @param password  (required)
     * @param rememberMe  (optional)
     * @return Successful authentication (status code 200)
     *         or Authentication failed (status code 417)
     */
    @ApiOperation(value = "User login", nickname = "securityLoginGet", notes = "", response = Object.class, tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful authentication", response = Object.class),
        @ApiResponse(code = 417, message = "Authentication failed", response = Object.class) })
    @GetMapping(
        value = "/security/login",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> securityLoginGet(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "password", required = true) String password,@ApiParam(value = "") @Valid @RequestParam(value = "rememberMe", required = false) Boolean rememberMe) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /security/logout : Logout user
     *
     * @param userName  (required)
     * @return Successful logout (status code 200)
     */
    @ApiOperation(value = "Logout user", nickname = "securityLogoutGet", notes = "", tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful logout") })
    @GetMapping(
        value = "/security/logout"
    )
    default ResponseEntity<Void> securityLogoutGet(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "userName", required = true) String userName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /security/signin : User signin
     *
     * @param user  (optional)
     * @return Successful authentication (status code 200)
     */
    @ApiOperation(value = "User signin", nickname = "securitySigninPost", notes = "", response = Object.class, tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful authentication", response = Object.class) })
    @PostMapping(
        value = "/security/signin",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Object> securitySigninPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /security/signup : User signup
     *
     * @param loginRequest  (optional)
     * @return User signed up successfully (status code 200)
     */
    @ApiOperation(value = "User signup", nickname = "securitySignupPost", notes = "", response = String.class, tags={ "Security", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User signed up successfully", response = String.class) })
    @PostMapping(
        value = "/security/signup",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> securitySignupPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) LoginRequest loginRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
