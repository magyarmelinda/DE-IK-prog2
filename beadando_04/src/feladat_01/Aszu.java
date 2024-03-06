/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_01;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Aszu extends Bor {
    private int puttonySzam;

    public Aszu(int puttonySzam, String sz, String t, String i, double a) {
        super(sz, t, i, a);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos() {
        return this.puttonySzam;
    }

    @Override
    public String toString() {
        return this.milyenSzolobolKeszult() + ", " + this.holTermett() + ", " + this.hanyPuttonyos() + " puttonyos";
    }
}
