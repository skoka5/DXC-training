package com.dxc.examples;

import java.util.TreeSet;

public class StudentTreeSet_01 {
	
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<>();
		
		Student s1 = new Student(101, "Kishor", "CSE", 3, "9985812292");
		Student s2 = new Student(102, "Vijay", "ECE", 4, "9988776655");
		Student s3 = new Student(103, "Mahesh", "Mech", 2, "1100229933");
		Student s4 = new Student(104, "Balaji", "CSE", 4, "9911228833");
		
		students.add(s4);
		students.add(s2);
		students.add(s1);
		students.add(s3);
		
		for(Student student : students) {
			System.out.println(student);
		}
	}

}
