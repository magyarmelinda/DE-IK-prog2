/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_11;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Oktató extends Személy {
    protected String tanszék;

    public Oktató(String tanszék, String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
        this.tanszék = tanszék;
    }
}
