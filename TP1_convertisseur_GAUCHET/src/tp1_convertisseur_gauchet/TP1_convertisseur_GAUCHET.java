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
        double nb1 = sc.nextDouble();
        double r = CelciusVersKelvin (nb1);
        System.out.print("Voice la temprature convertie en kelvin " + r + "K");
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
         double result= (tCelcius+273) ;
         return tCelcius;
    }
    
    public static double KelvinVersCelcius(double k){ 
        double result= (k-273);
    }
    public static double FarenheitVersCelcius()
    public static double CelciusVersFarenheit()
    public static double KelvinVersFarenheit()
    public static double FarenheitVersKelvin()