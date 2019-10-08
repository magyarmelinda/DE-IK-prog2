/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Test {

    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1.5, 1);
        t.setColor("yellow");

        System.out.println("Terület: " + t.getArea());
        System.out.println("Kerület: " + t.getPerimeter());
        System.out.println("Szín: " + t.getColor());
        System.out.println("Kitöltött -e? " + t.isFilled());
    }
}
