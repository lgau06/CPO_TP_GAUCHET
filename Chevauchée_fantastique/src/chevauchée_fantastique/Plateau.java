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
    }

    // Initialisation du niveau
    public void initialiser(boolean[][] config) {

    // Création des cases
    for (int i = 0; i < taille; i++) {
        for (int j = 0; j < taille; j++) {
            cases[i][j] = new Case(config[i][j]);
        }
    }

    // 🔹 Trouver une case ALLUMÉE pour démarrer
    int startX = -1;
    int startY = -1;

    for (int i = 0; i < taille && startX == -1; i++) {
        for (int j = 0; j < taille; j++) {
            if (cases[i][j].estAllumee()) {
                startX = i;
                startY = j;
                break;
            }
        }
    }

    // Sécurité (au cas où)
    if (startX == -1) {
        throw new IllegalStateException("Aucune case allumée dans le niveau");
    }

    // Placement du cavalier
    cavalier = new Cavalier(startX, startY);

    // Éteindre la case de départ
    cases[startX][startY].eteindre();
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

    // 🔒 RÈGLE STRICTE DU SUJET
    public boolean deplacementValide(int x, int y) {

        int dx = Math.abs(x - cavalier.getX());
        int dy = Math.abs(y - cavalier.getY());

        // Déplacement en L
        if (!((dx == 2 && dy == 1) || (dx == 1 && dy == 2))) {
            return false;
        }

        // Dans le plateau
        if (x < 0 || x >= taille || y < 0 || y >= taille) {
            return false;
        }

        // ❗ INTERDIT si la case est déjà éteinte
        return cases[x][y].estAllumee();
    }

    // Déplacement du cavalier
    public void deplacerCavalier(int x, int y) {
        cavalier.deplacer(x, y);
        cases[x][y].eteindre();
    }

    // Condition de victoire
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