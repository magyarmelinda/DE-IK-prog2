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
public class SzeszesItal extends Ital{
    protected double alkoholTartalom;

    public SzeszesItal(double alkoholTartalom, String név, String kiszerelés, int ár) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom = alkoholTartalom;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    public void setAlkoholTartalom(double alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }
    
    @Override
    public String toString() {
        return this.alkoholTartalom + "% alkoholtartalmú " + this.getNév() + ", " + this.getKiszerelés() + ", " + this.getÁr() + " Ft";
    }
    
}
