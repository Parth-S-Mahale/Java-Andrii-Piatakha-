package com.parth.learnit.javacore.java_collections.iterables_and_iterators.custom_iterable;

import java.util.ArrayList;

public class ForEachRemainingUsingStreamAPI {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Cherry");
		
		list.stream().forEach(System.out::println); // Output: Apple, Mango, Cherry							
	}
}
