/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat6;

import Feladat6.zh.Dolgozat;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Hallgato {
    public int mennyitKeszult;
    public boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    
    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }
    
    public Dolgozat dolgozatotIr() {
        Dolgozat d;
        int pontszam = 0;
        int szam = (int) (Math.random() * 101);
        
        if(szam < 2) 
            d = new Dolgozat(-1);
        else {
            if(this.sokatTanul) 
                pontszam = ((int) (3 + Math.random() * 8)) * this.mennyitKeszult;
            else 
                pontszam = ((int) (Math.random() * 6)) * this.mennyitKeszult;
        
            d = new Dolgozat(pontszam);
        }
        
        return d;
    }

}
