package com.Bharani_K.Assignment_1.utilities;

import com.Bharani_K.Assignment_1.Employee.Manager;
import com.Bharani_K.Assignment_1.Employee.Employee;
import com.Bharani_K.Assignment_1.Employee.Developer;

public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: ₹" + emp.getSalary());

        if (emp instanceof Manager) {
            Manager m = (Manager) emp;
            System.out.println("Department: " + m.getDepartment());
        } else if (emp instanceof Developer) {
            Developer d = (Developer) emp;
            System.out.println("Programming Language: " + d.getProgrammingLanguage());
        }

        System.out.println("---------------------------");
    }
}
