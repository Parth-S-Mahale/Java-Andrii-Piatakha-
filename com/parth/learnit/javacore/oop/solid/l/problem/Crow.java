package com.parth.learnit.javacore.oop.solid.l.problem;

public class Crow implements Bird {

	@Override 
	public void fly() {
		System.out.println("Crow files!");
	}
	
	@Override
	public void eat() {
		System.out.println("Crow eats!");
	}
}
