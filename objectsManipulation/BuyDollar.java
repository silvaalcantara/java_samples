import java.util.Locale;
import java.util.Scanner;
import util.Dollar;

public class BuyDollar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price, amount;
    
        System.out.print("What  is the dollar price? ");
        price = sc.nextDouble();  
        
        System.out.print("How many dollars will be bought? ");
        amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.02f%n", Dollar.valueInReais(price, amount));

        sc.close();
    }

}