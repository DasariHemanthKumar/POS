package com.sf.pos.bean;

import jakarta.persistence.*;

@Entity
@Table(name="Cart")
public class CartBean {

	@Id
	@GeneratedValue
	private int cartID;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID", referencedColumnName="userID")
private CredentialBean credentialBean;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "foodID", referencedColumnName="foodID")
private FoodBean foodBean;
	
	@Column
	private String type;
	
	@Column
private String quality;
	@Column
private String cost;
	@Column
private String orderDate;
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public CredentialBean getCredentialBean() {
		return credentialBean;
	}
	public void setCredentialBean(CredentialBean credentialBean) {
		this.credentialBean = credentialBean;
	}
	public FoodBean getFoodBean() {
		return foodBean;
	}
	public void setFoodBean(FoodBean foodBean) {
		this.foodBean = foodBean;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
	
	
	
	
}
