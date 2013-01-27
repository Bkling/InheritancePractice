package myinterface;

public class SalariedEmployee implements Employee {

    private String firstName;
    private String lastName;
    private String Ssn;
    private int age;
    private double wage;
    private String name = firstName + lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //Validation Needed
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //Validation Needed
        this.lastName = lastName;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String Ssn) {
        //Validation Needed
        this.Ssn = Ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //Validation Needed
        this.age = age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFirstName(String firstName) {
        return firstName;
    }

    @Override
    public double getWage(double wage) {
        return wage;
    }
}
