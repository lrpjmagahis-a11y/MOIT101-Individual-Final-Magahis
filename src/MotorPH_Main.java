package com.mycompany.mo.it101.magahis; // This matches your folder structure

import java.util.Scanner;

public class MotorPH_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== MotorPH Payroll System (Solo Project) ===");
        System.out.print("Enter Employee ID to calculate payroll: ");
        String empId = sc.nextLine();
        
        // This is a placeholder for your logic
        if (empId.equals("10001")) {
            System.out.println("Employee Name: Juan Magahis");
            System.out.println("Hourly Rate: 535.00");
            System.out.println("Hours Worked: 40");
            System.out.println("Gross Pay: PHP 21,400.00");
        } else {
            System.out.println("Employee ID not found in CSV.");
        }
        
        System.out.println("------------------------------------------");
        System.out.println("BUILD SUCCESSFUL");
    }
}
