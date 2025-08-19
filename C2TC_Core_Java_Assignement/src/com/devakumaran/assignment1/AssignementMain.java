package com.devakumaran.assignment1;

import com.devakumaran.assignment1.employee.Developer;
import com.devakumaran.assignment1.employee.Manager;
import com.devakumaran.assignment1.utilities.EmployeeUtilities;

public class AssignementMain {
	 public static void main(String[] args) {
	        // Create Manager and Developer objects
	        Manager manager = new Manager("Alice", 101, 75000, "HR");
	        Developer developer = new Developer("Bob", 102, 60000, "Java");
	     
	        

	        // Print details
	        EmployeeUtilities.printEmployee(manager);
	        System.out.println();
	        EmployeeUtilities.printEmployee(developer);
	        System.out.println();

	        // Give raise
	        EmployeeUtilities.giveRaise(manager, 10);
	        EmployeeUtilities.giveRaise(developer, 15);

	        // Print updated details
	        EmployeeUtilities.printEmployee(manager);
	        System.out.println();
	        EmployeeUtilities.printEmployee(developer);
	        System.out.println();
	    }

}
