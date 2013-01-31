package myabstract;

public class Startup {
    
    public static void main(String[] args) {
        //This is the Hourly Employee class
        HourlyEmployee he = new HourlyEmployee();
        he.setFirstName("Benjamin");
        he.setLastName("Kling");
        he.setSsn("123-45-6789");
        he.setAge(20);
        he.setWage(8.49);


        //Print out the Information
        //**This is not how you should print it out, you should use a loop**
        System.out.println("Hourly Employee");
        System.out.println("Full Name: " + he.getFirstName() + " " + he.getLastName());
        System.out.println("Age: " + he.getAge());
        System.out.println("SSN: " + he.getSsn());
        System.out.println("Hourly Wage: $" + he.getWage());
        System.out.println("Employee ID: " + he.setEmpId("6321"));
        System.out.println("");

        //This is the Salaried Employee class
        SalariedEmployee se = new SalariedEmployee();
        se.setFirstName("Brian Kling");
        se.setLastName("Kling");
        se.setSsn("987-65-4321");
        se.setAge(51);
        se.setSalary(48000);

        //Print out the Information
        //**This is not how you should print it out, you should use a loop**
        System.out.println("Salaried Employee");
        System.out.println("Full Name: " + se.getFirstName() + " " + se.getLastName());
        System.out.println("Age: " + se.getAge());
        System.out.println("SSN: " + se.getSsn());
        System.out.println("Salary: $" + se.getSalary());
        System.out.println("Employee ID: " + se.setEmpId("9512"));
        System.out.println("");

        //This is the Salaried Bonus Employee class
        SalaryPlusBonusEmployee spbe = new SalaryPlusBonusEmployee();
        spbe.setFirstName("Betsy");
        spbe.setLastName("Kling");
        spbe.setSsn("159-25-7931");
        spbe.setAge(25);
        spbe.setSalary(50000);
        spbe.setSalaryBonus(5000);

        //Print out the Information
        //**This is not how you should print it out, you should use a loop**
        System.out.println("Full Name: " + spbe.getFirstName() + " " + spbe.getLastName());
        System.out.println("Age: " + spbe.getAge());
        System.out.println("SSN: " + spbe.getSsn());
        System.out.println("Salary: $" + spbe.getSalary());
        System.out.println("Salary Bonus: $" + spbe.getSalaryBonus());
        System.out.println("");
    }
}
