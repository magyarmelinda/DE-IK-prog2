/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat6;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class MásfélMillióLépés {

    String turista_neve;
    int orszagos;
    int helyi;

    public MásfélMillióLépés(String turista_neve, int orszagos, int helyi) {
        this.turista_neve = turista_neve;
        this.orszagos = orszagos;
        this.helyi = helyi;
    }

    public String getTurista_neve() {
        return turista_neve;
    }

    public void setTurista_neve(String turista_neve) {
        this.turista_neve = turista_neve;
    }

    public int getOrszagos() {
        return orszagos;
    }

    public void setOrszagos(int orszagos) {
        this.orszagos = orszagos;
    }

    public int getHelyi() {
        return helyi;
    }

    public void setHelyi(int helyi) {
        this.helyi = helyi;
    }

    @Override
    public String toString() {
        return turista_neve;
    }

}
