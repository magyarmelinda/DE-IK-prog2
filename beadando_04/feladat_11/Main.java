/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_11;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Main {

    public static double jóKépességűek(Személy[] tömb) {
        int darab = 0, összeg = 0;

        for (Személy i : tömb)
            if (i instanceof Hallgató) {
                Hallgató h = (Hallgató) i;

                if (h.jóÁtlag()) {
                    darab++;
                    összeg += h.getÉletkor();
                }
            }

        return összeg / darab;
    }

    public static void main(String[] args) {
        Személy sz1 = new Személy("Mona Liza", 20, false);
        System.out.println(sz1);

        Scanner sc = new Scanner(System.in);
        Személy[] személyek = new Személy[4];

        for (int i = 0; i < 2; i++) {
            String[] token = sc.nextLine().split(" ");
            személyek[i] = new Hallgató(Double.parseDouble(token[3]), token[0], Integer.parseInt(token[1]),
                    token[2].equals("true"));
        }

        for (int i = 2; i < 4; i++) {
            String[] token = sc.nextLine().split(" ");
            személyek[i] = new Oktató(token[3], token[0], Integer.parseInt(token[1]), token[2].equals("true"));
        }
    }

}
