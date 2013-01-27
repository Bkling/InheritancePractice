package myinterface;

public class Startup {

    public static void main(String[] args) {
        //This is the Hourly Class Employee
        HourlyEmployee he = new HourlyEmployee();
        he.setFirstName("Benjamin");
        he.setLastName("Kling");
        he.setSsn("123-455-6789");
        he.setAge(20);
        he.setWage(8.49);

        //Print out the information
        //**This is not how your should print it out**
        System.out.println("Hourly Employee");
        System.out.println("Full Name: " + he.getFirstName() + " " + he.getLastName());
        System.out.println("Age: " + he.getAge());
        System.out.println("SSN: " + he.getSsn());
        System.out.println("Hourly Wage: $" + he.getWage());
        System.out.println("");

        //This is the Salaried Class Employee\
        SalariedEmployee se = new SalariedEmployee();
        se.setFirstName("Brian");
        se.setLastName("Kling");
        se.setSsn("987-65-4321");
        se.setAge(51);
        se.setWage(40000);

        //Print out the information
        //**This is not how you should print it out**
        System.out.println("Salaried Employee");
        System.out.println("Full Name: " + se.getFirstName() + " " + se.getLastName());
        System.out.println("Age: " + se.getAge());
        System.out.println("SSN: " + se.getSsn());
        System.out.println("Salary: $" + se.getWage());
        System.out.println("");

        //This is the Salaried Plus Bonus Class Employee
        SalaryPlusBonusEmployee spbe = new SalaryPlusBonusEmployee();
        spbe.setName("Betsy Kling");
        spbe.setAge(25);
        spbe.setSsn("159-25-1793");
        spbe.setWage(5000);

        //Print out the information
        //**This is not how you should print it out**
        System.out.println("Full Name: " + spbe.getName());
        System.out.println("Age: " + spbe.getAge());
        System.out.println("SSN: " + spbe.getSsn());
        System.out.println("Salary Bonus: $" + spbe.getWage());

    }
}