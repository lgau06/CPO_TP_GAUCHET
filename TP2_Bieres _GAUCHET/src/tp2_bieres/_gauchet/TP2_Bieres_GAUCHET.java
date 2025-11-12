/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres._gauchet;

/**
 *
 * @author lisagauchet
 */
public class TP2_Bieres_GAUCHET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls" , 7.0,"Dubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneSecondeBiere=new BouteilleBiere("Leffe",7.0,"Abbaye de Leffe");
        uneSecondeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere=new BouteilleBiere("Brume d’Aurore",6.6,"Tequila");
        troisiemeBiere.lireEtiquette();
        
        BouteilleBiere quatriemeBiere=new BouteilleBiere("Écume de Minuit", 4.2,"Vodka");
        quatriemeBiere.lireEtiquette();
        
        BouteilleBiere cinquiemeBiere =new BouteilleBiere("Houblon Vagabond", 2.4, "IPA");
        cinquiemeBiere.lireEtiquette();
        
        uneBiere.Decapsuler();
        System.out.println(uneBiere);
        System.out.println(uneSecondeBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(cinquiemeBiere);
    }
    
}
