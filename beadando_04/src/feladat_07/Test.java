/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Test {
    public static List<Lakóház> tágasLakóházak(List<Lakóház> list, double térfogat) {
        List<Lakóház> megoldás = new ArrayList<>();
        
        for (Lakóház i : list) {
            if (i.légköbméret() > térfogat)
                megoldás.add(i);
        }
        
        return megoldás;
    }

    public static void main(String[] args) {
        List<Lakóház> lh = new ArrayList<>();
        
        lh.add(new Lakóház("István út 23. I/25.", 10, 500));
        lh.add(new Lakóház("Angyalföld tér 30. III/40.", 10, 200));
        lh.add(new Lakóház("Kassai út 30. II/3.", 5, 100));
        lh.add(new Lakóház("Derék utca 66. III/1.", 10, 250));
        lh.add(new Lakóház("Angyalföld tér 31. IV/50.", 10, 200));
        lh.add(new Lakóház("Derék utca 95. VI/4.", 10, 350));
        lh.add(new Lakóház("Darabos utca 3.", 4, 350));
        lh.add(new Lakóház("Mikszáth Kálmán utca 40. IV/5.", 4, 300));
        lh.add(new Lakóház("Csapó utca 23. I/20.", 10, 400));
        lh.add(new Lakóház("István út 21. I/23.", 10, 450));
        
        tágasLakóházak(lh, 1000);
        Collections.sort(lh);
        
        for (Lakóház i : lh) 
            System.out.println(i);    
    }
}
