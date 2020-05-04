/**
 * 
 */
package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Product;
import com.cg.service.ProductService;

/**
 * @author Shivani
 * Apr 11, 2020
 */

/**
 * The @RestController annotation in Spring MVC is nothing but a combination of the @Controller and the @ResponseBody annotation.
 * once you mark a class as @RestController then every method is written a domain object instead of a view
 * 
 * This annotation is applied to a class to mark it as a request handler.
*/
@RestController
/**
 * RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods.
 */
@RequestMapping("/ctrl")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> get(){
		return service.getAllProducts();
	}
	
	@PostMapping("/products")
	public Product save(@RequestBody Product productObj) {
		service.addProduct(productObj);
		return productObj;
	}
	
	/**
	 * The @PathVariable annotation is used for data passed in the URI (e.g. RESTful web services)
	 *  while @RequestParam is used to extract the data found in query parameters.
	 *  
	 *   
	 * @param id
	 * @return
	 */
	@GetMapping("/products/{id}") //path variable
	public Product get(@PathVariable int id) {
		Product product = service.searchProduct(id);
		if(product==null)
			throw new RuntimeException("Product with Id"+id+" Not found");
		return product;
	}

	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Product with this id not present -- Testing Message--")
    @ExceptionHandler({Exception.class})
    public void handleException() {
    }

	

	
}
