package com.nit.TestApplication;

import com.nit.CustomException.*;
import com.nit.Implementation.ShoppingCart;
import com.nit.Product.Product;

public class ShoppingApplication {

	public static void main(String[] args) throws InsufficientQuantityException, InvalidProductException {
		Product product1 = new Product(101, "Laptop", 50000, 10);
		Product product2 = new Product(102, "Mouse", 500, 20);
		Product product3 = new Product(103, "Keyboard", 1500, 15);

		ShoppingCart cart = new ShoppingCart(5);

		try {
			cart.addToCart(product1, 2);
			cart.addToCart(product2, 5);
			cart.addToCart(product3, 3);

			System.out.println("Total Price is: " + cart.calculateTotal());
		} catch (InsufficientQuantityException | InvalidProductException e) {
			System.err.println(e.getMessage());
		}

		// Test Case: Add invalid product
		
	/*	try {
			cart.addToCart(null, 1);
		} catch (InvalidProductException e) {
			System.err.println(e.getMessage());
		} */

		 //Test Case: Insufficient quantity
	/*	try {
			cart.addToCart(product1, 20);
		} catch (InsufficientQuantityException e) {
			System.err.println(e.getMessage());
		} */
	}
}
