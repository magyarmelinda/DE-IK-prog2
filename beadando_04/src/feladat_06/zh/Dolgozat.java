/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_06.zh;

import feladat_06.egyetem.Pontozhato;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Dolgozat implements Pontozhato{
    private double pontszam;

    public Dolgozat(double pontszam) {
        this.pontszam = pontszam;
    }

    public double getPontszam() {
        return pontszam;
    }

    public void setPontszam(double pontszam) {
        this.pontszam = pontszam;
    }
    
    @Override
    public boolean megfelelt() {
        if (this.pontszam < 0) {
            System.out.println("Nem írt");
            return false;
        }
            
        return this.pontszam > 35;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + this.pontszam + '}';
    }
}
