/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{

    private double alkoholTartalom;

    public ErjedtGyumolcs(String f, String i, double a) {
        super(f, i);
        this.alkoholTartalom = a;
    }

    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkoholTartalom=" + this.alkoholTartalom + '}';
    }
}
