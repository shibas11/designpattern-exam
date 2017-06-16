package shibas11.DesignPattern.SOLID.OCP;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
