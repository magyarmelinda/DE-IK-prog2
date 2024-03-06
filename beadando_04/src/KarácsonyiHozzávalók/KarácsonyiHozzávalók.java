/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package KarácsonyiHozzávalók;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Hozzávalók implements Comparable<Hozzávalók>{
    private String név;
    private int mennyiség;

    public Hozzávalók(String név, int mennyiség) {
        this.név = név;
        this.mennyiség = mennyiség;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj == null || !(obj instanceof Hozzávalók))
           return false;
       
       Hozzávalók h = (Hozzávalók) obj;
       
       return this.név.equals(h.getNév());
    }

    @Override
    public int compareTo(Hozzávalók h) {
        if (this.getMennyiség() == h.getMennyiség())
            return this.név.compareTo(h.getNév());
        
        return (-1) * Integer.compare(this.mennyiség, h.getMennyiség());
    }

    @Override
    public String toString() {
        return this.név + ";" + this.mennyiség;
    }
}

public class KarácsonyiHozzávalók {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hozzávalók> lista = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            String[] token = sc.nextLine().split(";");
            Hozzávalók h = new Hozzávalók(token[0], Integer.parseInt(token[1]));
            
            if (lista.contains(h)) {
                int index = lista.indexOf(h); 
                lista.get(index).setMennyiség(lista.get(index).getMennyiség() + Integer.parseInt(token[1]));         
              
            } else lista.add(h);
        }
        
        Collections.sort(lista);
        for (Hozzávalók i : lista)
            System.out.println(i);
    }

}
