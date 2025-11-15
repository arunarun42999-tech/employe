package com.mobile.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name="mobiletable")
	public class MobileEntity {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	     private int id;
		private String brand;
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		private int price;
		private String color;
		private float size;
		private int warrenty;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public float getSize() {
			return size;
		}
		public void setSize(float size) {
			this.size = size;
		}
		public int getWarrenty() {
			return warrenty;
		}
		public void setWarrenty(int warrenty) {
			this.warrenty = warrenty;
		}
		
		
	}
	


