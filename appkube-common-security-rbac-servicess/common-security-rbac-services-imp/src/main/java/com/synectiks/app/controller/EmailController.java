package com.synectiks.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.synectiks.app.entity.EmailEntity;
import com.synectiks.app.repo.EmailRepository;
import com.synectiks.asset.api.controller.EmailApi;
@RestController
public class EmailController implements  EmailApi{		
		@Autowired
		private EmailRepository er;
		@Override
		public ResponseEntity<String> sendNewOrgUserRegistrationMail() {
			List<EmailEntity> ee = er.findAll();
			if (ee.isEmpty()) {
		         return ResponseEntity.notFound().build();
		     }
		     
		     System.out.println(ee);
		     
		     return ResponseEntity.ok("Emails queued successfully.");
		}
		@Override
		public ResponseEntity<String> sendNewUserRegistrationMail() {
			List<EmailEntity> eq = er.findAll();
			if(eq.isEmpty()) {
				ResponseEntity.status(400).body("No Emails to Queue");
			}
				return ResponseEntity.ok("New organization user registration emails queued successfully.");
			
		}
			
		
}
