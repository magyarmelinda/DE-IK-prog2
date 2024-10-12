/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Parancssoros teszteléshez kommenteld ki a package-t.
package Jégkorongmérkőzések;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

class Csapat implements Comparable<Csapat> {
    private String csapatnév;
    private int pontszám;
    private int gólszám;

    public Csapat(String csapatnév, int pontszám, int gólszám) {
        this.csapatnév = csapatnév;
        this.pontszám = pontszám;
        this.gólszám = gólszám;
    }

    public String getCsapatnév() {
        return csapatnév;
    }

    public int getPontszám() {
        return pontszám;
    }

    public void setPontszám(int pontszám) {
        this.pontszám = pontszám;
    }

    public int getGólszám() {
        return gólszám;
    }

    public void setGólszám(int gólszám) {
        this.gólszám = gólszám;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Csapat))
            return false;

        Csapat cs = (Csapat) obj;

        return this.csapatnév.equals(cs.getCsapatnév());
    }

    @Override
    public int compareTo(Csapat cs) {
        if (this.pontszám == cs.getPontszám()) {
            if (this.gólszám == cs.getGólszám())
                return this.csapatnév.compareTo(cs.getCsapatnév());

            return (-1) * Integer.compare(this.gólszám, cs.getGólszám());
        }

        return (-1) * Integer.compare(this.pontszám, cs.getPontszám());
    }

    @Override
    public String toString() {
        return this.csapatnév + ": " + this.pontszám + " points (" + this.gólszám + " scored goals)";
    }

}

public class Jégkorongmérkőzések {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Csapat> lista = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] token = sc.nextLine().split(":");
            String[] csapatok = token[0].split("-");
            String[] meccsek = token[1].split(",");

            int Agól = 0, Apont = 0;
            int Bgól = 0, Bpont = 0;

            for (int i = 0; i < meccsek.length; i++) {
                Agól += Integer.parseInt(String.valueOf(meccsek[i].charAt(0)));
                Bgól += Integer.parseInt(String.valueOf(meccsek[i].charAt(2)));

                if (meccsek.length <= 3) {
                    if (Agól > Bgól) {
                        Apont = 3;
                        Bpont = 0;
                    } else {
                        Apont = 0;
                        Bpont = 3;
                    }
                } else {
                    if (Agól > Bgól) {
                        Apont = 2;
                        Bpont = 1;
                    } else {
                        Apont = 1;
                        Bpont = 2;
                    }
                }
            }

            Csapat cs1 = new Csapat(csapatok[0], Apont, Agól);
            Csapat cs2 = new Csapat(csapatok[1], Bpont, Bgól);

            if (lista.contains(cs1)) {
                int index = lista.indexOf(cs1);
                lista.get(index).setGólszám(lista.get(index).getGólszám() + Agól);
                lista.get(index).setPontszám(lista.get(index).getPontszám() + Apont);
            } else
                lista.add(cs1);

            if (lista.contains(cs2)) {
                int index = lista.indexOf(cs2);
                lista.get(index).setGólszám(lista.get(index).getGólszám() + Bgól);
                lista.get(index).setPontszám(lista.get(index).getPontszám() + Bpont);
            } else
                lista.add(cs2);

        }

        Collections.sort(lista);
        for (Csapat i : lista)
            System.out.println(i);
    }

}
