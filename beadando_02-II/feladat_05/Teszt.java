/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_05;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] token = sc.nextLine().split(" ");
        int n = Integer.parseInt(token[0]);
        String X = token[1];

        IzzasztóFeladat[] tomb = new IzzasztóFeladat[n];

        // Beolvasás
        for (int i = 0; i < n; i++) {
            token = sc.nextLine().split(":");
            tomb[i] = new IzzasztóFeladat(token[0], Integer.parseInt(token[1]));
        }

        // Rendezés
        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                // Név szerint - növekvő
                if (tomb[i].getHőmérséklet() == tomb[j].getHőmérséklet()) {
                    if (tomb[i].getTelepülésnév().compareTo(tomb[j].getTelepülésnév()) > 0) {
                        IzzasztóFeladat tmp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = tmp;
                    }
                }
                // Hömérséklet szerint - csökkenő
                else if (tomb[i].getHőmérséklet() > tomb[j].getHőmérséklet()) {
                    IzzasztóFeladat tmp = tomb[j];
                    tomb[j] = tomb[i];
                    tomb[i] = tmp;
                }
            }
        }

        // Kiíratás
        System.out.println("");

        int van = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i].getTelepülésnév().compareTo(X) == 0)
                van++;

            if (tomb[i].getTelepülésnév().equals(X))
                for (int j = i + 1; j < tomb.length; j++)
                    System.out.println(tomb[j].toString());
        }

        if (van == 0)
            System.out.println("Missing data");
    }

}
