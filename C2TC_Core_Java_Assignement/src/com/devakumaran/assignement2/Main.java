package com.devakumaran.assignement2;

public class Main {
	public static void main(String[] args) {
        // Create Student object
        student s = new student();

        // Create Commission object using constructor
        Commission emp = new Commission("Deva", "Pondy", "9790584866", 60000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Phone: " + emp.getPhone());
        System.out.println("Sales Amount: ₹" + emp.getSalesAmount());

        emp.setSalesAmount(85000);
        System.out.println("Updated Sales Amount: ₹" + emp.getSalesAmount());
    }

}
