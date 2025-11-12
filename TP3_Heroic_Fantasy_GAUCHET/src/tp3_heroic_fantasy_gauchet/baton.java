/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_gauchet;

/**
 *
 * @author lisagauchet
 */
public class baton extends armes {

    int age; // < 100

    public baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // initialisation des paramètres hérités
        if (age > 100) {
            this.age = 100;
        } else if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + " | Âge : " + age;
    }
}
