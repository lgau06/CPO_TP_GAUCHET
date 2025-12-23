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
        cavalier = new Cavalier(0, 0);
    }

    public void initialiser(boolean[][] config) {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                cases[i][j] = new Case(config[i][j]);
            }
        }
        cases[0][0].eteindre(); // case de départ
    }

    public int getTaille() {
        return taille;
    }

    public Case getCase(int x, int y) {
        return cases[x][y];
    }

    public Cavalier getCavalier() {
        return cavalier;
    }

    public boolean deplacementValide(int x, int y) {
        int dx = Math.abs(x - cavalier.getX());
        int dy = Math.abs(y - cavalier.getY());

        if (!((dx == 2 && dy == 1) || (dx == 1 && dy == 2))) {
            return false;
        }

        if (x < 0 || x >= taille || y < 0 || y >= taille) {
            return false;
        }

        return cases[x][y].estAllumee();
    }

    public void deplacerCavalier(int x, int y) {
        cavalier.deplacer(x, y);
        cases[x][y].eteindre();
    }

    public boolean victoire() {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (cases[i][j].estAllumee()) {
                    return false;
                }
            }
        }
        return true;
    }
}