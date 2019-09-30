/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ital;

import java.util.Date;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Ital {

    protected String név;
    protected String kiszerelés;
    private static int ár = 10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    @Override
    public boolean equals(Object other) {
        Ital obj = (Ital) other;

        return (this.név.equals(obj.név) && this.kiszerelés.equals(obj.kiszerelés) && (Ital.getÁr() == obj.getÁr()));
    }

    public static double getÁrEurópában(int ár) {
        return Ital.ár / 300.0;
    }

    @Override
    public String toString() {
        return this.név + ", " + this.kiszerelés + ", " + Ital.ár + " Ft";
    }

}
