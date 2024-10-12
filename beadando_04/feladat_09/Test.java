/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Test {

    public static void kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(
            List<Hátizsák> list) {
        Collections.sort(list);

        for (Hátizsák i : list)
            System.out.println(i);
    }

    public static void main(String[] args) {
        List<Hátizsák> hátizsákok = new ArrayList<>();

        hátizsákok.add(new Hátizsák("Vans", 2, 3, true));
        hátizsákok.add(new Hátizsák("Budmil", 3, 5, true));
        hátizsákok.add(new Hátizsák("Nike", 3, 3, true));
        hátizsákok.add(new Hátizsák("Adidas", 2, 5, true));
        hátizsákok.add(new Hátizsák("Puma", 2, 6, true));
        hátizsákok.add(new Hátizsák("Puma", 2, 3, true));
        hátizsákok.add(new Hátizsák("The North Face", 5, 5, true));
        hátizsákok.add(new Hátizsák("Herschel", 30, 8, true));
        hátizsákok.add(new Hátizsák("Converse", 5, 1, true));
        hátizsákok.add(new Hátizsák("Adidas", 10, 6, true));

        kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(hátizsákok);
    }

}
