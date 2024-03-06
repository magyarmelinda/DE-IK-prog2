/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_10;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teherautó extends Autó{
    private int teherbírás;

    public Teherautó(int teherbírás, String rendszám, int teljesítmény, boolean automata) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás = teherbírás;
    }

    @Override
    public String toString() {
       return this.getRendszám() + ";" + this.getTeljesítmény() + ";" + this.isAutomata() + ";" + this.teherbírás;
    }
}
