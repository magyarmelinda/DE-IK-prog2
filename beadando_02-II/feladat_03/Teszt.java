/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_03;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = 0;

        BudapestKupa1[] tomb = new BudapestKupa1[n];

        // Tömb feltöltés
        for (int i = 0; i < n; i++) {
            int ossztav = 0;
            String[] token = sc.nextLine().split(";");

            for (int j = 4; j < token.length; j++)
                ossztav += Integer.parseInt(token[j]);

            tomb[i] = new BudapestKupa1(Integer.parseInt(token[0]), Integer.parseInt(token[1]),
                    Integer.parseInt(token[2]), token[3], ossztav);
            if (ossztav > max)
                max = ossztav;
        }

        // Rendezés
        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                // Név szerint rendez - növekvő
                if (tomb[i].getÖssz_táv() == tomb[j].getÖssz_táv()) {
                    if (tomb[i].getTúra_neve().compareTo(tomb[j].getTúra_neve()) > 0) {
                        BudapestKupa1 tmp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = tmp;
                    }
                }
                // Össztáv szerint rendez - növekvő
                else if (tomb[i].getÖssz_táv() > tomb[j].getÖssz_táv()) {
                    BudapestKupa1 tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
            }
        }

        // Kiíratás
        System.out.println("");

        for (BudapestKupa1 i : tomb) {
            if (max == i.getÖssz_táv()) {
                if (i.getHónap() < 10)
                    System.out.print(i.getÉv() + ";" + "0" + i.getHónap() + ";");
                else
                    System.out.print(i.getÉv() + ";" + i.getHónap() + ";");

                if (i.getNap() < 10)
                    System.out.print("0" + i.getNap() + ";");
                else
                    System.out.print(i.getNap() + ";");

                System.out.println(i.getTúra_neve());
            }
        }
    }

}
