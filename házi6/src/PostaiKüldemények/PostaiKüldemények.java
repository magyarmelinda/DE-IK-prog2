/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package PostaiKüldemények;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Magyar Melinda
 */
class Küldemény implements Comparable<Küldemény>{
    private String címzett_neve;
    private int irányítószám;
    private String település;
    private String utca;
    private int házszám;
    private int csomag_értéke;

    public Küldemény(String címzett_neve, int irányítószám, String település, String utca, int házszám, int csomag_értéke) {
        this.címzett_neve = címzett_neve;
        this.irányítószám = irányítószám;
        this.település = település;
        this.utca = utca;
        this.házszám = házszám;
        this.csomag_értéke = csomag_értéke;
    }

    public String getCímzett_neve() {
        return címzett_neve;
    }

    public int getIrányítószám() {
        return irányítószám;
    }

    public String getTelepülés() {
        return település;
    }

    public String getUtca() {
        return utca;
    }

    public int getHázszám() {
        return házszám;
    }

    public int getCsomag_értéke() {
        return csomag_értéke;
    }

    @Override
    public int compareTo(Küldemény k) {
        if(this.település.compareTo(k.getTelepülés()) == 0) {
            if(this.utca.compareTo(k.getUtca()) == 0) {
                if(this.házszám == k.házszám) {
                    if(this.címzett_neve.compareTo(k.getCímzett_neve()) == 0) 
                        return (-1) * Integer.compare(this.csomag_értéke, k.getCsomag_értéke());
                    
                    return this.címzett_neve.compareTo(k.getCímzett_neve());
                }
                
                return (-1) * Integer.compare(this.házszám, k.getHázszám());
            }
            
            return this.utca.compareTo(k.getUtca());
        }
        
        
        return this.település.compareTo(k.getTelepülés());
    }

    @Override
    public String toString() {
        return this.település + ", " + this.utca + " " + this.házszám + "., " + this.címzett_neve + ", " + this.csomag_értéke + " Ft";
    }

}

public class PostaiKüldemények {
    
    public static void main(String[] args) {
        
        SortedMap<Integer, ArrayList<Küldemény>> map = new TreeMap<>();
        
        try {
            Scanner input = new Scanner(new File(args[0]));
            
            while(input.hasNextLine()) {
                String[] token = input.nextLine().split(":");
                
                Küldemény k = new Küldemény(token[0], Integer.parseInt(token[1]), token[2], token[3], Integer.parseInt(token[4]), Integer.parseInt(token[5]));
                
                if(map.containsKey(Integer.parseInt(token[1])))
                    map.get(Integer.parseInt(token[1])).add(k);
                else {
                    ArrayList<Küldemény> lista = new ArrayList<>();
                    lista.add(k);
                    map.put(Integer.parseInt(token[1]), lista);
                }
            }
            
            for(SortedMap.Entry i : map.entrySet()) {
                int összesen = 0;
                
                for(Küldemény k : (ArrayList<Küldemény>)i.getValue()) 
                    összesen += k.getCsomag_értéke();
                
                System.out.println(i.getKey() + ": " + összesen + " Ft");
                
                ArrayList<Küldemény> csomag = (ArrayList<Küldemény>)i.getValue();
                Collections.sort(csomag);
                
                for(Küldemény j : csomag)
                    System.out.println(j);
            }
            
            input.close();
          
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
