package myabstract;

public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double salaryBonus;

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }
    
}
