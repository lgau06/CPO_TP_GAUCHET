/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchée_fantastique;

/**
 *
 * @author lisagauchet
 */
public class Cavalier {

    private int x;
    private int y;

    // Position initiale
    public Cavalier(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Déplacement du cavalier
    public void deplacer(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Règle du cavalier aux échecs (déplacement en L)
    public boolean deplacementValide(int newX, int newY) {
        int dx = Math.abs(newX - x);
        int dy = Math.abs(newY - y);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}