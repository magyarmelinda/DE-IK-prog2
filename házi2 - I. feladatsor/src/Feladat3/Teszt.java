/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

import java.util.ArrayList;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Teszt {
    
    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] t) {
        ArrayList<Kocsma> tomb = new ArrayList<>();

        for (VendéglátóipariEgység i : t) {
            if (i.isDohányzó()) {
                String[] sörlap = ((Kocsma) i).getSörlap();
                for (String j : sörlap) 
                    if (j.contains(ital)) 
                        tomb.add((Kocsma) i);
            }
        }
        
        return tomb.toArray(new Kocsma[tomb.size()]);
    }

    public static void main(String[] args) {
        VendéglátóipariEgység[] tomb = new VendéglátóipariEgység[10];

        tomb[0] = new Kocsma("Füredi Söröző", 30, new String[]{"Arany Ászok", "Pécsi Sör", "Borsodi"});
        tomb[1] = new Kocsma("Jobbszélső Söröző", 20, new String[]{"Borsodi", "Kőbányai", "Arany Ászok"});
        tomb[2] = new Kocsma("Jobbszélső Söröző", 20, new String[]{"Borsodi", "Soproni", "Rákóczi"});
        tomb[3] = new Kocsma("Jobbszélső Söröző", 20, new String[]{"Borsodi", "Pécsi Sör", "Kőbányai"});
        tomb[4] = new Kocsma("Jobbszélső Söröző", 20, new String[]{"Borsodi", "Balatoni Világos", "Soproni"});
        tomb[5] = new Étterem("Almavirág Étterem", 20, new String[]{"Paprikás krumpli", "Tárkonyos leves", "Gesztenyepüré"});
        tomb[6] = new Étterem("Pálma Étterem", 30, new String[]{"Aranygaluska", "Tokány", "Halászlé"});
        tomb[7] = new Étterem("Posta Vendéglő", 40, new String[]{"Francia krémes", "Jókai-bableves", "Rakott karfiol"});
        tomb[8] = new Étterem("Belga Étterem", 50, new String[]{"Meggyleves", "Aranygaluska", "Paprikás csirke"});
        tomb[9] = new Étterem("Csokonai Étterem", 60, new String[]{"Gulyás leves", "Töltött káposzta", "Madártej"});

        
        Kocsma[] t =  adottItaltKínálóKocsmák("Pécsi Sör", tomb);
        
        for(Kocsma i : t) 
            System.out.println(i.toString());
 
    }
}
