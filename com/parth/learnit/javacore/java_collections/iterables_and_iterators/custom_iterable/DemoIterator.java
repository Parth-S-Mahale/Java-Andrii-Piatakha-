package com.parth.learnit.javacore.java_collections.iterables_and_iterators.custom_iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
			
			if(item.equals("Banana")) {
				iterator.remove(); // Removes 'Banana' from the list
			}
		}
		
		System.out.println(list); // Output: [Apple, Cherry]
	}
}
