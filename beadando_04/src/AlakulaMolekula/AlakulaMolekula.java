/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package AlakulaMolekula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Vegyjel implements Comparable<Vegyjel>{
    private String vegyjel;
    private String elemnév;
    private int darab;

    public Vegyjel(String vegyjel, String elemnév, int darab) {
        this.vegyjel = vegyjel;
        this.elemnév = elemnév;
        this.darab = darab;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public String getElemnév() {
        return elemnév;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vegyjel))
            return false;
        
        Vegyjel v = (Vegyjel) obj;
        
        return this.vegyjel.equals(v.getVegyjel());
    }    

    @Override
    public int compareTo(Vegyjel v) {
        if (this.darab == v.getDarab())
            return this.elemnév.compareTo(v.getElemnév());
        
        return (-1) * Integer.compare(this.darab, v.getDarab());
    }
}

class Molekula implements Comparable<Molekula>{
    private String molekulanév;
    List<Vegyjel> atomok;

    public Molekula(String molekulanév) {
        this.molekulanév = molekulanév;
        this.atomok = new ArrayList<>();
    }

    public String getMolekulanév() {
        return molekulanév;
    }

    public List<Vegyjel> getAtomok() {
        return atomok;
    }

    @Override
    public int compareTo(Molekula m) {
        return this.molekulanév.compareTo(m.getMolekulanév());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.molekulanév).append(":").append("\n");
        
        for (Vegyjel i : atomok)
            sb.append(i.getDarab()).append(" ").append(i.getElemnév()).append("\n");
        
        return sb.toString();
    }

}

public class AlakulaMolekula {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Molekula> lista = new ArrayList<>();
        List<Vegyjel> mentett = new ArrayList<>();
        
        String sor = "";
        while (!(sor = sc.nextLine()).equals("-")) {
            String[] token = sor.split(":");
            mentett.add(new Vegyjel(token[0], token[1], 0));  
        }
        
        while (sc.hasNextLine()) {
           String[] token = sc.nextLine().split(":");
           String[] tmp = token[1].split(",");
           lista.add(new Molekula(token[0]));
           
            for (int i = 0; i < tmp.length; i++) {
                boolean van = false;
                int idx = lista.size() - 1;
                
                for (int j = 0; j < lista.get(idx).atomok.size(); j++) 
                    if (lista.get(idx).atomok.get(j).getVegyjel().equals(tmp[i])) {
                        lista.get(idx).atomok.get(j).setDarab(lista.get(idx).atomok.get(j).getDarab() + 1);
                        van = true;
                        break;
                    }
                
                
                if (!van) 
                    for (int j = 0; j < mentett.size(); j++) 
                        if (mentett.get(j).getVegyjel().equals(tmp[i])) {
                            lista.get(idx).atomok.add(new Vegyjel(mentett.get(j).getVegyjel(), mentett.get(j).getElemnév(), 1));
                            break;
                        }
            }
        }
        
        Collections.sort(lista);
        for (Molekula i : lista)
            Collections.sort(i.getAtomok());
        
        for (Molekula i : lista) {
            System.out.print(i);
        }
    }
}
