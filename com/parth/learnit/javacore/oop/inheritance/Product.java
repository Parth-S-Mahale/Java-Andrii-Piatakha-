package com.parth.learnit.javacore.oop.inheritance;

public class Product {
	
	private int id;
	private String name;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int calculateRemainingAmount() {
		return 100; // just a stub for the sake of example
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Product[] listVariants() {
		// some code that fetches the variant products from database
		return new Product[3]; // just a fake return object for the sake of example
	}
}
