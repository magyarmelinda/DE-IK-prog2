/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Mozisztárok2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Színész implements Comparable<Színész> {
    private String név;
    private int születésiév;

    public Színész(String név, int születésiév) {
        this.név = név;
        this.születésiév = születésiév;
    }

    public String getNév() {
        return név;
    }

    public int getSzületésiév() {
        return születésiév;
    }

    @Override
    public int compareTo(Színész sz) {
        if (this.születésiév == sz.születésiév)
            return this.név.compareTo(sz.getNév());

        return Integer.compare(this.születésiév, sz.getSzületésiév());
    }
}

class Film implements Comparable<Film> {
    private String cím;
    private List<Színész> színészek;

    public Film(String cím) {
        this.cím = cím;
        this.színészek = new ArrayList<>();
    }

    public String getCím() {
        return cím;
    }

    public List<Színész> getSzínészek() {
        return színészek;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Színész))
            return false;

        Film f = (Film) obj;

        return this.cím.equals(f.getCím());
    }

    @Override
    public int compareTo(Film f) {
        if (this.színészek.size() == f.getSzínészek().size())
            return this.cím.compareTo(f.getCím());

        return (-1) * Integer.compare(this.színészek.size(), f.getSzínészek().size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.cím).append("\n");

        for (Színész sz : színészek)
            sb.append(sz.getSzületésiév()).append(": ").append(sz.getNév()).append("\n");

        return sb.toString();
    }
}

public class Mozisztárok2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Film> lista = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] token = sc.nextLine().split(":");
            String[] adatok = token[0].split("[()]");
            String[] filmek = token[1].split(";");

            for (int i = 0; i < filmek.length; i++) {
                boolean van = false;

                for (Film f : lista)
                    if (f.getCím().equals(filmek[i])) {
                        f.getSzínészek().add(new Színész(adatok[0], Integer.parseInt(adatok[1])));
                        van = true;
                    }

                if (!van) {
                    Film f = new Film(filmek[i]);
                    f.getSzínészek().add(new Színész(adatok[0], Integer.parseInt(adatok[1])));
                    lista.add(f);
                }
            }
        }

        Collections.sort(lista);
        for (Film i : lista)
            Collections.sort(i.getSzínészek());

        for (Film i : lista)
            System.out.print(i);
    }

}
