/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Oroszlánüvöltés;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda
 */
public class Oroszlánüvöltés {
    
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        
        try {
            Scanner input = new Scanner(new File(args[0]));
            
            while(input.hasNextLine()) {
                String sor = input.nextLine();
                
                if(sor.equals("END")) {
                    
                    int oroszlán = 0;
                    char[][] tömb = new char[lista.size()][lista.get(0).length()];
                    
                    for (int i = 0; i < lista.size(); i++) 
                        for (int j = 0; j < lista.get(i).length(); j++) 
                            tömb[i][j] = lista.get(i).charAt(j);
                        
                    for (int j = 0; j < lista.get(0).length(); j++) {
                        if(tömb[0][j] == 'O') {
                            int darab = 1;
                            for (int i = 1; i < lista.size(); i++) 
                                if(tömb[i][j] == 'O')
                                    darab++;

                            if(darab == lista.size()) 
                                oroszlán++;
                        }
                    }
                    
                    System.out.println(oroszlán);
                    lista = new ArrayList<>();

                } else {
                    String[] token = sor.split(":");
                    lista.add(token[1]);
                }
            }
            
            input.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
