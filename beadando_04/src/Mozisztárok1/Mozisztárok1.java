/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Mozisztárok1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Film implements Comparable<Film>{
    private String név;
    private int év;

    public Film(String név, int év) {
        this.név = név;
        this.év = év;
    }

    public String getNév() {
        return név;
    }

    public int getÉv() {
        return év;
    }

    @Override
    public int compareTo(Film f) {
        if (this.év == f.getÉv())
            return this.név.compareTo(f.getNév());
        
        return Integer.compare(this.év, f.getÉv());
    }
}

class Színész implements Comparable<Színész>{
    private String név;
    private List<Film> filmek;

    public Színész(String név) {
        this.név = név;
        this.filmek = new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public List<Film> getFilmek() {
        return filmek;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj == null || ! (obj instanceof Színész))
           return false;
       
       Színész sz = (Színész) obj;
       
       return this.név.equals(sz.getNév());
    }

    @Override
    public int compareTo(Színész sz) {
        if (this.filmek.size() == sz.getFilmek().size())
            return this.név.compareTo(sz.getNév());
        
        return (-1) * Integer.compare(this.filmek.size(), sz.getFilmek().size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.név).append("\n");
        
        for (Film f : filmek)
            sb.append(f.getÉv()).append(": ").append(f.getNév()).append("\n");
        
        return sb.toString();
    }
}

public class Mozisztárok1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Színész> lista = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            String[] token = sc.nextLine().split(":");
            String[] adatok = token[0].split("[()]");
            String[] színészek = token[1].split(",");
            
            for (int i = 0; i < színészek.length; i++) {
                boolean volt = false;
                
                for (Színész sz : lista) 
                    if (sz.getNév().equals(színészek[i])) {
                        volt = true;
                        sz.getFilmek().add(new Film(adatok[0], Integer.parseInt(adatok[1])));
                    }
                
                if (!volt) {
                    Színész sz = new Színész(színészek[i]);
                    sz.getFilmek().add(new Film(adatok[0], Integer.parseInt(adatok[1])));
                    lista.add(sz);
                }
            }
        }
        
        Collections.sort(lista);
        for (Színész i : lista)
            Collections.sort(i.getFilmek());
        
        for (Színész i : lista)
            System.out.print(i);
    }

}
