package Concrete;

public class Employee {
    //Properties of an Employee

    private String firstName;
    private String lastName;
    private String Ssn;
    private int age;
    private String hireDate;

    //Setters and the Getters for the Properties
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

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        //Validation Needed
        this.hireDate = hireDate;
    }
}
