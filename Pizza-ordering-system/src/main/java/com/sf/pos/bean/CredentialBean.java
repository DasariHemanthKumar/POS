package com.sf.pos.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Credential")

public class CredentialBean {
	@Id
	private String userID;
	@Column
	private String Password;
	@Column
	private String usertype;
	@Column
	private String loginstatus;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getLoginstatus() {
		return loginstatus;
	}
	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}
	@Override
	public String toString() {
		return "CredentialBean [userID=" + userID + ", Password=" + Password + ", usertype=" + usertype
				+ ", loginstatus=" + loginstatus + "]";
	}
	
	
	
	
}
