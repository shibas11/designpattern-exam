package shibas11.DesignPattern.SOLID.OCP;

/**
 * Created by shiba on 2017-06-11.
 */
public class AreaCalculator {
    public double getArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
