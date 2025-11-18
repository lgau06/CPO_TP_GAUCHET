/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_gauchet;

/**
 *
 * @author lisagauchet
 */
public class TP2_relation_1_GAUCHET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création de personnes
        Personne bob = new Personne("Sixkiller", "Bobby");
        Personne reno = new Personne("Raines", "Reno");

        // Affichage initial
        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        // Relations
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);

        // Vérification
        System.out.println("\nVoitures de " + bob + " :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(" - " + bob.liste_voitures[i]);
        }

        System.out.println("\nVoitures de " + reno + " :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(" - " + reno.liste_voitures[i]);
        }

        // Test d’ajout impossible
        System.out.println("\nTentative d’ajout d’une voiture déjà possédée :");
        reno.ajouter_voiture(uneClio);
    }
}
    
    

