/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Mérlegelés;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */
class Cég implements Comparable<Cég>{
    private String cégnév;
    private String telephely;
    private int évek_száma;
    private int összes_árbevétel;

    public Cég(String cégnév, String telephely, int évek_száma, int összes_árbevétel) {
        this.cégnév = cégnév;
        this.telephely = telephely;
        this.évek_száma = évek_száma;
        this.összes_árbevétel = összes_árbevétel;
    }

    public String getCégnév() {
        return cégnév;
    }

    public String getTelephely() {
        return telephely;
    }

    public int getÉvek_száma() {
        return évek_száma;
    }

    public int getÖsszes_árbevétel() {
        return összes_árbevétel;
    }

    public void setÉvek_száma(int évek_száma) {
        this.évek_száma = évek_száma;
    }

    public void setÖsszes_árbevétel(int összes_árbevétel) {
        this.összes_árbevétel = összes_árbevétel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Cég))
            return false;
        
        Cég c = (Cég) obj;
        
        return this.cégnév.equals(c.cégnév) && this.telephely.equals(c.telephely);
    }

    @Override
    public int compareTo(Cég c) {
        if(this.összes_árbevétel == c.összes_árbevétel) {
            if(this.évek_száma == c.évek_száma) 
                return this.cégnév.compareTo(c.getCégnév());
            
            return Integer.compare(this.évek_száma, c.getÉvek_száma());
        }
        
        return (-1) * Integer.compare(this.összes_árbevétel, c.getÖsszes_árbevétel());
    }

    @Override
    public String toString() {
        return this.cégnév + " (" + this.telephely + "): " + this.összes_árbevétel;
    }
}

public class Mérlegelés {
    
    public static void main(String[] args) {
        
        ArrayList<Cég> lista = new ArrayList<Cég>();
        
        try {
            Scanner input = new Scanner(new File(args[0]));
            
            while(input.hasNextLine()) {
                String[] token = input.nextLine().split(":");
                Cég c = new Cég(token[0], token[1], 1, Integer.parseInt(token[3]));
                
                if(lista.contains(c)) {
                    int index = lista.indexOf(c);
                    
                    lista.get(index).setÉvek_száma(lista.get(index).getÉvek_száma() + 1);
                    lista.get(index).setÖsszes_árbevétel(lista.get(index).getÖsszes_árbevétel() + Integer.parseInt(token[3]));
                } else lista.add(c);   
            }
            
            Collections.sort(lista);
            
            for(Cég i : lista)
                System.out.println(i);
            
            
            input.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
