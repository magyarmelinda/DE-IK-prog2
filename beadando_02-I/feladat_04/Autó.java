/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_04;

import java.util.Date;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Autó {
    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásiDátum;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásiDátum = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Autó)) {
            return false;
        }

        Autó a = (Autó) obj;

        return a.gyártásiDátum.compareTo(this.getGyártásiDátum()) == 0
                && a.motorTeljesítmény == this.getMotorTeljesítmény()
                && a.rendszám.equals(this.getRendszám());
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", motorTeljes\u00edtm\u00e9ny=" + motorTeljesítmény
                + ", gy\u00e1rt\u00e1siD\u00e1tum=" + gyártásiDátum + '}';
    }
}
