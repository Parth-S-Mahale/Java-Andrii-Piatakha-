package com.parth.learnit.javacore.java_collections.iterables_and_iterators.custom_iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachRemaining {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		Iterator<String> iterator = list.iterator();
		iterator.forEachRemaining(System.out::println);
	}
}
