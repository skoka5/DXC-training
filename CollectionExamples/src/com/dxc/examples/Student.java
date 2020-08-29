package com.dxc.examples;

public class Student implements Comparable<Student> {
	
	int slno;
	String name;
	String branch;
	int year;
	String phno ;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int slno, String name, String branch, int year, String phno) {
		super();
		this.slno = slno;
		this.name = name;
		this.branch = branch;
		this.year = year;
		this.phno = phno;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [slno=" + slno + ", name=" + name + ", branch=" + branch + ", year=" + year + ", phno=" + phno
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.slno - o.slno;
	}
	

}
