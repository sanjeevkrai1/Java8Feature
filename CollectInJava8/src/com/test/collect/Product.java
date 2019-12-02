package com.test.collect;

public class Product {

	private int price;
	private String productName;

	public Product(int price, String productName) {
		super();
		this.price = price;
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return String.format("Product [price=%s, productName=%s]", price, productName);
	}

}
