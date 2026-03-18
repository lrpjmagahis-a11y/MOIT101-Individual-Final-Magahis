import java.util.Scanner;

public class MotorPH_Main {
    public static void main(String[] args) {
        // Sample Admin Credentials
        String adminUser = "admin_magahis";
        String adminPass = "p@ssword123";

        System.out.println("========================================");
        System.out.println("     MOTORPH PAYROLL SYSTEM (SOLO)      ");
        System.out.println("========================================");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUser = sc.nextLine();
        System.out.print("Password: ");
        String inputPass = sc.nextLine();

        if(inputUser.equals(adminUser) && inputPass.equals(adminPass)) {
            System.out.println("\nLogin Successful! Loading 25 Employee Records...");
            // Next step: Code for CSV loading
        } else {
            System.out.println("Access Denied.");
        }
    }
}
