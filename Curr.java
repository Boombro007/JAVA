import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Curr {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usformatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaformatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceformatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        Locale indiaLocale = new Locale("en","IN");
        NumberFormat indiaformatter = NumberFormat.getCurrencyInstance(indiaLocale);
        
        String us = usformatter.format(payment);
        String china = chinaformatter.format(payment);
        String france = franceformatter.format(payment); 
        String india = indiaformatter.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    } 
}