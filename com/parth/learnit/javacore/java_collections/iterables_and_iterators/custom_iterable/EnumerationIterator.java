package com.parth.learnit.javacore.java_collections.iterables_and_iterators.custom_iterable;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationIterator {
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");
		
		Enumeration<String> enumeration = vector.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}
	
}
