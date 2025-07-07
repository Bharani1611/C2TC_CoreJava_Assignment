package com.Bharani_K.Assignment_2.Default_Constructor;

public class Main {
    public static void main(String[] args) {
        Student studentObj = new Student();      // Calls default constructor

        Commission emp = new Commission();
        emp.setDetails("Bharani", "Chennai", "9876543210", 85000);  // Set values directly
        emp.calculateCommission();               // Calculate & display commission
    }
}
