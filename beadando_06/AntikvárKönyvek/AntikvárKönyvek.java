/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package AntikvárKönyvek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Könyv implements Comparable<Könyv> {
    private String szerző;
    private String cím;
    private int kiadás;

    public Könyv(String szerző, String cím, int kiadás) {
        this.szerző = szerző;
        this.cím = cím;
        this.kiadás = kiadás;
    }

    public String getSzerző() {
        return szerző;
    }

    public String getCím() {
        return cím;
    }

    public int getKiadás() {
        return kiadás;
    }

    public void setKiadás(int kiadás) {
        this.kiadás = kiadás;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Könyv))
            return false;

        Könyv k = (Könyv) obj;

        return this.cím.equals(k.getCím()) && this.szerző.equals(k.getSzerző());
    }

    int szerzőkSzáma() {
        int darab = 0;

        if (this.szerző.equals(""))
            return -1;

        for (int i = 0; i < this.szerző.length(); i++)
            if (this.szerző.charAt(i) == ',')
                darab++;

        return darab;
    }

    @Override
    public int compareTo(Könyv k) {
        if (this.kiadás == k.getKiadás()) {
            if (this.szerzőkSzáma() == k.szerzőkSzáma())
                return this.cím.compareTo(k.getCím());

            return (-1) * Integer.compare(this.szerzőkSzáma(), k.szerzőkSzáma());
        }

        return Integer.compare(this.kiadás, k.getKiadás());
    }

    @Override
    public String toString() {
        if (this.szerző.equals(""))
            return this.cím + " (" + this.kiadás + ")";

        return this.szerző + ": " + this.cím + " (" + this.kiadás + ")";
    }

}

public class AntikvárKönyvek {

    public static void main(String[] args) {

        ArrayList<Könyv> lista = new ArrayList<>();

        try {
            Scanner input = new Scanner(new File(args[0]));

            while (input.hasNextLine()) {
                String[] token = input.nextLine().split(";");
                String szerzők = "";

                if (token.length > 2)
                    for (int i = 0; i < token.length - 2; i++) {
                        if (i == token.length - 3)
                            szerzők += token[i];
                        else
                            szerzők += token[i] + ", ";
                    }

                Könyv k = new Könyv(szerzők, token[token.length - 2], Integer.parseInt(token[token.length - 1]));

                if (lista.contains(k)) {
                    int index = lista.indexOf(k);

                    if (lista.get(index).getKiadás() > Integer.parseInt(token[token.length - 1]))
                        lista.get(index).setKiadás(Integer.parseInt(token[token.length - 1]));
                } else
                    lista.add(k);

            }

            Collections.sort(lista);
            for (Könyv i : lista)
                System.out.println(i);

            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
