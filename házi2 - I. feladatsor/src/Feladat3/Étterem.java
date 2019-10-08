/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Étterem extends VendéglátóipariEgység {

    private String[] étlap;

    public Étterem(String név, int férőhelyekSzáma, String[] étlap) {
        super(név, férőhelyekSzáma, false);

    }

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return "\u00c9tterem{" + "\u00e9tlap=" + étlap + '}';
    }

}
