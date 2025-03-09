package com.nadia.spring.di;

// @Component

public class Employee {
	private int id;
	private String name;
	private Address address;
	
//	same here with using autowired
//    private final int id = 21;
//    private final String name = "Nadia";
//    private final Address address;
//
//    @Autowired  // Constructor Injection
//    public Employee(Address address) {
//        this.address = address;
//    }

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

	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
		System.out.println("Employee { id = " + id + ", name = " + name + ", address= " + address + "}");
	}
}
