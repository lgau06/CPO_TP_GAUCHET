/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchée_fantastique;

/**
 *
 * @author lisagauchet
 */
public class Case {
    private boolean allumee;

    public Case(boolean allumee) {
        this.allumee = allumee;
    }

    public boolean estAllumee() {
        return allumee;
    }

    public void eteindre() {
        allumee = false;
    }
}