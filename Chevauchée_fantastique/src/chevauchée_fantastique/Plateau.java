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

    public Plateau(int taille) {
        this.taille = taille;
        cases = new Case[taille][taille];
    }

    public void initialiser(boolean[][] config) {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                cases[i][j] = new Case(config[i][j]);
            }
        }
    }

    public Case getCase(int x, int y) {
        return cases[x][y];
    }

    public boolean toutesEteintes() {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (cases[i][j].estAllumee()) return false;
            }
        }
        return true;
    }
}