package myconcrete;

public class Startup {

    public static void main(String[] args) {
        //This is the Hourly Employee class
        HourlyEmployee he = new HourlyEmployee();
        he.setFirstName("Benjamin");
        he.setLastName("Kling");
        he.setSsn("123-45-6789");
        he.setAge(20);
        he.setHireDate("07/22/2011");


        //Print out the Information
        //**This is not how you should print it out, you should use a loop**
        System.out.println("Hourly Employee");
        System.out.println("Full Name: " + he.getFirstName() + " " + he.getLastName());
        System.out.println("Age: " + he.getAge());
        System.out.println("SSN: " + he.getSsn());
        System.out.println("Hire Date: " + he.getHireDate());
        System.out.println("Hourly Wage: $" + he.setHourlyWage(8.49));
        System.out.println("");

        //This is the Salaried Employee class
        SalariedEmployee se = new SalariedEmployee();
        se.setFirstName("Brian Kling");
        se.setLastName("Kling");
        se.setSsn("987-65-4321");
        se.setAge(51);
        se.setHireDate("04/15/1972");

        //Print out the Information
        //**This is not how you should print it out, you should use a loop**
        System.out.println("Salaried Employee");
        System.out.println("Full Name: " + se.getFirstName() + " " + se.getLastName());
        System.out.println("Age: " + se.getAge());
        System.out.println("SSN: " + se.getSsn());
        System.out.println("Hire Date: " + se.getHireDate());
        System.out.println("Salary: $" + se.setSalary(48000));
        System.out.println("");

        //This is the Salaried Bonus Employee class
        SalaryPlusBonusEmployee spbe = new SalaryPlusBonusEmployee();
        spbe.setFirstName("Betsy");
        spbe.setLastName("Kling");
        spbe.setSsn("159-25-7931");
        spbe.setAge(25);
        spbe.setHireDate("06/25/2012");

        //Print out the Information
        //**This is not how you should print it out, you should use a loop**
        System.out.println("Full Name: " + spbe.getFirstName() + " " + spbe.getLastName());
        System.out.println("Age: " + spbe.getAge());
        System.out.println("SSN: " + spbe.getSsn());
        System.out.println("Hire Date: " + spbe.getHireDate());
        System.out.println("Salary Bonus: $" + spbe.setBonus(5000));
        System.out.println("");


    }
}
