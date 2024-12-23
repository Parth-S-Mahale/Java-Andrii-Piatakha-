package com.parth.learnit.javacore.oop.solid.l.solution;

public class LiskovSubstitutionPrincipleDemo {
	
	public static void main(String[] args) {
		
		FlyingBird[] flyingBirds = new FlyingBird[] {new Crow(), new Sparrow()};
		for(FlyingBird bird: flyingBirds) {
			bird.fly();
		}
		
		Bird[] Birds = new Bird[] {new Crow(), new Sparrow(), new Ostrich()};
		for(Bird bird: Birds) {
			bird.eat();
		}
	}
	
}
