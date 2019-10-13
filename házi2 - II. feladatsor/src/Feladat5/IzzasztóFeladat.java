/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class IzzasztóFeladat {

    String településnév;
    int hőmérséklet;

    public IzzasztóFeladat(String településnév, int hőmérséklet) {
        this.településnév = településnév;
        this.hőmérséklet = hőmérséklet;
    }

    public String getTelepülésnév() {
        return településnév;
    }

    public void setTelepülésnév(String településnév) {
        this.településnév = településnév;
    }

    public int getHőmérséklet() {
        return hőmérséklet;
    }

    public void setHőmérséklet(int hőmérséklet) {
        this.hőmérséklet = hőmérséklet;
    }

    @Override
    public String toString() {
        return this.településnév + " (" + this.hőmérséklet + ")";
    }
}
