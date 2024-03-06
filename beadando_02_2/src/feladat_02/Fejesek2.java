/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_02;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Fejesek2 {
    String név;
    String előtte;
    String sapka;

    public Fejesek2(String név, String előtte, String sapka) {
        this.név = név;
        this.előtte = előtte;
        this.sapka = sapka;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getElőtte() {
        return előtte;
    }

    public void setElőtte(String előtte) {
        this.előtte = előtte;
    }

    public String getSapka() {
        return sapka;
    }

    public void setSapka(String sapka) {
        this.sapka = sapka;
    }

    @Override
    public String toString() {
        return "Fejesek2{" + "n\u00e9v=" + név + ", el\u0151tte=" + előtte + ", sapka=" + sapka + '}';
    }
}
