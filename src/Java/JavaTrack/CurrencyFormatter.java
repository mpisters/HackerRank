package Java.JavaTrack;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String[] countries = {"US", "IN", "CN", "FR"};
        for (String country : countries) {
            Locale locale = new Locale("en", country);
            NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
            System.out.println(country+": " + " " + numberFormat.getCurrency() + numberFormat.format(payment));
        }

    }
}

