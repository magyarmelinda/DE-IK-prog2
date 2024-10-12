/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinearEquation;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Test {

    public static void main(String[] args) {
        LinearEquation le1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation le2 = new LinearEquation(2, 3, 4, 5, 6, 7);
        LinearEquation le3 = new LinearEquation(2, 1, 4, 2, 3, 3);

        System.out.println(le1.toString());
        System.out.println(le2.toString());
        System.out.println(le3.toString());
    }

}
