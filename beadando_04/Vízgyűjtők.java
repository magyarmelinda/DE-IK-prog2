/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Vízgyűjtők;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Vízgyűjtő {
    private String név;
    private ArrayList<String> gyűjtők = new ArrayList<>();

    public Vízgyűjtő(String név) {
        this.név = név;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public ArrayList<String> getGyűjtők() {
        return gyűjtők;
    }

    public void setGyűjtők(ArrayList<String> gyűjtők) {
        this.gyűjtők = gyűjtők;
    }

    @Override
    public String toString() {
        return this.név + ": " + (this.gyűjtők.size() - 1);
    }

}

public class Vízgyűjtők {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> adatok = new ArrayList<>();
        ArrayList<Vízgyűjtő> lista = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            lista.add(new Vízgyűjtő(args[i]));

            // a listán belüli Gyűjtők listához is hozzáadom a Vízgyűjtőt
            lista.get(lista.size() - 1).getGyűjtők().add(args[i]);
        }

        while (sc.hasNextLine()) {
            adatok.add(sc.nextLine());
        }

        for (Vízgyűjtő i : lista) {
            boolean volt = false;

            while (!volt) {
                for (int j = 0; j < adatok.size(); j++) {
                    if (adatok.get(j).contains(";")) {
                        String[] token = adatok.get(j).split(";");

                        if (i.getGyűjtők().contains(token[1]) && !i.getGyűjtők().contains(token[0])) {
                            i.getGyűjtők().add(token[0]);
                            volt = true;
                            j = -1; // így mindig a legelejéről ellenőrzi a belső for ciklust
                        }
                    }
                }

                // ha a volt változó false marad
                // akkor lép ki, ha végigment a belső cikluson, de egyetlen elemet sem talált
                if (!volt)
                    break;
            }
        }

        for (Vízgyűjtő i : lista)
            System.out.println(i);
    }

}
