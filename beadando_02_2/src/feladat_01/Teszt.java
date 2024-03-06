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

public class Teszt {
    
    public static Katona megkuzd(Katona k1, Katona k2) {
        if (k1.getTámadóErő() > k2.getVédőErő()) 
            return k1;
        else if (k2.getTámadóErő() > k1.getVédőErő()) 
            return k2;
        
        return k1;
    }
    
    public static void main(String[] args) {
        Katona k1 = new Nyilas(10, 20, 30);
        Katona k2 = new Nyilas(30, 30, 10);
        Katona k3 = new Landzsas(50, 30);
        
        System.out.println("Életben maradt katona: " + "\n" + megkuzd(megkuzd(k1, k2), k3));
    }
    
}
