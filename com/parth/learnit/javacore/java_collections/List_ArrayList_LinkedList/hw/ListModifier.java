package com.parth.learnit.javacore.java_collections.List_ArrayList_LinkedList.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListModifier {

	public static List<Integer> addIntegersToList(List<Integer> list, int beginCount, int middleCount, int endCount,
			int value) {

		// Add to the beginning
		for (int i = 0; i < beginCount; i++) {
			list.add(0, value);
		}

		// Add to the middle
		int middleIndex = list.size() / 2;
		for (int i = 0; i < middleCount; i++) {
			list.add(middleIndex, value);
			middleIndex++;
		}

		// Add to the end
		for (int i = 0; i < endCount; i++) {
			list.add(value);
		}

		return list;
	}
	
	public static List<Integer> removeIntegersFromList(List<Integer> list, int beginCount, int middleCount, int endCount,
			int removedValue) {

		// Add to the beginning
		for (int i = 0; i < beginCount; i++) {
			list.remove(0);
		}

		// Add to the middle
		int middleIndex = list.size() / 2;
		for (int i = 0; i < middleCount; i++) {
			list.remove(middleIndex);
			middleIndex++;
		}

		// Add to the end
		for (int i = 0; i < endCount; i++) {
			list.add(list.size() - 1);
		}

		return list;
	}
	
	public static List<Integer> removeIntegersFromList(List<Integer> list, int beginCount, int middleCount, int endCount) {
        // Remove from the beginning
        for (int i = 0; i < beginCount && !list.isEmpty(); i++) {
            list.remove(0);
        }

        // Remove from the middle
        int middleIndex = list.size() / 2;
        for (int i = 0; i < middleCount && middleIndex < list.size(); i++) {
            list.remove(middleIndex);
        }

        // Remove from the end
        for (int i = 0; i < endCount && !list.isEmpty(); i++) {
            list.remove(list.size() - 1);
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original List: " + originalList);

        // Example: Add integers
        int addBeginCount = 2;
        int addMiddleCount = 3;
        int addEndCount = 4;
        int valueToAdd = 9;
        List<Integer> modifiedList = addIntegersToList(new ArrayList<>(originalList), addBeginCount, addMiddleCount, addEndCount, valueToAdd);
        System.out.println("After Adding Integers: " + modifiedList);

        // Example: Remove integers
        int removeBeginCount = 2;
        int removeMiddleCount = 2;
        int removeEndCount = 2;
        List<Integer> removedList = removeIntegersFromList(new ArrayList<>(modifiedList), removeBeginCount, removeMiddleCount, removeEndCount);
        System.out.println("After Removing Integers: " + removedList);
    }
    
}
