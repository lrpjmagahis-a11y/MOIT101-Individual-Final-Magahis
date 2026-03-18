import java.util.Scanner;

public class MotorPH_Main {
    public static void main(String[] args) {
        // 1. Setup Sample Data (We will automate this with CSV later!)
        String name = "Juan Magahis";
        double hourlyRate = 535.00;
        String timeIn = "08:00";
        String timeOut = "17:05";

        System.out.println("=== MotorPH Payroll System: Solo Edition ===");
        
        // 2. CALLING THE SPECIALIST (PayrollEngine)
        // This is where the magic happens! We send the times to the other file.
        double hoursWorked = PayrollEngine.calculateHours(timeIn, timeOut);
        
        // 3. CALLING THE MATH SPECIALIST AGAIN
        double grossPay = PayrollEngine.calculateGrossPay(hoursWorked, hourlyRate);

        // 4. DISPLAY THE RESULT
        System.out.println("Employee: " + name);
        System.out.println("Hours Worked (minus 1hr lunch): " + String.format("%.2f", hoursWorked));
        System.out.println("Gross Salary: PHP " + String.format("%.2f", grossPay));
        System.out.println("==============================================");
    }
}
