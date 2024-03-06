/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_06;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Teszt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        MásfélMillióLépés[] tomb = new MásfélMillióLépés[n];

        // Beolvasás
        for (int i = 0; i < n; i++) {
            int orszagos = 0;
            int helyi = 0;
            String[] token = sc.nextLine().split(";");

            for (int j = 0; j < token[1].length(); j++) {
                if (token[1].charAt(j) == 'K') {
                    orszagos++;
                } else if (token[1].charAt(j) == 'P' || token[1].charAt(j) == 'S' || token[1].charAt(j) == 'Z') {
                    helyi++;
                }
            }

            tomb[i] = new MásfélMillióLépés(token[0], orszagos, helyi);
        }

        // Rendezés
        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                // Országos szerint - csökkenő
                if (tomb[i].getOrszagos() < tomb[j].getOrszagos()) {
                    MásfélMillióLépés tmp = tomb[j];
                    tomb[j] = tomb[i];
                    tomb[i] = tmp;
                } // Helyi szerint - csökkenő
                else if (tomb[i].getOrszagos() == tomb[j].getOrszagos()) {
                    if (tomb[i].getHelyi() < tomb[j].getHelyi()) {
                        MásfélMillióLépés tmp = tomb[j];
                        tomb[j] = tomb[i];
                        tomb[i] = tmp;
                    }
                }
                // Név szerint - növekvő
                if (tomb[i].getOrszagos() == tomb[j].getOrszagos()) 
                    if (tomb[i].getHelyi() == tomb[j].getHelyi()) 
                        if (tomb[i].getTurista_neve().compareTo(tomb[j].getTurista_neve()) > 0) {
                            MásfélMillióLépés tmp = tomb[i];
                            tomb[i] = tomb[j];
                            tomb[j] = tmp;
                        }
            }
            // Kiíratás
            System.out.println("");
            for (MásfélMillióLépés k : tomb) {
                System.out.println(k.toString());
            }
        }
    }
    
}
