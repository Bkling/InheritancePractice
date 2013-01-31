package myabstract;

public class SalariedEmployee extends Employee {

    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String setEmpId(String EmpId) {
        return EmpId;
    }
}
