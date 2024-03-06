/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package TéliFagyi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Fagylalt {
    private String íz;
    private int ár;

    public Fagylalt(String íz, int ár) {
        this.íz = íz;
        this.ár = ár;
    }

    public String getÍz() {
        return íz;
    }

    public int getÁr() {
        return ár;
    }
}

public class TéliFagyi {
    
    public static void main(String[] args) {
        int rendelések = 0, összeg = 0;
        ArrayList<Fagylalt> bemenet = new ArrayList<>();
        SortedMap<String, ArrayList<String>> map = new TreeMap<>();
        
        try {
            Scanner input = new Scanner(new File(args[0]));
            Scanner sc = new Scanner(System.in);
            
            while (input.hasNextLine()) {
                String[] token = input.nextLine().split("[;,]");
                ArrayList<String> ízek = new ArrayList<>();
                
                for (int i = 1; i < token.length; i++) 
                    ízek.add(token[i]);
                
                map.put(token[0], ízek);
            }
            
            while (sc.hasNextLine()) {
                String[] token = sc.nextLine().split(";");
                bemenet.add(new Fagylalt(token[0], Integer.parseInt(token[1])));
            }
            
            for (SortedMap.Entry e : map.entrySet()) {
                ArrayList<String> kérések = (ArrayList<String>)e.getValue();
                
                int ízek = 0, ár = 0;
                for (int i = 0; i < bemenet.size(); i++) 
                    if (kérések.contains(bemenet.get(i).getÍz())) 
                        for (int j = 0; j < kérések.size(); j++) 
                            if (kérések.get(j).equals(bemenet.get(i).getÍz())) {
                                ízek++;
                                ár += bemenet.get(i).getÁr();
                            }
               
                if (ízek == kérések.size()){
                    rendelések++;
                    összeg += ár;
                }          
            }
            
            System.out.println(rendelések + " rendeles");
            System.out.println(összeg + " Ft");
            
            input.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
