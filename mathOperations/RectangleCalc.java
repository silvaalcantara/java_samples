package mathOperations;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleCalc {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA: %.02f \n", rectangle.area());
        System.out.printf("PERIMETER: %.02f\n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.02f\n", rectangle.diagonal());

        sc.close();
    }

}