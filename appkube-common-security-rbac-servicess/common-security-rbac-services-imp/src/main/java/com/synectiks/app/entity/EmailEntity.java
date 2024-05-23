package com.synectiks.app.entity;

import jakarta.persistence.Entity;

@Entity
public class EmailEntity {
	Long id	;
	String status;	
			String mailType;
			String mailFrom	;
			String mailTo	;
			String mailSubject;	
			String	mailBody	;
			String	mailTemplate;
		   String userName;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getMailType() {
			return mailType;
		}
		public void setMailType(String mailType) {
			this.mailType = mailType;
		}
		public String getMailFrom() {
			return mailFrom;
		}
		public void setMailFrom(String mailFrom) {
			this.mailFrom = mailFrom;
		}
		public String getMailTo() {
			return mailTo;
		}
		public void setMailTo(String mailTo) {
			this.mailTo = mailTo;
		}
		public String getMailSubject() {
			return mailSubject;
		}
		public void setMailSubject(String mailSubject) {
			this.mailSubject = mailSubject;
		}
		public String getMailBody() {
			return mailBody;
		}
		public void setMailBody(String mailBody) {
			this.mailBody = mailBody;
		}
		public String getMailTemplate() {
			return mailTemplate;
		}
		public void setMailTemplate(String mailTemplate) {
			this.mailTemplate = mailTemplate;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public EmailEntity(Long id, String status, String mailType, String mailFrom, String mailTo, String mailSubject,
				String mailBody, String mailTemplate, String userName) {
			super();
			this.id = id;
			this.status = status;
			this.mailType = mailType;
			this.mailFrom = mailFrom;
			this.mailTo = mailTo;
			this.mailSubject = mailSubject;
			this.mailBody = mailBody;
			this.mailTemplate = mailTemplate;
			this.userName = userName;
		}
		public EmailEntity() {
			super();
		}
		@Override
		public String toString() {
			return "EmailEntity [id=" + id + ", status=" + status + ", mailType=" + mailType + ", mailFrom=" + mailFrom
					+ ", mailTo=" + mailTo + ", mailSubject=" + mailSubject + ", mailBody=" + mailBody
					+ ", mailTemplate=" + mailTemplate + ", userName=" + userName + "]";
		}
		   
}
