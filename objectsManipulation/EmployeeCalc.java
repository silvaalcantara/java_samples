import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeCalc {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.printf("\nEmployee: %s, $ %.02f %n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.printf("\nUpdated data: %s, $ %.02f %n", employee.name, employee.netSalary());

        sc.close();
    }
    
}