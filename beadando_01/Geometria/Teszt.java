/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        RegularPoligon rp1 = new RegularPoligon();
        RegularPoligon rp2 = new RegularPoligon(6, 4);
        RegularPoligon rp3 = new RegularPoligon(10, 4, 5.6, 7.8);

        System.out.println("R1 " + rp1);
        System.out.println("R2 " + rp2);
        System.out.println("R3 " + rp3);
    }

}
