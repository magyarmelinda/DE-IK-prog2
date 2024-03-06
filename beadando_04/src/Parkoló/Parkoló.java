/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Parkoló;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Terület implements Comparable<Terület>{
    private String név;
    private int szabad;

    public Terület(String név, int szabad) {
        this.név = név;
        this.szabad = szabad;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getSzabad() {
        return szabad;
    }

    public void setSzabad(int szabad) {
        this.szabad = szabad;
    }

    @Override
    public int compareTo(Terület t) {
        if (this.szabad == t.getSzabad())
            return this.név.compareTo(t.getNév());
            
        return (-1) * Integer.compare(this.szabad, t.getSzabad());
    }

    @Override
    public String toString() {
        return this.név + ": " + this.szabad + " szabad hely";
    }
    
}

public class Parkoló {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Terület> lista = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            int darab = 0;
            String[] token = sc.nextLine().split(";");
            
            for (int i = 3; i < token.length; i++) 
                darab++;
            
            lista.add(new Terület(token[0], Integer.parseInt(token[2]) - darab));
        }
        
        Collections.sort(lista);
        for (Terület i : lista)
            if (i.getSzabad() > 3)
                System.out.println(i);
    }
    
}
