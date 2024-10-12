/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_03;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class BudapestKupa1 {
    int év;
    int hónap;
    int nap;
    String túra_neve;
    int össz_táv;

    public BudapestKupa1(int év, int hónap, int nap, String túra_neve, int össz_táv) {
        this.év = év;
        this.hónap = hónap;
        this.nap = nap;
        this.túra_neve = túra_neve;
        this.össz_táv = össz_táv;
    }

    public int getÉv() {
        return év;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public int getHónap() {
        return hónap;
    }

    public void setHónap(int hónap) {
        this.hónap = hónap;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public String getTúra_neve() {
        return túra_neve;
    }

    public void setTúra_neve(String túra_neve) {
        this.túra_neve = túra_neve;
    }

    public int getÖssz_táv() {
        return össz_táv;
    }

    public void setÖssz_táv(int össz_táv) {
        this.össz_táv = össz_táv;
    }

    @Override
    public String toString() {
        return "BudapestKupa1{" + "\u00e9v=" + év + ", h\u00f3nap=" + hónap + ", nap=" + nap + ", t\u00fara_neve="
                + túra_neve + ", \u00f6ssz_t\u00e1v=" + össz_táv + '}';
    }
}
