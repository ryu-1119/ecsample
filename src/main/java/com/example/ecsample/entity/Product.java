package com.example.ecsample.entity;

public class Product {
	private int id;
	private String name;
	private int price;
	//private int stock;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
		//this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	//	public int getStock() {
	//		return stock;
	//	}
}
