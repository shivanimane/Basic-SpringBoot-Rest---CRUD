/**
 * 
 */
package com.cg.dao;

import java.util.List;

import com.cg.bean.Product;

/**
 * @author Shivani
 * Apr 11, 2020
 */
public interface ProductDao {
	public List<Product> getAllProducts();
	public void addProduct(Product product);
	public Product deleteProduct(int id);
	public Product searchProduct(int id);
}
