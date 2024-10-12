/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_03;

/**
 *
 * @author Magyar Melinda Barbara
 */

public interface Rendezheto<T> {
    public boolean egyenlo(Object o);

    public boolean nagyobbMint(Object o);

    public boolean kisebbMint(Object o);
}
