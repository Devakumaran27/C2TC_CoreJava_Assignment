package com.devakumaran.assignment1.utilities;

import com.devakumaran.assignment1.employee.Employee;

public class EmployeeUtilities {
	
	/**
     * Gives a salary raise to an employee.
     * Demonstrates access to protected setter from the same package/subclass.
     * @param employee The employee object
     * @param percentage Raise percentage
     */
    public static void giveRaise(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        // protected setSalary is accessible here (same package)
        employee.setSalary(newSalary);
        System.out.println(employee.getName() + " got a raise! New Salary: " + newSalary);
    }

    /**
     * Prints employee details.
     * @param employee The employee object
     */
    public static void printEmployee(Employee employee) {
        employee.displayInfo();
    }

}
