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

public abstract class Gyumolcsle extends Ital {

    public Gyumolcsle(Gyumolcs gy) {
    }

    public String mibolFacsartak() {
        return mibolKeszult();
    }

    @Override
    public abstract String milyenIzu();

    @Override
    public abstract String mibolKeszult();

    @Override
    public String toString() {
        return "Gyumolcsle{" + '}';
    }
    
}
