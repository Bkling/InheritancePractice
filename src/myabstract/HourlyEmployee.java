package myabstract;

public class HourlyEmployee extends Employee {

    private String firstName;
    private String lastName;
    private String Ssn;
    private int age;
    private double wage;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String Ssn) {
        this.Ssn = Ssn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public void getWage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getAge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
