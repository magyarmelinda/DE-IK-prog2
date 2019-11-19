/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Tea implements Rendezheto{
    public String nev;
    public int ár;

    public Tea(String s, int j) {
        this.nev = s;
        this.ár = j;
    }

    @Override
    public boolean egyenlo(Object o) {
        Tea t = (Tea) o;
        
        return this.nev.compareTo(t.nev) == 0;
    }

    @Override
    public boolean nagyobbMint(Object o) {
        Tea t = (Tea) o;
        
        return Integer.compare(this.ár, t.ár) > 0;
    }

    @Override
    public boolean kisebbMint(Object o) {
        Tea t = (Tea) o;
        
        return Integer.compare(this.ár, t.ár) < 0;
    }
   
}
