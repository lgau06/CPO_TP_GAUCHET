/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageArmes;

/**
 *
 * @author lisagauchet
 */
public class Epee extends armes {
    private final int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);  // OBLIGATOIRE
        this.finesse = finesse;
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + " | finesse = " + finesse;
    }
}

