import java.util.Locale;
import java.util.Scanner;

public class ScannerUsage {

    public static void main(String[] args) {
        
        // Para aceitar com ponto
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        String xy;
        int y;
        double z;

        System.out.println("Enter a string value: ");
        x = sc.next();

        System.out.println("Enter a int value: ");
        y = sc.nextInt();

        System.out.println("Enter a float value: ");
        z = sc.nextDouble();

        System.out.println("Type a text and then press Enter: ");
        sc.nextLine(); // Necessário para nao consumir o proximo next line em vão
        xy = sc.nextLine();

        System.out.println("\n\nString: " + x);
        System.out.println("Int: " + y);
        System.out.printf("Float: %.2f%n", z);
        System.out.println("Text: " + xy);

        sc.close();
    }
    
}