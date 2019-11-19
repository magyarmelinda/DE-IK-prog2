/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Bor extends AlkoholosItal {

    private String szoloFajta;
    private String termoTerulet;

    public Bor(String sz, String t, String i, double a) {
        super(i, a);
        this.szoloFajta = sz;
        this.termoTerulet = t;
    }

    public String milyenSzolobolKeszult() {
        return this.szoloFajta;
    }

    @Override
    public String mibolKeszult() {
        return this.szoloFajta;
    }

    public String holTermett() {
        return this.termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + this.szoloFajta + ", termoTerulet=" + this.termoTerulet + '}';
    }


}
