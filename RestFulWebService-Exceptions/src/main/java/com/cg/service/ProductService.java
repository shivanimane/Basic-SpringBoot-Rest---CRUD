/**
 * 
 */
package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.bean.Product;

/**
 * @author Shivani
 * Apr 11, 2020
 */

public interface ProductService{
	public List<Product> getAllProducts();
	public void addProduct(Product product);
	public Product deleteProduct(int id);
	public Product searchProduct(int id);
}
