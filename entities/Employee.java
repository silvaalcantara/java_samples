package entities;

public class Employee {

    public int id;
    public String name;
    public double grossSalary;
    public double tax;

    public Employee(){}

    public Employee(int id, String name, double grossSalary){
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public int getId() {
        return this.id;
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double aditional = (percentage/100) * this.grossSalary;
        this.grossSalary = this.grossSalary + aditional;
    }

    public String toString() {
        return id + ", " + name + ", " + grossSalary;
    }
    
}