package Personnages;

import packageArmes.Epee;
import packageArmes.armes;
import packageArmes.baton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lisagauchet
 */
public class magicien extends personnages {

    private boolean confirme;
    public static int nbMag = 0;

    public magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMag++;
    }

    public int nbArmesPredilection() {
        int c = 0;
        for (armes a : inventaire) if (a instanceof baton) c++;
        return c;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }

    @Override
    public String toString() {
        return super.toString() + " | Magicien (confirmé=" + confirme + ")";
    }
   
    public void attaquer(personnages p) {
        int degats;

        if (armeEnMain == null) {
            degats = 20;
        } else {
            degats = armeEnMain.getNiveauAttaque();

            if (armeEnMain instanceof baton b) {
                degats *= b.getAge();
                seFatiguer();
            }
        }

        if (confirme) degats /= 2;

        p.estAttaque(degats);
    }

    public void ajouterArme(Epee durandal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void attaquer(Object p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
