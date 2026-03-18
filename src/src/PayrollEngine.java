import java.time.LocalTime;
import java.time.Duration;

public class PayrollEngine {

    /**
     * Method to calculate hours worked between two time strings (e.g., "08:00" and "17:05")
     */
    public static double calculateHours(String timeIn, String timeOut) {
        LocalTime start = LocalTime.parse(timeIn);
        LocalTime end = LocalTime.parse(timeOut);
        
        // Calculate duration between the two times
        Duration duration = Duration.between(start, end);
        
        // Convert to decimal hours (e.g., 8 hours 30 mins becomes 8.5)
        // We subtract 1 hour for the standard unpaid lunch break
        double totalHours = duration.toMinutes() / 60.0;
        return totalHours - 1.0; 
    }

    /**
     * Method to calculate Gross Pay
     */
    public static double calculateGrossPay(double hours, double rate) {
        return hours * rate;
    }
}
