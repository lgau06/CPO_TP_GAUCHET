/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_gauchet;

import packageArmes.baton;
import packageArmes.Epee;
import Personnages.guerrier;
import Personnages.magicien;
import Personnages.guerrier;
import Personnages.magicien;

/**
 *
 * @author lisagauchet
 */
public class TP3_Heroic_Fantasy_GAUCHET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        baton chene = new baton("Chêne", 4, 5);
        baton charme = new baton("Charme", 5, 6);

        System.out.println(excalibur);
        System.out.println(durandal);
        System.out.println(chene);
        System.out.println(charme);
       
       
        magicien gandalf = new magicien("Gandalf", 65, true);
        magicien garcimore = new magicien("Garcimore", 44, false);
        guerrier conan = new guerrier("Conan", 78, false);
        guerrier lannister = new guerrier("Lannister", 45, true);

        System.out.println(gandalf);
        System.out.println(garcimore);
        System.out.println(conan);
        System.out.println(lannister);
       
        // Je crée un magicien et un guerrier
        magicien gandalf2 = new magicien("Gandalf", 65, true);
        guerrier conan2 = new guerrier("Conan", 78, false);

        // Je crée quelques armes
        Epee excalibur2 = new Epee("Excalibur", 7, 5);
        Epee durandal2 = new Epee("Durandal", 4, 7);
        baton chene2 = new baton("Chêne", 4, 5);

       
        // Ajout d’armes
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(excalibur);

        conan.ajouterArme(durandal);

        // Equipement
        gandalf.equiperParNom("Chêne");
        conan.equiperParNom("Durandal");

        // Affichage final
        System.out.println(gandalf);
        System.out.println(conan);
       
       
        conan.seFatiguer();
        System.out.println("Conan vivant ? " + conan.estVivant());

        conan.attaquer(gandalf);
        System.out.println(gandalf);


        System.out.println("\n=== MORRRRTAL COMBAT ===");

        magicien novice = new magicien("Novice",50,false);
        guerrier chevalier = new guerrier("Chevalier",80,true);

        novice.ajouterArme(chene);
        novice.ajouterArme(durandal);
        novice.equiperParNom("Chêne");

        chevalier.ajouterArme(charme);
        chevalier.ajouterArme(excalibur);
        chevalier.equiperParNom("Excalibur");

        novice.attaquer(chevalier);
        System.out.println(chevalier);

        chevalier.attaquer(novice);
        System.out.println(novice);

        System.out.println("\nNovice vivant ? " + novice.estVivant());
        System.out.println("Chevalier vivant ? " + chevalier.estVivant());

        System.out.println("\n=== FIN TP3 ===");
    }  
}

    
    

