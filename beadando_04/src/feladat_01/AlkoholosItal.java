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

public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String i, double a) {
        this.iz = i;
        this.alkoholTartalom = a;
    }
    
    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }
    
    @Override
    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + "iz=" + iz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
}
