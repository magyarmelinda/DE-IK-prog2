/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Osztálypénz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Tanuló implements Comparable<Tanuló> {
    private String név;
    private int összeg;

    public Tanuló(String név, int összeg) {
        this.név = név;
        this.összeg = összeg;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getÖsszeg() {
        return összeg;
    }

    public void setÖsszeg(int összeg) {
        this.összeg = összeg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Tanuló))
            return false;

        Tanuló t = (Tanuló) obj;

        return this.név.equals(t.getNév());
    }

    @Override
    public int compareTo(Tanuló t) {
        if (this.összeg == t.getÖsszeg())
            return this.név.compareTo(t.getNév());

        return (-1) * Integer.compare(this.összeg, t.getÖsszeg());
    }

    @Override
    public String toString() {
        return this.név + ";" + this.összeg;
    }
}

public class Osztálypénz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tanuló> lista = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] token = sc.nextLine().split(";");
            Tanuló t = new Tanuló(token[0], Integer.parseInt(token[1]));

            if (lista.contains(t)) {
                int index = lista.indexOf(t);
                lista.get(index).setÖsszeg(lista.get(index).getÖsszeg() + Integer.parseInt(token[1]));

            } else
                lista.add(t);

        }

        Collections.sort(lista);
        for (Tanuló i : lista)
            System.out.println(i);
    }

}
