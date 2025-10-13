public class Employee {
    private int employeeNumber;
    private double payRate;

    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        else
            this.employeeNumber = employeeNumber;

        if (payRate > MAX_RATE)
            this.payRate = MAX_RATE;
        else
            this.payRate = payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        if (hoursWorked <= 40)
            return hoursWorked * payRate;
        else
            return 40 * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * payRate * OVERTIME_MULTIPLIER;
        else
            return 0.0;
    }
}
