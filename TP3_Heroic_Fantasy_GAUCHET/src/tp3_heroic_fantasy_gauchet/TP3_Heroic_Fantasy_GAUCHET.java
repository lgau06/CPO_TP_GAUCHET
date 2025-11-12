/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_gauchet;

/**
 *
 * @author lisagauchet
 */
public class TP3_Heroic_Fantasy_GAUCHET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee Epee1 = new Epee("Excalibur", 7, 5);
        Epee Epee2 = new Epee("Durandal", 4,7);
        
        baton baton1 = new baton("Chêne", 4, 5);
        baton baton2 = new baton("Charme", 5, 6);
        
        System.out.println(Epee1);
        System.out.println(Epee2);
        System.out.println(baton1);
        System.out.println(baton2);
    }
    
}
