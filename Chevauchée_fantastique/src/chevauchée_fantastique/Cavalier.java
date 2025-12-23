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

    public Cavalier(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void deplacer(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public boolean deplacementValide(int newX, int newY) {
        int dx = Math.abs(x - newX);
        int dy = Math.abs(y - newY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
