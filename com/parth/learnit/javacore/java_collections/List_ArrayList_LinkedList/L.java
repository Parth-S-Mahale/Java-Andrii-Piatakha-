package com.parth.learnit.javacore.java_collections.List_ArrayList_LinkedList;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class L {

	public static void main(String[] args) {
		// Step 1: Implement List using ArrayList
		List<Integer> arrayList = new ArrayList<>();

		long arrayListStartTime = System.currentTimeMillis();

		for (int i = 1; i <= 1_000_000; i++) {
			arrayList.add(i); // Adding elements to ArrayList
		}

		long arrayListEndTime = System.currentTimeMillis();

		System.out.println("ArrayList Size: " + arrayList.size());
		System.out.println("Time taken by ArrayList: " + (arrayListEndTime - arrayListStartTime) + " ms");

		// Step 2: Implement List using LinkedList
		List<Integer> linkedList = new LinkedList<>();

		long linkedListStartTime = System.currentTimeMillis();

		for (int i = 1; i <= 1_000_000; i++) {
			linkedList.add(i); // Adding elements to LinkedList
		}

		long linkedListEndTime = System.currentTimeMillis();

		System.out.println("LinkedList Size: " + linkedList.size());
		System.out.println("Time taken by LinkedList: " + (linkedListEndTime - linkedListStartTime) + " ms");
	}
}
