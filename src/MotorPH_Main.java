import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MotorPH_Main {
    public static void main(String[] args) {
        String employeeFile = "EmployeeDetails.csv";
        String attendanceFile = "AttendanceRecords.csv";
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to calculate payroll: ");
        String searchID = sc.nextLine();

        try {
            // 1. FIND THE EMPLOYEE'S RATE
            double hourlyRate = 0;
            String empName = "";
            BufferedReader brEmp = new BufferedReader(new FileReader(employeeFile));
            String line;
            brEmp.readLine(); // Skip the header (ID, LastName, etc.)
            
            while ((line = brEmp.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(searchID)) {
                    empName = data[2] + " " + data[1]; // FirstName + LastName
                    hourlyRate = Double.parseDouble(data[4]);
                    break;
                }
            }
            brEmp.close();

            // 2. FIND ATTENDANCE AND CALCULATE
            BufferedReader brAtt = new BufferedReader(new FileReader(attendanceFile));
            brAtt.readLine(); // Skip header
            
            System.out.println("\n--- Payroll Result ---");
            while ((line = brAtt.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(searchID)) {
                    String timeIn = data[2];
                    String timeOut = data[3];
                    
                    // CALLING YOUR SPECIALIST (PayrollEngine)
                    double hours = PayrollEngine.calculateHours(timeIn, timeOut);
                    double gross = PayrollEngine.calculateGrossPay(hours, hourlyRate);
                    
                    System.out.println("Employee: " + empName);
                    System.out.println("Date: " + data[1]);
                    System.out.println("Hours Worked: " + String.format("%.2f", hours));
                    System.out.println("Gross Pay: PHP " + String.format("%.2f", gross));
                }
            }
            brAtt.close();

        } catch (Exception e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
