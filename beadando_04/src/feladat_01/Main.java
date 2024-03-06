/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_01;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Main {
   
    public static Aszu[] otPuttonyos(Bor[] tomb) {
        int szamlalo = 0;
        
        for (Bor i : tomb) {
            if (i instanceof Aszu) {
                Aszu a = (Aszu) i;
                if (a.hanyPuttonyos() == 5)
                    szamlalo++;
            }
        }  
        
        Aszu[] aszu = new Aszu[szamlalo];
        szamlalo = 0;
        
        for (Bor i : tomb) {
            if (i instanceof Aszu) {
                Aszu a = (Aszu) i;
                
                if (a.hanyPuttonyos() == 5)
                    aszu[szamlalo++] = a;
            }
        }
        
        return aszu;
    }
    
    public static void main(String[] args) {
        Bor[] b = new Bor[4];
        
        b[0] = new Bor("Kékszőlő", "Villány", "édes", 7.5); // szőlő fajta, termő terület, íz, alkohol tartalom
        b[1] = new Aszu(3, "Aszú", "Badacsony", "édes", 8.9); // puttony szám, szőlő fajta, termő terület, íz, alkohol tartalom
        b[2] = new Bor("Hárslevelű", "Eger", "száraz", 9.3);
        b[3] = new Aszu(5, "Aszú", "Tokaj", "édes", 7.5);
        
        
        Aszu[] a = otPuttonyos(b);
        
        for (Aszu i : a) 
            System.out.println(i);
    }
    
}
