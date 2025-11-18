/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_gauchet;

/**
 *
 * @author lisagauchet
 */
public class Convertisseur {
    int nbConversions;

    
    public Convertisseur() {
        nbConversions = 0;
    }

    
    public float CelciusVersKelvin(float tCelcius) {
        nbConversions++;
        return tCelcius + 273.15f;
    }

    public float KelvinVersCelcius(float tKelvin) {
        nbConversions++;
        return tKelvin - 273.15f;
    }

    public float FarenheitVersCelcius(float tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5 / 9;
    }

    public float CelciusVersFarenheit(float tCelcius) {
        nbConversions++;
        return (tCelcius * 9 / 5) + 32;
    }
    public float FarenheitVersKelvin(float tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5 / 9 + 273.15f;
    }

    public float KelvinVersFarenheit(float tKelvin) {
        nbConversions++;
        return (tKelvin - 273.15f) * 9 / 5 + 32;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
}


