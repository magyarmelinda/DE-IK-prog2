/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_04;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Hullamvasutak[] tomb = new Hullamvasutak[n];

        // Adatok beolvasása
        for (int i = 0; i < n; i++) {
            String[] token = sc.nextLine().split(";");
            tomb[i] = new Hullamvasutak(token[0], token[1], Integer.parseInt(token[2]), Integer.parseInt(token[3]));
        }

        // Rendezés
        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                // Név szerint - növekvő
                if (tomb[i].getVárakozási_idő() == tomb[j].getVárakozási_idő()) {
                    if (tomb[i].getLegkisebb_magasság() == tomb[j].getLegkisebb_magasság()) {
                        if (tomb[i].getHullámvasút_neve().compareTo(tomb[j].getHullámvasút_neve()) > 0) {
                            Hullamvasutak tmp = tomb[i];
                            tomb[i] = tomb[j];
                            tomb[j] = tmp;
                        }
                    }
                }
                // Magasság szerint - növekvő
                else if (tomb[i].getVárakozási_idő() == tomb[j].getVárakozási_idő()) {
                    if (tomb[i].getLegkisebb_magasság() > tomb[j].getLegkisebb_magasság()) {
                        Hullamvasutak tmp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = tmp;
                    }
                }
                // Várakozási idő szerint - csökkenő
                else if (tomb[i].getVárakozási_idő() > tomb[j].getVárakozási_idő()) {
                    Hullamvasutak tmp = tomb[j];
                    tomb[j] = tomb[i];
                    tomb[i] = tmp;
                }
            }
        }

        // Kiíratás
        for (Hullamvasutak i : tomb)
            System.out.println(i.toString());
    }

}
