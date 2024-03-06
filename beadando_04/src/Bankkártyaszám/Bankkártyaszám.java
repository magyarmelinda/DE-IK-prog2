/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Bankkártyaszám;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Bankkártyaszám {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            int osszeg = 0;
            char[] kártyaSzám = sc.nextLine().toCharArray();
            
            for (int i = 0; i < kártyaSzám.length; i += 2) {
                int tmp = Character.getNumericValue(kártyaSzám[i]) * 2;
                
                if (tmp >= 10) {
                    tmp -= 9; 
                    kártyaSzám[i] = Integer.toString(tmp).charAt(0);
                } else kártyaSzám[i] = Integer.toString(tmp).charAt(0);
            }
            
            for (int i = 0; i < kártyaSzám.length; i++) 
                osszeg += Character.getNumericValue(kártyaSzám[i]);
            
            if (osszeg % 10 == 0)
                System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
    
}
