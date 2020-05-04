/**
 * 
 */
package com.cg.staticDB;

import java.util.ArrayList;

import com.cg.bean.Product;

/**
 * @author Shivani
 * Apr 11, 2020
 */
public class ProductDB {
	
	private static ArrayList<Product> productList = new ArrayList<Product>();
	
	static {
		productList.add(new Product("IPAD", 30000));
		productList.add(new Product("Mobile", 40000));
		productList.add(new Product("Power Bank", 3000));
		productList.add(new Product("Charger", 800));
		productList.add(new Product("Earphones", 1200));
	}

	public static ArrayList<Product> getProductList() {
		return productList;
	}

	public static void setProductList(ArrayList<Product> productList) {
		ProductDB.productList = productList;
	}
	
	

}
