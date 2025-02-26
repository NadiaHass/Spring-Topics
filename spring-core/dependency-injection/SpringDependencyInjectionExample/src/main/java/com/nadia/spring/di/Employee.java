package com.nadia.spring.di;

public class Employee {
	private int id;
	private String name;
	
	public Employee(int id) {
		System.out.println("Employee(int id) constructor is called");
		this.id = id;
	}
	
	public Employee(String name) {
		System.out.println("Employee(String name) constructor is called");
		this.name = name;
	}

	public Employee(int id, String name) {
		System.out.println("Employee(int id, String name) constructor is called");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee { id = " + id + ", name = " + name + "}");
	}
	
}
