package com.parth.learnit.javacore.java_collections.iterables_and_iterators.custom_iterable;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoListIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Cherry");
		
		ListIterator<String> iterator = list.listIterator();
		
		System.out.println("Forward Traversal: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		
		System.out.println("Backward Traversal: " );
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous() + " ");
		}
		
	}
	
}
