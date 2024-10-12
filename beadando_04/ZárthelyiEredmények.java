/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package ZárthelyiEredmények;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Hallgató implements Comparable<Hallgató> {
    private String név;
    private int pontszám;

    public Hallgató(String név, int pontszám) {
        this.név = név;
        this.pontszám = pontszám;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPontszám() {
        return pontszám;
    }

    public void setPontszám(int pontszám) {
        this.pontszám = pontszám;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Hallgató))
            return false;

        Hallgató h = (Hallgató) obj;

        return this.név.equals(h.getNév());
    }

    @Override
    public int compareTo(Hallgató h) {
        if (this.pontszám == h.getPontszám())
            return this.név.compareTo(h.getNév());

        return (-1) * Integer.compare(this.pontszám, h.getPontszám());
    }

    @Override
    public String toString() {
        return this.név + ": " + this.pontszám + " pont";
    }

}

public class ZárthelyiEredmények {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hallgató> lista = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] token = sc.nextLine().split(";");
            Hallgató h = new Hallgató(token[0], Integer.parseInt(token[1]));

            if (lista.contains(h)) {
                int index = lista.indexOf(h);
                lista.get(index).setPontszám(lista.get(index).getPontszám() + Integer.parseInt(token[1]));
            } else
                lista.add(h);

        }

        Collections.sort(lista);
        for (Hallgató i : lista)
            System.out.println(i);
    }

}