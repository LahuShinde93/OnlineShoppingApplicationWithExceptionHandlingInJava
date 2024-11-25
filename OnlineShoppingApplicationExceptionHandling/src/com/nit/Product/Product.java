package com.nit.Product;

import com.nit.CustomException.*;

public class Product {
	public int id;
	public String name;
	public double price;
	public int quantity;

	public Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void decreaseQuantity(int amount) throws InsufficientQuantityException {
		if (amount > quantity) {
			throw new InsufficientQuantityException(
					"Requested quantity (" + amount + ") is not available for product: " + name);
		}
		quantity -= amount;
	}
}
