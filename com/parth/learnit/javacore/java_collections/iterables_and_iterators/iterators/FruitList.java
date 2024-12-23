package com.parth.learnit.javacore.java_collections.iterables_and_iterators.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FruitList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
