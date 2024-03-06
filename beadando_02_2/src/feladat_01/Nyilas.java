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

public class Nyilas extends Katona {
    private int lőtáv;

    public Nyilas(int lőtáv, int támadóErő, int védőErő) {
        super(támadóErő, védőErő);
        this.lőtáv = lőtáv;
    }

    public int getLőtáv() {
        return this.lőtáv + super.getTámadóErő();
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Nyilas)) 
            return false;

        Nyilas ny = (Nyilas) obj;

        return ny.getTámadóErő() == this.getTámadóErő() && ny.getVédőErő() == this.getVédőErő() && ny.lőtáv == this.lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas: TE: [" + this.getTámadóErő() + "], VE: [" + this.getVédőErő() + "]";
    }
}
