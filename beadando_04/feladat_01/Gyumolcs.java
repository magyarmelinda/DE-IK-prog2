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

public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String f, String i) {
        this.fajta = f;
        this.iz = i;
    }

    public String milyenFajtaju() {
        return this.fajta;
    }

    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public String toString() {
        return "Gyumolcs{" + "fajta=" + this.fajta + ", iz=" + this.iz + '}';
    }
}
