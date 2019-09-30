/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Rectangle {

    public double width;
    public double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return "Width: " + this.width + " Height: " + this.height
                + " Area: " + this.getArea() + " Perimeter: " + this.getPerimeter();
    }
}
