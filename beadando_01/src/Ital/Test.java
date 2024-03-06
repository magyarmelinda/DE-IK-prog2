/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ital;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Test {

    public static void main(String[] args) {
        Ital.setÁr(200);
        Ital i1 = new Ital("Cola", "5 dl");
        Ital i2 = new Ital("Cola", "10 dl");
        Ital i3 = new Ital("Cola", "5 dl");

        System.out.println(i1 + " " + i1.gyártásiDátum);
        System.out.println(i2);
        System.out.println(i3 + " " + Ital.getÁrEurópában(Ital.getÁr()));
        System.out.println("");
        System.out.println(i1.equals(i2));
        System.out.println(i2.equals(i3));
        System.out.println(i1.equals(i3));
    }
    
}
