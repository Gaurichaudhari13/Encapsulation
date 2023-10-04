package com.java.encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("xyz");
		employee.setEmail("xyz@mail.com");
		employee.setDesignation("IT");
		employee.setSalary(50000);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
	}

}
