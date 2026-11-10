import java.time.LocalTime;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int startTime;
    private int endTime;

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) return hoursWorked;
        return 40;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) return hoursWorked - 40;
        return 0;
    }

    public void punchIn() {
        this.startTime = LocalTime.now().getHour();
    }

    public void punchOut() {
        endTime = LocalTime.now().getHour();
        hoursWorked += endTime - startTime;
    }
}