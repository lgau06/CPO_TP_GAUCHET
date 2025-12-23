/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchée_fantastique;

/**
 *
 * @author lisagauchet
 */
public class Plateau {
    private Case[][] cases;
    private int taille;
    private Cavalier cavalier;

    public Plateau(int taille) {
        this.taille = taille;
        cases = new Case[taille][taille];
        cavalier = new Cavalier(0, 0); // position initiale
    }

    public void initialiser(boolean[][] config) {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                cases[i][j] = new Case(config[i][j]);
            }
        }
        // Eteindre la case de départ
        if (cases[0][0].estAllumee()) {
            cases[0][0].eteindre();
        }
    }

    public int getTaille() { return taille; }
    public Case getCase(int x, int y) { return cases[x][y]; }
    public Cavalier getCavalier() { return cavalier; }

    public boolean deplacementValide(int x, int y) {
        if (x < 0 || y < 0 || x >= taille || y >= taille) return false;
        if (!cavalier.deplacementValide(x, y)) return false;
        if (!cases[x][y].estAllumee()) return false; // ne pas revenir sur une case éteinte
        return true;
    }

    public void deplacerCavalier(int x, int y) {
        cavalier.deplacer(x, y);
        cases[x][y].eteindre();
    }

    public boolean victoire() { return toutesEteintes(); }

    private boolean toutesEteintes() {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (cases[i][j].estAllumee()) return false;
            }
        }
        return true;
    }
}