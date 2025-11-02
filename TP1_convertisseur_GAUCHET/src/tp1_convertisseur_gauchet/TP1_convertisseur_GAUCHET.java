/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_gauchet;

import java.util.Scanner;

/**
 *
 * @author lisagauchet
 */
public class TP1_convertisseur_GAUCHET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisissez une temperature en degres:");
        double valeur = sc.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        int choix = sc.nextInt();
        double resultat = 0;

        if (choix == 1) {
            resultat = CelciusVersKelvin(valeur);
            System.out.println(valeur + " °C = " + resultat + " K");
        } else if (choix == 2) {
            resultat = KelvinVersCelcius(valeur);
            System.out.println(valeur + " K = " + resultat + " °C");
        } else if (choix == 3) {
            resultat = FarenheitVersCelcius(valeur);
            System.out.println(valeur + " °F = " + resultat + " °C");
        } else if (choix == 4) {
            resultat = CelciusVersFarenheit(valeur);
            System.out.println(valeur + " °C = " + resultat + " °F");
        } else if (choix == 5) {
            resultat = KelvinVersFarenheit(valeur);
            System.out.println(valeur + " K = " + resultat + " °F");
        } else if (choix == 6) {
            resultat = FarenheitVersKelvin(valeur);
            System.out.println(valeur + " °F = " + resultat + " K");
        } else {
            System.out.println("Choix invalide.");
        }

        System.out.println("Au revoir !");
    }
    
    public static double CelciusVersKelvin(double tCelcius) {
        double result = tCelcius + 273.15;
        return result;
    }

    public static double KelvinVersCelcius(double k) {
        double result = k - 273.15;
        return result;
    }

    public static double FarenheitVersCelcius(double f) {
        double result = (f - 32) * 5 / 9;
        return result;
    }

    public static double CelciusVersFarenheit(double c) {
        double result = (c * 9 / 5) + 32;
        return result;
    }

    public static double KelvinVersFarenheit(double k) {
        double c = KelvinVersCelcius(k);
        double result = CelciusVersFarenheit(c);
        return result;
    }

    public static double FarenheitVersKelvin(double f) {
        double c = FarenheitVersCelcius(f);
        double result = CelciusVersKelvin(c);
        return result;
    }
}