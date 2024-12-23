package com.parth.learnit.javacore.java_collections.List_ArrayList_LinkedList.hw;

import java.util.ArrayList;
import java.util.List;

public class ListMiddle {
	
	public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove) {
		
		int middleIndex = list.size() / 2;
		for (int i = 0; i < numberOfElementsToRemove; i++) {
			list.remove(middleIndex);
			middleIndex++;
		}

	}
	
	// Method to reset the list to a size of 1,000,000
    public static void resetList(List<Integer> list) {
        list.clear();  // Clear the existing list
        int numberOfElementsToAdd = 1_000_000;

        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.add(i + 1);  // Add elements from 1 to 1,000,000
        }
    }

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		int numberOfElementsToAdd = 1_000_000;

		for (int i = 0; i < numberOfElementsToAdd; i++) {
			list.add(i + 1);
		}

		System.out.println("Elements in the list: " + list);

		long mill = System.nanoTime();
		removeElementsFromMiddle(list, 100);
		long delta = (System.nanoTime() - mill) / 10000;

		System.out.println("Time taken: " + delta + " ms");
		
		// Reset the list again for the next test
        resetList(list);
	}
	
}
