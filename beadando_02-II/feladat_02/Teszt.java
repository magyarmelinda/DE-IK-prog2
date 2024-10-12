/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_02;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] token = sc.nextLine().split(";");
        Fejesek2[] tomb = new Fejesek2[Integer.parseInt(token[0])];

        tomb[0] = new Fejesek2(token[1], "", "P");
        String X = token[2];

        // Tömb feltöltés
        for (int i = 1; i < tomb.length; i++) {
            token = sc.nextLine().split(";");
            tomb[i] = new Fejesek2(token[0], token[1], "");
        }

        // Rendezés
        for (int i = 1; i < tomb.length; i++) {
            int k = i;

            while (k < tomb.length) {
                if (tomb[k].getElőtte().equals(tomb[i - 1].getNév())) {
                    if (tomb[i - 1].getSapka().equals("P"))
                        tomb[k].setSapka("K");
                    else
                        tomb[k].setSapka("P");

                    Fejesek2 tmp = tomb[i];
                    tomb[i] = tomb[k];
                    tomb[k] = tmp;
                    break;
                }

                k++;
            }
        }

        int piros = 0;
        int kék = 0;

        // Kiíratás
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i].getNév().equals(X)) {
                System.out.println(piros + " " + kék);
                break;
            }

            if (i % 2 == 0)
                piros++;
            else
                kék++;
        }
    }

}
