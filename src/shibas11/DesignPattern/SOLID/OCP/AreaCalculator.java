package shibas11.DesignPattern.SOLID.OCP;

/**
 * Created by shiba on 2017-06-11.
 */
public class AreaCalculator {
    public double getArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public double getArea(Triangle triangle) {
        return triangle.getWidth() * triangle.getHeight() / 2;
    }
}
