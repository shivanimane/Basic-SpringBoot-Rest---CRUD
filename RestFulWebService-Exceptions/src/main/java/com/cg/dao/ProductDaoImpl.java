/**
 * 
 */
package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.bean.Product;
import com.cg.staticDB.ProductDB;

/**
 * @author Shivani
 * Apr 11, 2020
 */

@Repository
public class ProductDaoImpl implements ProductDao {

	public List<Product> getAllProducts() {
		return ProductDB.getProductList();
	}

	public void addProduct(Product product) {
		ProductDB.getProductList().add(product);
	}

	public Product deleteProduct(int id) {
		return ProductDB.getProductList().remove(id);
	}

	public Product searchProduct(int id) {
		return ProductDB.getProductList().stream().filter(p->(p.getProductId())==id).findFirst().get();
	}

}
