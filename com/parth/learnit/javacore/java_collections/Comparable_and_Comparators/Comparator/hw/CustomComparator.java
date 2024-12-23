package com.parth.learnit.javacore.java_collections.Comparable_and_Comparators.Comparator.hw;

import java.util.Comparator;

public class CustomComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1, Product p2) {
		
		// Compare by category name
		int categoryComparison = p1.getCategoryName().compareTo(p2.getCategoryName());
		if(categoryComparison != 0) {
			return categoryComparison;
		}
		
		// Compare by price
		int priceComparison = Double.compare(p1.getPrice(), p2.getPrice());
		if(priceComparison != 0) {
			return priceComparison;
		}
				
		// Compare by product name
		return p1.getProductName().compareTo(p2.getProductName());
		
	}	
}
