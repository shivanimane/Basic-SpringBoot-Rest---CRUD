/**
 * 
 */
package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Product;
import com.cg.dao.ProductDao;

/**
 * @author Shivani
 * Apr 11, 2020
 */
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao dao;
	
	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public void addProduct(Product product) {
		dao.addProduct(product);
	}

	@Override
	public Product deleteProduct(int id) {
		return dao.deleteProduct(id);
	}

	@Override
	public Product searchProduct(int id) {
		return dao.searchProduct(id);
	}

}
