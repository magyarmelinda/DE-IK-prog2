/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Main {
    
    public static List<Teherautó> húszTonna(Autó[] tömb) {
        List<Teherautó> megoldás = new ArrayList<>();
        
        for (Autó i : tömb)
            if (i instanceof Teherautó) {
                Teherautó t = (Teherautó) i;

                if (t.getTeljesítmény() > 20)
                    megoldás.add(t);
            }
        
        return megoldás;
    }
    
    public static void legnagyobbTeljesítményű (List<Autó> lista) {
        Collections.sort(lista);
        
        if (lista.size() < 3)  
            for (Autó i : lista)
                System.out.println(i);
        else 
            for (int i = 0; i < 3; i++) 
                System.out.println(lista.get(i));           
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autó a1 = new Autó(sc.nextLine(), 100, true);
        System.out.println(a1);
        
        Autó[] autók = new Autó[4];
        
        for (int i = 0; i < 2; i++) {
            String[] token = sc.nextLine().split(" ");
            autók[i] = new Autó(token[0], Integer.parseInt(token[1]), token[2].equals("true"));
        }
        
        for (int i = 2; i < 4; i++) {
            String[] token = sc.nextLine().split(" ");
            autók[i] = new Teherautó(Integer.parseInt(token[3]), token[0], Integer.parseInt(token[1]), token[2].equals("true"));
        }
    }
    
}
