package com.sf.pos.bean;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name="Profile")
public class ProfileBean {
	@Id
	@GeneratedValue
	private int mobileno;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID", referencedColumnName="userID")
	
private CredentialBean credentialBean;
	 @Column
	private String	firstName;
    
    @Column
   	private String	lastName;
    
    @Column
   	private String	dateOfBirth ;
    
    @Column
   	private String	gender;
    
    @Column
   	private String	street;
    
    @Column
   	private String	location ;
    
    @Column
   	private String	city;
    
    @Column
   	private String	state ;
    
    @Column
   	private String	pincode;
    
    @Column
   	private String	emailID;
    
   
    
    @Column
   	private String	password  ;



	public int getMobileno() {
		return mobileno;
	}



	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}



	public CredentialBean getCredentialBean() {
		return credentialBean;
	}



	public void setCredentialBean(CredentialBean credentialBean) {
		this.credentialBean = credentialBean;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}



	public String getEmailID() {
		return emailID;
	}



	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	
	

}
