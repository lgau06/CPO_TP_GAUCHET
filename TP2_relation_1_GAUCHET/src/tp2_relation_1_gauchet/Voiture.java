/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_gauchet;

/**
 *
 * @author lisagauchet
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire;  // Relation : une voiture appartient à une personne

    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null; // Au départ, pas de propriétaire
    }

    @Override
    public String toString() {
        return marque + " " + modele + " (" + puissanceCV + "CV)";
    }
}
