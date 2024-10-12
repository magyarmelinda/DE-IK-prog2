/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_09;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Hátizsák implements Comparable<Hátizsák> {
    private String márka;
    private double űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public int compareTo(Hátizsák h) {
        if (this.márka.compareTo(h.getMárka()) == 0)
            return (-1) * Integer.compare(this.zsebekSzáma, h.getZsebekSzáma());

        return this.márka.compareTo(h.getMárka());
    }

    @Override
    public String toString() {
        return this.márka + " " + this.zsebekSzáma;
    }
}
