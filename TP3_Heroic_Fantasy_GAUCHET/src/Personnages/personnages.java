package Personnages;

import java.util.ArrayList;
import packageArmes.armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lisagauchet
 */


public abstract class personnages implements EtreVivant {
    protected String nom;
    protected int niveauVie;
 
    protected ArrayList<armes> inventaire;
    protected armes armeEnMain;
   
    public static int nbPerso = 0;
   
    public personnages(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaire = new ArrayList<>();  // tableau dynamique vide au départ
        this.armeEnMain = null; // aucune arme équipée au début
        nbPerso++;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }
   
    // méthode pour ajouter une arme au personnage
    public boolean ajouterArme(armes a) {
        if (inventaire.size() >= 5) {
            System.out.println(nom + " ne peut pas avoir plus de 5 armes !");
            return false;
        }
        inventaire.add(a);
        System.out.println(a.getNom() + " ajoutée à l’inventaire de " + nom);
        return true;
    }
   
    // getter pour l’arme en main
    public armes getArmeEnMain() {
        return armeEnMain;
    }
    // méthode pour s’équiper d’une arme via son NOM
    public void equiperParNom(String nomArme) {

        for (armes a : inventaire) {
            if (a.getNom().equalsIgnoreCase(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " s’équipe de " + a.getNom());
                return;
            }
        }

        System.out.println(nom + " ne possède pas d’arme appelée " + nomArme);
    }
   
    public void seFatiguer() {
        this.niveauVie -= 10;
        System.out.println(nom + " se fatigue (-10 vie). Vie restante = " + niveauVie);
    }

    public boolean estVivant() {
        return this.niveauVie > 0;
    }

    public void estAttaque(int points) {
        this.niveauVie -= points;
        System.out.println(nom + " est attaqué : -" + points + " vie. Vie restante = " + niveauVie);
    }
   
     public abstract void attaquer(personnages p);
   
     @Override
    public String toString() {
        String armeTxt = (armeEnMain == null ? "Aucune arme équipée" : armeEnMain.toString());
        return nom + " (vie = " + niveauVie + ") | Arme en main : " + armeTxt +
        " | Inventaire : " + inventaire.size() + " arme(s)";
    }
}
