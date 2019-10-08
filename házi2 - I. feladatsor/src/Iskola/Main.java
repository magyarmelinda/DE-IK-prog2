/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Main {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String nap = sc.nextLine();
       int oraszam = Integer.parseInt(sc.nextLine());
       Ora[] adatok = new Ora[oraszam];
       
        System.out.println("Óra neve;Óra kezdete;Óra kódja");
        for (int i = 0; i < oraszam; i++) {
            String[] token = sc.nextLine().split(";");
            adatok[i] = new Ora(Integer.parseInt(token[2]), token[0], Integer.parseInt(token[1]));
        }
       
       Orarend tomb = new Orarend(nap);
       
        System.out.println("");
        for (Ora i : adatok) 
            System.out.println(tomb.oratHozzaad(i));
        
        tomb.kiír(); 
    }
}
