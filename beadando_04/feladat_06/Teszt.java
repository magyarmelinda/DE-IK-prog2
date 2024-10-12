/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_06;

import feladat_06.zh.Dolgozat;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hallgatok_szama = Integer.parseInt(sc.nextLine());

        Hallgato[] hallgatok = new Hallgato[hallgatok_szama];

        for (int i = 0; i < hallgatok_szama; i++) {
            String[] token = sc.nextLine().split(" ");
            hallgatok[i] = new Hallgato(Integer.parseInt(token[0]), token[1].equals("igaz"));
        }

        for (int i = 0; i < hallgatok_szama; i++) {
            Dolgozat d1 = hallgatok[i].dolgozatotIr();
            Dolgozat d2 = hallgatok[i].dolgozatotIr();

            // System.out.println(d1 + " " + d2);

            if (d1.megfelelt() && d2.megfelelt())
                System.out.println("megfelelt");
            else
                System.out.println("nem felelt meg");
        }
    }

}
