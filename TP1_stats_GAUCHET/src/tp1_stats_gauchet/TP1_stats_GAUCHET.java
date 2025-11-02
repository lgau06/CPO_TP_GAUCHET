/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_gauchet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lisagauchet
 */
public class TP1_stats_GAUCHET {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int[] des = new int[6];
        int i;
        int m;
        int lancer;
        
       System.out.println("Veuillez saisir le nombre de lancer de des");
        Scanner sc = new Scanner (System.in);
        m=sc.nextInt();
        
        for(i=0;i<m;i=i+1) {
            Random generateurAleat=new Random();
            lancer=generateurAleat.nextInt(6);
            des[lancer]=des[lancer]+1;
                }
        
        for(i=0;i<des.length;i=i+1) {
            double pourcentage;
            pourcentage=((double)des[i]/m*100);
            System.out.println("Face" + (i+1) + " : " + des[i] + " = " + pourcentage + " % ");
        }
    }
}