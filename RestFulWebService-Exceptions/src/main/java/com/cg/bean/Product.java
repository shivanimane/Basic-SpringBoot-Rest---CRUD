/**
 * 
 */
package com.cg.bean;

/**
 * @author Shivani
 * Apr 11, 2020
 */
public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	static int autogen=1;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Product(String productName, double productPrice) {
		super();
		this.productId=autogen++;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	@Override
	public String toString() {
		return "Product Id="+productId+" Product Name=" + productName + ", Price =" + productPrice ;
	}
	
	

}
