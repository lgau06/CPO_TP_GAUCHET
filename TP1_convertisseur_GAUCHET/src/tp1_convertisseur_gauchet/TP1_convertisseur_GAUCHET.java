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
        System.out.print("Voice la temprature convertie en kelvin " + (nb1+273) + "K");
    }
    
}
