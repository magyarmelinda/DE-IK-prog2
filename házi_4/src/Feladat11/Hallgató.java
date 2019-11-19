/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat11;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Hallgató extends Személy{
    private double átlag;

    public Hallgató(double átlag, String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
        this.átlag = átlag;
    }

    public boolean jóÁtlag() {
        return this.átlag >= 4;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNév()).append("\n").append(this.getÉletkor()).append("\n").append(this.isFérfi());
        sb.append("\n").append(this.átlag);
        
        return sb.toString();
    }   
    
}
