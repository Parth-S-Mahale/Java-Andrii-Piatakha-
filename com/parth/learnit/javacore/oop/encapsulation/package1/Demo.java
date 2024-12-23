package com.parth.learnit.javacore.oop.encapsulation.package1;


import com.parth.learnit.javacore.oop.encapsulation.package2.ClassB;

public class Demo {
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.doSomething(); // public modifier demo
		classA.doSomething2(); // protected modifier demo
		
		@SuppressWarnings("unused")
		ClassB classB = new ClassB();
//		classB.doSomethingclassB(); // package private demo
		
	}
}
