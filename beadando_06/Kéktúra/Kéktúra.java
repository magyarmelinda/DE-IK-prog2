/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Kéktúra;

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

class Túrázó {
    private String szakasz_egyik_vege;
    private String szakasz_masik_vege;

    public Túrázó(String szakasz_egyik_vege, String szakasz_masik_vege) {
        this.szakasz_egyik_vege = szakasz_egyik_vege;
        this.szakasz_masik_vege = szakasz_masik_vege;
    }

    public String getSzakasz_egyik_vege() {
        return szakasz_egyik_vege;
    }

    public String getSzakasz_masik_vege() {
        return szakasz_masik_vege;
    }
}

public class Kéktúra {

    public static void main(String[] args) {

        SortedMap<String, ArrayList<Túrázó>> map = new TreeMap<>();

        try {
            Scanner input = new Scanner(new File(args[0]));

            while (input.hasNextLine()) {
                String[] token = input.nextLine().split("[:-]");

                Túrázó t = new Túrázó(token[1], token[2]);

                if (map.containsKey(token[0]))
                    map.get(token[0]).add(t);
                else {
                    ArrayList<Túrázó> lista = new ArrayList<>();
                    lista.add(t);
                    map.put(token[0], lista);
                }
            }

            for (SortedMap.Entry e : map.entrySet()) {
                ArrayList<Túrázó> megtett_utak = (ArrayList<Túrázó>) e.getValue();

                int darab = 0;
                boolean összefüggő = false;

                for (int i = 0; i < megtett_utak.size(); i++)
                    for (int j = i + 1; j < megtett_utak.size(); j++)
                        if (megtett_utak.get(i).getSzakasz_egyik_vege()
                                .equals(megtett_utak.get(j).getSzakasz_masik_vege())
                                || megtett_utak.get(j).getSzakasz_egyik_vege()
                                        .equals(megtett_utak.get(i).getSzakasz_masik_vege())
                                || megtett_utak.get(i).getSzakasz_egyik_vege()
                                        .equals(megtett_utak.get(j).getSzakasz_egyik_vege())
                                || megtett_utak.get(i).getSzakasz_masik_vege()
                                        .equals(megtett_utak.get(j).getSzakasz_masik_vege()))
                            darab++;

                if (darab == megtett_utak.size() - 1)
                    összefüggő = true;
                else
                    összefüggő = false;

                if (összefüggő)
                    System.out.println(e.getKey());
            }

            input.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
