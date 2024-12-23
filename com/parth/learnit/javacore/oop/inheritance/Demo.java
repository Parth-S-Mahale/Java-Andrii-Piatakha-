package com.parth.learnit.javacore.oop.inheritance;

public class Demo {
	
	public static void main(String[] args) {
		Product product = new Phone();
		product.setName("Iphone 15");
		System.out.println("Product name: " + product.getName());
		System.out.println("Remaining amount in stock: "+ product.calculateRemainingAmount());
		
//		product.ring(); // Error! : as ring() method is not included in Product class
		
		Phone phone2 = new Phone(); 
		phone2.ring(); // Executed : as ring() method is included in Product class
		
		if(product instanceof Phone) {
			Phone phone3 = (Phone) product;
//			Phone phone3 = new Phone();
			phone3.ring();
		}
		
		System.out.println(phone2.calculateAmountOfVariants());
 	}
}
