/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat10;

import java.util.List;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Autó implements Comparable<Autó>{
    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    private int példány_db;
    private List<String> extrák;

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        this.példány_db++;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public int getPéldány_db() {
        return példány_db;
    }

    public List<String> getExtrák() {
        return extrák;
    }

    public boolean isAutomata() {
        return automata;
    }
    
    public boolean isRendszám() {
        int szam = 0;
        char[] tomb = this.rendszám.toCharArray();
        
        if(this.rendszám.length() == 6)
            szam++;
        
        for (int i = 0; i < 3; i++) 
            if(Character.isLetter(tomb[i]))
               szam++;
               
        for (int i = 3; i < 6; i++) 
            if(Character.isDigit(tomb[i]))
                szam++;
        
        return szam == 7;
    }

    public void setExtrák(List<String> extrák) {
        this.extrák = extrák;
    }
    
    public void deleteExtrák(List<String> extrák) {
       this.extrák = null;
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Autó))
            return false;
        
        Autó a = (Autó) obj;
        
        return this.rendszám.equals(a.getRendszám());
    }  

    @Override
    public int compareTo(Autó a) {
        return Integer.compare(this.teljesítmény, a.getTeljesítmény());
    }
    
    @Override
    public String toString() {
        return this.rendszám + ";" + this.teljesítmény + ";" + this.automata;
    }

}
