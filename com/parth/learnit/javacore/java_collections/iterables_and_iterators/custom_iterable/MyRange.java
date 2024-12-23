package com.parth.learnit.javacore.java_collections.iterables_and_iterators.custom_iterable;

import java.util.Iterator;

class Main implements Iterable<Integer> {
	
	private int start, end;
	
	public Main(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public Iterator<Integer> iterator(){
		return new Iterator<>() {
			
			private int current = start;
			
			@Override
			public boolean hasNext() {
				return current < end;
			}
			
			@Override
			public Integer next() {
				return current++;
			}
			
		};
	}
	
}

public class MyRange{
	
	public static void main(String[] args) {
		
		Main range = new Main(1, 5);
		
		for(int num: range) {
			System.out.print(num + " "); // Output: 1 2 3 4 
		}
	}
}
