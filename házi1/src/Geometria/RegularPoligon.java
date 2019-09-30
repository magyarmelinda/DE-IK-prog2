/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class RegularPoligon {

    private int n;
    double side;
    private double x;
    private double y;

    public RegularPoligon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPoligon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPoligon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAre() {
        double number = (180 / this.n) * (Math.PI / 180); // get the number & convert to radian
        double ri = this.side / (2 * Math.tan(number));

        return this.getPerimeter() * (ri / 2);
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    @Override
    public String toString() {
        return "Area: " + this.getAre() + " " + "Perimeter: " + this.getPerimeter();
    }

}
