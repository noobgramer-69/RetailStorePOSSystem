package com.assignment.model;

public class Product {
	 
	private String productID;
	private String productName;
	private Double productPrice;
	private boolean fragile;

	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public boolean isFragile() {
		return fragile; 
	}
	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}
	
	 
		

}
