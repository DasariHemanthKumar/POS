package com.sf.pos.bean;

import jakarta.persistence.*;

@Entity
@Table(name="CreditCart")
public class CreditCardBean {

	@Id
	private int creditcardno;
	 
	@Column
	private String validform;
	
	@Column
	private String validto;
	
	@Column
	private String balance;
	
	@Column
	private String userID;

	public int getCreditcardno() {
		return creditcardno;
	}

	public void setCreditcardno(int creditcardno) {
		this.creditcardno = creditcardno;
	}

	public String getValidform() {
		return validform;
	}

	public void setValidform(String validform) {
		this.validform = validform;
	}

	public String getValidto() {
		return validto;
	}

	public void setValidto(String validto) {
		this.validto = validto;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
}
