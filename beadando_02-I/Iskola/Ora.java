/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iskola;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Ora {
    int óraKódja;
    private String óraNeve;
    private int óraKezdete;

    public Ora(int óraKódja, String óraNeve, int óraKezdete) {
        if (this.óraKezdete < 5)
            this.óraKezdete = 8;
        if (this.óraKezdete > 19)
            this.óraKezdete = 19;

        this.óraKódja = óraKódja;
        this.óraNeve = óraNeve;
        this.óraKezdete = óraKezdete;
    }

    public int getÓraKódja() {
        return óraKódja;
    }

    public void setÓraKódja(int óraKódja) {
        this.óraKódja = óraKódja;
    }

    public String getÓraNeve() {
        return óraNeve;
    }

    public void setÓraNeve(String óraNeve) {
        this.óraNeve = óraNeve;
    }

    public int getÓraKezdete() {
        return óraKezdete;
    }

    public void setÓraKezdete(int óraKezdete) {
        this.óraKezdete = óraKezdete;
    }

    @Override
    public String toString() {
        return this.óraNeve;
    }
}
