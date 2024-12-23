package com.parth.learnit.javacore.java_collections.List_ArrayList_LinkedList;

import java.util.LinkedList;

public class LinkedL {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

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

		System.out.println("Size of the LinkedList: " + list.size());
		System.out.println("Time taken to add " + list.size() + " elements: " + (endTime - startTime) + " ms");
		
	}
}
