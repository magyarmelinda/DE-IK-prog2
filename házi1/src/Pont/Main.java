/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pont;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Main {

    public static void main(String[] args) {

        Pont p1 = new Pont(1, 4);
        Pont p2 = new Pont(2, 3);
        Pont p3 = new Pont(3, 2);
        Pont p4 = new Pont(4, 1);

        p1.setX(p1.getX() - 3.4);
        p1.setY(p1.getY() + 5);

        p2.setX(p2.getX() - 3.4);
        p2.setY(p2.getY() + 5);

        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " + p2.getY());

    }
}
