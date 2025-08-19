package com.devakumaran.assignment1.employee;

/**
 * The Employee class represents a general employee.
 * Demonstrates encapsulation using private attributes 
 * with public getters and setters.
 */

public class Employee {
	
		private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Constructor to initialize Employee.
	     * @param name Employee's name
	     * @param employeeId Unique ID of employee
	     * @param salary Employee's salary
	     */
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) { // protected for subclasses
	        this.salary = salary;
	    }

	    /**
	     * Displays employee details.
	     */
	    public void displayInfo() {
	        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + salary);
	    }
	}



