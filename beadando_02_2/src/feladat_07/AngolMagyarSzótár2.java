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

public class AngolMagyarSzótár2 {
    String angol_szó;
    String magyar_szó;

    public AngolMagyarSzótár2(String angol_szó, String magyar_szó) {
        this.angol_szó = angol_szó;
        this.magyar_szó = magyar_szó;
    }

    public String getAngol_szó() {
        return angol_szó;
    }

    public void setAngol_szó(String angol_szó) {
        this.angol_szó = angol_szó;
    }

    public String getMagyar_szó() {
        return magyar_szó;
    }

    public void setMagyar_szó(String magyar_szó) {
        this.magyar_szó = magyar_szó;
    }

    @Override
    public String toString() {
        return this.angol_szó + ":" + this.magyar_szó;
    }
}
