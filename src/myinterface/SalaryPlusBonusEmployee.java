package myinterface;

public class SalaryPlusBonusEmployee extends SalariedEmployee implements Employee {

    private String firstName;
    private String lastName;
    private String name = firstName + lastName;

    @Override
    public String getFirstName(String firstName) {
        return firstName;
    }

    @Override
    public double getWage(double wage) {
        return wage;
    }
}
