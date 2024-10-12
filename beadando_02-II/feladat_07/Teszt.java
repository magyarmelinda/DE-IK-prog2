/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_07;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        AngolMagyarSzótár2[] tomb = new AngolMagyarSzótár2[n];

        // Beolvasás
        for (int i = 0; i < n; i++) {
            String[] token = sc.nextLine().split(":");
            tomb[i] = new AngolMagyarSzótár2(token[0], token[1]);
        }

        // Rendezés
        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                // Angol szavak szerint - növekvő
                if (tomb[i].getAngol_szó().compareTo(tomb[j].getAngol_szó()) > 0) {
                    AngolMagyarSzótár2 tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
                // Magyar szavak szerint - növekvő
                else if (tomb[i].getAngol_szó().compareTo(tomb[j].getAngol_szó()) == 0)
                    if (tomb[i].getMagyar_szó().compareTo(tomb[j].getMagyar_szó()) > 0) {
                        AngolMagyarSzótár2 tmp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = tmp;
                    }
            }
        }

        // Kiíratás
        System.out.println("");
        for (AngolMagyarSzótár2 i : tomb)
            System.out.println(i.toString());
    }

}
