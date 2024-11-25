package com.nit.Implementation;

import com.nit.CustomException.InsufficientQuantityException;
import com.nit.CustomException.InvalidProductException;
import com.nit.Product.Product;

public class ShoppingCart {
	public Product[] cartItems;
	public int itemCount;

	public ShoppingCart(int capacity) {
		cartItems = new Product[capacity];
		itemCount = 0;
	}

	public void addToCart(Product product, int qty) throws InsufficientQuantityException, InvalidProductException {
		if (product == null) {
			throw new InvalidProductException("Product not found.");
		}
		if (itemCount >= cartItems.length) {
			throw new InvalidProductException("Cart is full. Cannot add more products.");
		}

		product.decreaseQuantity(qty);
		cartItems[itemCount++] = new Product(product.id, product.name, product.price, qty);
	}
 
	public double calculateTotal() {
		double total = 0.0;
		for (int i = 0; i < itemCount; i++) {
			total += cartItems[i].price * cartItems[i].quantity;
		}
		return total;
	}
}
