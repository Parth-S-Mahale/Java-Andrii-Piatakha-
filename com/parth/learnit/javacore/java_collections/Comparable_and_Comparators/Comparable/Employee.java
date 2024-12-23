package com.parth.learnit.javacore.java_collections.Comparable_and_Comparators.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	
	 int id;
	 String name;
	 
	 Employee(int id, String name){
		 this.id = id;
		 this.name = name;
	 }

	 @Override
	 public int compareTo(Employee other) {
		 return this.id - other.id; // Ascending order by ID
	 }
	 
	 @Override
	 public String toString() {
		 return "Employee{id=" + id + ", name='" + name + "'}"; // Fixed formatting issue
	 }
	 
	 public static void main(String[] args) {
		 
		 List<Employee> employees = new ArrayList<>();
		 
		 employees.add(new Employee(3, "Parth"));
		 employees.add(new Employee(1, "Rahul"));
		 employees.add(new Employee(2, "Aadi"));
		 
		 Collections.sort(employees); 
		 
		 for(Employee employee : employees) {
			 System.out.println(employee);
		 }
		 
	 }
}
