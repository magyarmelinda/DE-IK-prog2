/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Circle extends GeometricShape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // terület
    public double getArea() {
        return this.radius * Math.PI;
    }

    // kerület
    public double getPerimeter() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    // átmérő
    public double getDiameter() {
        return this.radius * 2;
    }
}
