package com.parth.learnit.javacore.oop.encapsulation.package2;

public class ClassC extends ClassB{
	
	/*

	 * we have defined the doSomething() in ClassA as 
	  
	 	public void doSomething() {
	 
	 	}
	  
	 * And we are defining the same Method in ClassC Using OOP approach, but we are violating the rules of Encapsulation:
	 *
	 * 1. By contracting the modifier to 'private' instead of 'public' keep it same.
	 * 
	 * 2. We cannot contract or lower the modifiers, rather we can expand them.
	 * 
	 * For Example: 
	 * 
	 * (For ClassA):
	 
	 	protected void doSomething(){ 
	 		System.out.println("ClassA: doSomething() Executed Successfully!");
	  	}
	  	
	 * (For ClassC):
	  	
	  	@Override
	  	public void doSomething(){ 
	 		System.out.println("ClassC: doSomething() Executed Successfully!");
	  	}
	  
	 */
	
//	@Override
//	protected void doSomething() {
//		
//	}
	
	@Override
	public void doSomethingClassB() {
		System.out.println("ClassB: doSomethingClassB() Executed Successfully!");
	}
}
