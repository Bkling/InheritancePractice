package myconcrete;

public class HourlyEmployee extends Employee {
    //Give the Hourly Employee the properites of the Employee invisibly

    //This is just a method just for Hourly Employees
    public double setHourlyWage(double wage) {
        return wage;
    }

    public double setHoursWorked(double hours) {
        return hours;
    }
}
