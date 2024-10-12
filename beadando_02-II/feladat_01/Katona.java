/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat01;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Katona {
    private int támadóErő;
    private int védőErő;

    public Katona() {
        this.támadóErő = 5;
        this.védőErő = 5;
    }

    public Katona(int támadóErő, int védőErő) {
        this.támadóErő = támadóErő;
        this.védőErő = védőErő;
    }

    public int getTámadóErő() {
        return támadóErő;
    }

    public void setTámadóErő(int támadóErő) {
        this.támadóErő = támadóErő;
    }

    public int getVédőErő() {
        return védőErő;
    }

    public void setVédőErő(int védőErő) {
        this.védőErő = védőErő;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Katona))
            return false;

        Katona k = (Katona) obj;

        return k.getTámadóErő() == this.támadóErő && k.getVédőErő() == this.védőErő;
    }

    @Override
    public String toString() {
        return "TE: [" + this.támadóErő + "], VE: [" + this.védőErő + "]";
    }
}
