public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

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
}