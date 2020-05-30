package util;

public class Dollar {

    public static double valueInReais(double price, double amount) {
        double IOF = amount * 0.06;
        return price * (amount + IOF);
    }

}