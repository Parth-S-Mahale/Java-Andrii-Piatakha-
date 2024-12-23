package com.parth.learnit.javacore.java_collections.Comparable_and_Comparators.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {

	int grade;
	String name;

	Students(int grade, String name) {
		this.grade = grade;
		this.name = name;
	}

	@Override
	public int compareTo(Students other) {
		return this.grade - other.grade; // Natural ordering by grade
	}

	@Override
	public String toString() {
		return "Student{name: '" + name + "', grade: " + grade + "}";
	}

}

class NameComparator implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {
		return s1.name.compareTo(s2.name); // Custom ordering by name
	}

}

public class Student {

	public static void main(String[] args) {
		List<Students> students = new ArrayList<>();
		students.add(new Students(85, "Parth"));
		students.add(new Students(92, "Rahul"));
		students.add(new Students(75, "Aadi"));

		System.out.println("Before sorting: " + students);

		// Sorting by grade (natural ordering)
		Collections.sort(students);
		System.out.println("Sorted by grade: " + students);

		// Sorting by name (custom ordering)
		Collections.sort(students, new NameComparator());
		System.out.println("Sorted by name: " + students);

	}
	
}
