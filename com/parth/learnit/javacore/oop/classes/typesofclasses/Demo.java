package com.parth.learnit.javacore.oop.classes.typesofclasses;

import com.parth.learnit.javacore.oop.classes.Cart;
import com.parth.learnit.javacore.oop.classes.Cart.Discount;
import com.parth.learnit.javacore.oop.classes.Cart.Tax;

public class Demo {
	
	public static void main(String[] args) {
		User user = new User();
		
		user.setId(221051);
		user.setFirstName("Parth");
		user.setLastName("Mahale");
		user.setEmail("parthmahal1234@gmail.com");
		user.setProducts(null);
		
		System.out.println("***************************");
		System.out.println("Here are User Details: ");
		System.out.println("User Id: " + user.getId());
		System.out.println("User FirstName: " + user.getFirstName());
		System.out.println("User LastName: " + user.getLastName());
		System.out.println("User Email: " + user.getEmail());
		System.out.println("User Products: " + user.getProducts());
		System.out.println("***************************");
		
//		// === init static nested class
		Tax tax = new Cart.Tax("someTaxType", 0);
		
		tax.setTaxType("incomeTax");
		tax.setTaxRate(75);
		
		
		System.out.println("Here are Tax Details: ");
		System.out.println("Tax Type: " + tax.getTaxType());
		System.out.println("Tax Rate: " + tax.getTaxRate());
		System.out.println("***************************");
		
//		// === init inner class
		Discount discount = new Cart().new Discount("firstClientDiscount", 0);
		
		discount.setDiscountName("5% OFF");
		discount.setDiscountRate(0.05);
		
		
		System.out.println("Here are Discount Details: ");
		System.out.println("Discount Name: " + discount.getDiscountName());
		System.out.println("Discount Rate: " + discount.getDiscountRate());
		System.out.println("***************************");
		
//		// === Abstract class demo
		
//		Product product = new Product(); // can't create instance of an abstract class
		MasterProduct masterProduct = new MasterProduct();
		VariantProduct variantProduct = new VariantProduct();	
		
	
		masterProduct.setName("Mercedes S-class");
		variantProduct.setDeliveryAvailable(true);
		
		
		System.out.println("Here are Product Details: ");
		System.out.println("Product Name: " + masterProduct.getName());
		System.out.println("Status of Delivery: " + variantProduct.isDeliveryAvailable());
		System.out.println("***************************");
		
//     // === Anonymous class demo
//		Product product = new Product() {
//			@Override
//			public boolean isAvailableInStock() {
//				return false;
//			}
//		};
	}
}
