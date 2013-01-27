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
        System.out.println("Hourly Wage: " + he.getWage());
        System.out.println("");


    }
}