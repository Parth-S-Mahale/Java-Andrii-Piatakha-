package com.parth.learnit.javacore.java_collections.iterables_and_iterators.iterables;

import java.util.ArrayList;
import java.util.List;

public class FruitList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Mango");
		list.add("Strawberry");
		list.add("Banana");
		
		for(String item: list) {
			System.out.println(item);
		}
		
	}
	
}
