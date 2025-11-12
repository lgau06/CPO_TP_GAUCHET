/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_gauchet;

/**
 *
 * @author lisagauchet
 */
public abstract class armes {
    
    String nom;
    int niveauAttaque; 

    
    public armes(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque > 100) {
            this.niveauAttaque = 100; 
        } else if (niveauAttaque < 0) {
            this.niveauAttaque = 0; 
        } else {
            this.niveauAttaque = niveauAttaque;
        }
    }
    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    public String getNom() {
        return nom;
    }
    @Override
    public String toString() {
        return "Arme : " + nom + " | Niveau d'attaque : " + niveauAttaque;
    }
}
