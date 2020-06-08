package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class EmployeeList {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employess will be registered? ");
        int numberOfEmployess = sc.nextInt();
        List<Employee> list = new ArrayList<>();

        for(int i=0; i<numberOfEmployess; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee temp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        if (temp != null) {
            System.out.print("\nEnter the percentage: ");
            double percentage = sc.nextDouble();
            temp.increaseSalary(percentage);
        } else System.out.println("This id does not exist!");

        list.set(list.indexOf(temp), temp);

        for(Employee x : list) {
            System.out.println(x);
        }

        sc.close();
    }
    
}