import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentResult {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Grade one: 0 ... 30: ");
        student.firstGrade = sc.nextDouble();
        System.out.print("Grade two: 0 ... 35:  ");
        student.secondGrade = sc.nextDouble();;
        System.out.print("Grade three: 0 ... 35: ");
        student.thirdGrade = sc.nextDouble();;

        student.calcResult();

        sc.close();
    }
}