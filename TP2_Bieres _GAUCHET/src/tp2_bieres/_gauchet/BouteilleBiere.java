/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres._gauchet;

/**
 *
 * @author lisagauchet
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte !");
            return false;
        }
    }
public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }   
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; // Par défaut la bière est non ouverte
    }
@Override
    public String toString() {
        String chaine_a_retourner = nom + " (" + degreAlcool + " degrés) - Ouverte ? ";
        if (ouverte) chaine_a_retourner += "oui";
        else chaine_a_retourner += "non";
        return chaine_a_retourner;
    }
}
