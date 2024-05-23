package com.synectiks.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synectiks.app.entity.EmailEntity;
import com.synectiks.app.repo.EmailRepository;
import com.synectiks.app.repo.Organizationrepo;
import com.synectiks.asset.api.model.EmailQueue;



@Service
public class EmailServiceI implements EmailService {
	@Autowired
	private final EmailRepository er;
	private Organizationrepo or;
	
	public EmailServiceI(EmailRepository er, Organizationrepo or) {
		super();
		this.er = er;
		this.or = or;
	}



	
}
