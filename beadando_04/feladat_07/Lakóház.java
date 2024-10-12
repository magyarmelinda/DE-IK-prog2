/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_07;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Lakóház implements Comparable<Lakóház> {
    public static final double emeletMagasság = 3.2;
    private String cím;
    private int emeletekSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletekSzáma, double alapterület) {
        this.cím = cím;
        this.emeletekSzáma = emeletekSzáma;
        this.alapterület = alapterület;
    }

    public String getCím() {
        return cím;
    }

    public int getEmeletekSzáma() {
        return emeletekSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }

    public double légköbméret() {
        return this.alapterület * Lakóház.emeletMagasság * this.emeletekSzáma;
    }

    @Override
    public int compareTo(Lakóház l) {
        return Double.compare(this.légköbméret(), l.légköbméret());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cím).append(" Térfogata: ").append(this.légköbméret());

        return sb.toString();
    }
}
