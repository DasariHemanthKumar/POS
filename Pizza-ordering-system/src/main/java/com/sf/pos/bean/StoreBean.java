package com.sf.pos.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name="PizzaStore")
	public class StoreBean {
		@Id
		@GeneratedValue
		private int storeID;
		@Column
		private String name;
		@Column
		private String street;
		@Column
		private String mobileno;
		@Column
		private String city;
		@Column
		private String state;
		@Column
		private String pincode;
		
		public int getStoreID() {
			return storeID;
		}
		public void setStoreID(int storeID) {
			this.storeID = storeID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
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
		@Override
		public String toString() {
			return "StoreBean [storeID=" + storeID + ", name=" + name + ", street=" + street + ", mobileno=" + mobileno
					+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
		}

	}



