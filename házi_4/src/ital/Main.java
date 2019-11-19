/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Arrays;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Main {
    
    public static void main(String[] args) {
        Ital[] tomb = new Ital[5];
        
        tomb[0] = new Ital("Coca-Cola", "0.5 l", 150);
        tomb[1] = new SzeszesItal(62, "Tatratea", " 0.7 l", 7800);
        tomb[2] = new Ital("Sprite", "0.5 l", 246);
        tomb[3] = new SzeszesItal(38, "Szatmári Ágyas", "0.5 l", 5000);
        tomb[4] = new SzeszesItal(11.5, "Kékfrankos", "0.7 l", 1500);
        
        SzeszesItal[] sz = Dolgozat.alkoholTaralom(tomb);
        
        System.out.println("Három legmagasabb alkoholtartalmú ital");
        for(SzeszesItal i : sz)
            System.out.println(i);
        
        Arrays.sort(sz);
        
        System.out.println("");
        System.out.println("Rendezett tömb");
        for(SzeszesItal i : sz)
            System.out.println(i);
    }
}
