/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ital;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Dolgozat {
    public static SzeszesItal[] alkoholTaralom(Ital[] tomb) {
        int szamlalo = 0;
        for (Ital i : tomb)
            if (i instanceof SzeszesItal)
                szamlalo++;

        if (szamlalo < 3)
            return null;

        SzeszesItal[] tmp = new SzeszesItal[3];
        szamlalo = 0;

        for (Ital i : tomb)
            if (i instanceof SzeszesItal) {
                SzeszesItal sz = (SzeszesItal) i;
                tmp[szamlalo++] = sz;
            }

        return tmp;
    }
}
