package Personnages;

import packageArmes.Epee;
import packageArmes.armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lisagauchet
 */
public class guerrier extends personnages {

    private boolean aCheval;
   
    public guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        int nbGuer = 0;
        nbGuer++;
    }
   
    public int nbArmesPredilection() {
        int c = 0;
        for (armes a : inventaire) if (a instanceof Epee) c++;
        return c;
    }
       
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    public boolean isACheval() {
        return aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + " | Guerrier (à cheval=" + aCheval + ")";
    }
   
    /**
     *
     * @param p
     */
    @Override
    public void attaquer(personnages p) {
        int degats;

        if (armeEnMain == null) {
            degats = 30;
        } else {
            degats = armeEnMain.getNiveauAttaque();

            if (armeEnMain instanceof Epee e) {
                degats *= e.getFinesse();
                seFatiguer();
            }
        }

        if (aCheval) degats /= 2;
        p.estAttaque(degats);
    }

    @Override
public boolean ajouterArme(armes a) {
    return super.ajouterArme(a); // Appelle la méthode de la classe parent
}
}

    