import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class RentOperation {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int numberOfRooms = sc.nextInt();
        Student rooms[] = new Student[10];

        for(int i = 0; i<numberOfRooms; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d%n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new Student(name, email);
        }

        System.out.println("Busy rooms: ");
        for(int i=0; i<rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.printf("%d: %s, %s %n", i, rooms[i].getName(), rooms[i].getEmail());
            }
        }

        sc.close();
    }

}