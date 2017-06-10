package shibas11.DesignPattern.SOLID.OCP;

/**
 * Created by shiba on 2017-06-11.
 */
public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
