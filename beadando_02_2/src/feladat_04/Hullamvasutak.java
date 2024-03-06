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

public class Hullamvasutak {
    String hullámvasút_neve;
    String világ_neve;
    int legkisebb_magasság;
    int várakozási_idő;

    public Hullamvasutak(String hullámvasút_neve, String világ_neve, int legkisebb_magasság, int várakozási_idő) {
        this.hullámvasút_neve = hullámvasút_neve;
        this.világ_neve = világ_neve;
        this.legkisebb_magasság = legkisebb_magasság;
        this.várakozási_idő = várakozási_idő;
    }

    public String getHullámvasút_neve() {
        return hullámvasút_neve;
    }

    public void setHullámvasút_neve(String hullámvasút_neve) {
        this.hullámvasút_neve = hullámvasút_neve;
    }

    public String getVilág_neve() {
        return világ_neve;
    }

    public void setVilág_neve(String világ_neve) {
        this.világ_neve = világ_neve;
    }

    public int getLegkisebb_magasság() {
        return legkisebb_magasság;
    }

    public void setLegkisebb_magasság(int legkisebb_magasság) {
        this.legkisebb_magasság = legkisebb_magasság;
    }

    public int getVárakozási_idő() {
        return várakozási_idő;
    }

    public void setVárakozási_idő(int várakozási_idő) {
        this.várakozási_idő = várakozási_idő;
    }

    @Override
    public String toString() {
        return this.hullámvasút_neve + " (" + this.világ_neve + ") : " + this.várakozási_idő;
    }
}
