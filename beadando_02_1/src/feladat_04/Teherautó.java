/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_04;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teherautó extends Autó {
    private int maxSzállíthatóTeher;

    public Teherautó(String rendszám, int motorTeljesítmény, int maxSzállíthatóTeher) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Teherautó)) {
            return false;
        }

        Teherautó t = (Teherautó) obj;

        return t.maxSzállíthatóTeher == this.getMaxSzállíthatóTeher();
    }

    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "maxSz\u00e1ll\u00edthat\u00f3Teher=" + maxSzállíthatóTeher + '}';
    }
}
