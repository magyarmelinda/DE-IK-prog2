/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iskola;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Orarend {
    private String milyenNap;
    private int órákSzáma;
    private Ora[] tömb;

    public Orarend(String milyenNap) {
        this.milyenNap = milyenNap;
        this.órákSzáma = 0;
        this.tömb = new Ora[12];
    }

    public String getMilyenNap() {
        return milyenNap;
    }

    public void setMilyenNap(String milyenNap) {
        this.milyenNap = milyenNap;
    }

    public int getÓrákSzáma() {
        return órákSzáma;
    }

    public void setÓrákSzáma(int órákSzáma) {
        this.órákSzáma = órákSzáma;
    }

    public Ora[] getTömb() {
        return tömb;
    }

    public void setTömb(Ora[] tömb) {
        this.tömb = tömb;
    }

    public boolean oratHozzaad(Ora o) {
        if (this.órákSzáma >= 12) {
            return false;
        } else {
            for (int i = 0; i < this.órákSzáma; i++)
                if (this.tömb[i].getÓraKezdete() == o.getÓraKezdete()) {
                    return false;
                }
        }

        this.tömb[this.órákSzáma++] = o;

        return true;
    }

    @Override
    public String toString() {
        return this.milyenNap + ", órák száma: " + this.órákSzáma;
    }

    public void kiír() {
        System.out.println("");
        System.out.println(this.toString());
        System.out.println("Tanórák:");
        for (int i = 0; i < this.órákSzáma; i++) {
            System.out.println(this.tömb[i]);
        }
    }
}
