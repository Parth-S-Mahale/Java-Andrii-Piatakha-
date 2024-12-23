package com.parth.learnit.javacore.oop.staticdemo;

	/*
	 * The statement 'import static java.util.Arrays.*;' 
	 * in Java is a static import that allows you to 
	 * directly use all the static methods and fields 
	 * from the java.util.Arrays class without needing 
	 * to qualify them with the class name.
	 */

import static java.util.Arrays.*;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		User user1 = new User();
		System.out.println("user1.getId() = " + user1.getId());
		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		User user2 = new User();
		System.out.println("user2.getId() = " + user2.getId());
		System.out.println("user2.getCounter() = " + user2.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		@SuppressWarnings("unused")
		User user3 = new User();
		
		/*
		 * In Java, calling a static method via an instance (e.g., user3.doAnyStaticAction()) 
		 * is allowed but discouraged because static methods are associated with the class itself, 
		 * not with any particular instance.
		 */
		
//		user3.doAnyStaticAction(); 
		
		/*
		 * Correct approach: A static method should be invoked using the class name for clarity, 
		 * e.g., User.doAnyStaticAction();
		 * 
		 */
		
		User.doAnyStaticAction();
		Employee.doAnyStaticAction();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		int[] arr = {21, 52, 73, 42, 11};
		Arrays.sort(arr); // import java.util.Arrays;
		
		sort(arr); // static import java.util.Arrays.*;
		
		System.out.print("Sorted Array: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		int index = binarySearch(arr, 42);
		System.out.println("Index is(We Need a sorted Array for binarySearch): " + index);
	}
}
