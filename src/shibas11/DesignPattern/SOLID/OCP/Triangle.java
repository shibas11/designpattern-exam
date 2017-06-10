package shibas11.DesignPattern.SOLID.OCP;

/**
 * Created by shiba on 2017-06-11.
 */
public class Triangle implements Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return getWidth() * getHeight() / 2;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
