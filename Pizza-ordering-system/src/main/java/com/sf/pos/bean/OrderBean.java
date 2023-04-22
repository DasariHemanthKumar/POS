package com.sf.pos.bean;

import jakarta.persistence.*;

@Entity
@Table(name="Order Details")
public class OrderBean {
 @Id
 @GeneratedValue
 private int orderID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID", referencedColumnName="userID")
private CredentialBean credentialBean;
	
	 @Column
	 private String orderdate;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "storeID", referencedColumnName="storeID")
	private StoreBean storeBean;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "cartID", referencedColumnName="cartID")
	private CartBean cartBean;

	 @Column
	 private String orderstatus;

	 @Column
	 private String street;
	 
	 @Column
	 private String city;
	 
	 @Column
	 private String state;
	 
	 @Column
	 private String pincode;

	 @Column
	 private String mobileno;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public CredentialBean getCredentialBean() {
		return credentialBean;
	}

	public void setCredentialBean(CredentialBean credentialBean) {
		this.credentialBean = credentialBean;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public StoreBean getStoreBean() {
		return storeBean;
	}

	public void setStoreBean(StoreBean storeBean) {
		this.storeBean = storeBean;
	}

	public CartBean getCartBean() {
		return cartBean;
	}

	public void setCartBean(CartBean cartBean) {
		this.cartBean = cartBean;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	 
	 
	 
	 
	 
	 
}
