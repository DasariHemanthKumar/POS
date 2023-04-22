package com.sf.pos.bean;


import jakarta.persistence.*;


@Entity
@Table(name="Food")
public class FoodBean {

	@Id
	@GeneratedValue
	private int foodID;
		
	@Column
	private String name;
	
	@Column
	private String type;
	@Column
private String foodsize;
	@Column
private String quality;
	@Column
private String price;
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFoodsize() {
		return foodsize;
	}
	public void setFoodsize(String foodsize) {
		this.foodsize = foodsize;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
