package com.parth.learnit.javacore.java_collections.List_ArrayList_LinkedList;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

// 		To optimize performance, you can set the initial capacity of the ArrayList using:
//		ArrayList<Integer> list = new ArrayList<>(1000000000);

		// Count Start Time
		long startTime = System.currentTimeMillis();

// ------------------------------------------------
		/*
		 * For adding numbers from 1 to 100
		 */
//		for(int i = 1; i <= 100; i++) {
//			list.add(i);
//		}
// ------------------------------------------------		

// ------------------------------------------------
		/*
		 * For adding numbers from 1 to 10000
		 */
//		for(int i = 1; i <= 10_000; i++) {
//			list.add(i);
//		}
// ------------------------------------------------
		
// ------------------------------------------------		
		/*
		 * For adding numbers from 1 to 100000
		 */
		for (int i = 1; i <= 1_00_000; i++) {
			list.add(i);
		}
// ------------------------------------------------
		
		// Count Start Time
		long endTime = System.currentTimeMillis();

		System.out.println("Size of the ArrayList: " + list.size());
		System.out.println("Time taken to add " + list.size() + " elements: " + (endTime - startTime) + " ms");
		
	}
}
