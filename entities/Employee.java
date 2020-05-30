package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double aditional = (percentage/100) * this.grossSalary;
        this.grossSalary = this.grossSalary + aditional;
    }
    
}