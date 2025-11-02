/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_gauchet;

import java.util.Random;
import java.util.Scanner;

/**
 * Ce programme consiste au fait qu'un nombre aléatoire est choisi, l’utilisateur doit le deviner
 * 02/11/25 
 * @author lisagauchet
 */
public class TP1_guessMyNumber_GAUCHET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("Bienvenue dans le jeu 'Guess My Number' !");
        System.out.println("Choisissez un mode de difficulté :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");

        int difficulte = sc.nextInt();
        int max = 100; // limite supérieure du nombre aléatoire
        int maxCoups = 0; // nombre maximal d’essais autorisés
        boolean aide = false; // messages d’aide supplémentaires ?
        // Configuration selon le mode choisi
        switch (difficulte) {
            case 1 -> {
                // Facile
                max = 50;
                maxCoups = 15;
                aide = true;
                System.out.println("Mode facile : nombre entre 0 et 50, 15 essais maximum.");
            }
            case 2 -> {
                // Normal
                max = 100;
                maxCoups = 10;
                System.out.println("Mode normal : nombre entre 0 et 100, 10 essais maximum.");
            }
            case 3 -> {
                // Difficile
                max = 200;
                maxCoups = 7;
                System.out.println("Mode difficile : nombre entre 0 et 200, 7 essais maximum.");
            }
            default -> {
                System.out.println("Choix invalide, mode normal par défaut.");
                max = 100;
                maxCoups = 10;
            }
        }

        // Génération du nombre mystère
        int nombreMystere = generateurAleat.nextInt(max + 1);

        // Pour tester le programme, tu peux afficher le nombre :
        // System.out.println("(DEBUG) Nombre mystère : " + nombreMystere);

        int tentative;
        int nbEssais = 0;
        boolean trouve = false;

        System.out.println("Devinez le nombre mystère entre 0 et " + max + " !");

        while (!trouve && nbEssais < maxCoups) {
            System.out.print("Entrez votre nombre : ");
            tentative = sc.nextInt();
            nbEssais++;

            if (tentative < nombreMystere) {
                if (aide && (nombreMystere - tentative > max / 4)) { // condition simplifiée
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (tentative > nombreMystere) {
                if (aide && (tentative - nombreMystere > max / 4)) { // condition simplifiée
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Vous avez trouvé le nombre mystère en " + nbEssais + " essais !");
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Vous avez épuisé vos " + maxCoups + " essais.");
            System.out.println("Le nombre mystère était : " + nombreMystere);
        }

        System.out.println("Fin du jeu !");
    }
}
    
    

