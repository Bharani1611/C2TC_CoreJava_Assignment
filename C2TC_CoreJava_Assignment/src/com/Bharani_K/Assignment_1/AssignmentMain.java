package com.Bharani_K.Assignment_1;

import com.Bharani_K.Assignment_1.Employee.Manager;
import com.Bharani_K.Assignment_1.Employee.Developer;
import com.Bharani_K.Assignment_1.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {

        Manager mgr = new Manager("Bharani", 1001, 85000, "Operations");
        Developer dev = new Developer("Leo", 1002, 70000, "Java");

        System.out.println("📋 Manager Details:");
        EmployeeUtilities.printEmployeeDetails(mgr);

        System.out.println("📋 Developer Details:");
        EmployeeUtilities.printEmployeeDetails(dev);
    }
}
