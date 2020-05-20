import java.util.Locale;

public class FormatPrinting {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        
        System.out.printf("\n\nProducts: \nComputer, which price is $ %.2f\nOffice desk, wich price is $ %.2f", price1, price2);
        System.out.printf("\n\nRecord: %d years old, code %d and gender: %s\n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("\nRounded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f\n\n", measure);
    }
    
}