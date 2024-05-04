package currencyFormat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        double payment= 12324.134;
//        double payment = scanner.nextDouble();
//        scanner.close();
        // Format pour les États-Unis
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // Format pour l'Inde
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        // String india = indiaFormat.format(payment);
//        String india = "Rs." + indiaFormat.format(payment).substring(1); // Supprimer le symbole de devise par défaut
        String india = "Rs." + usFormat.format(payment).substring(1); // Supprimer le symbole de devise par défaut

        // Format pour la Chine
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // Format pour la France
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
