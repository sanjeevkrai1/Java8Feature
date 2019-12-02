package com.test.filter;

public class Product {

	private int id;
	private String productName;
	private float price;

	public Product(int id, String productName, float price) {
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Product [id=%s, productName=%s, price=%s]", id, productName, price);
	}

}
