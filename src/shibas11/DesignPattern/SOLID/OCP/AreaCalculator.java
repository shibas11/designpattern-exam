package shibas11.DesignPattern.SOLID.OCP;

import java.util.List;

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

    public double getTotalArea(List<Object> list) {
        double tot = 0;
        for (Object obj : list) {
            if (obj instanceof Rectangle) {
                Rectangle rect = (Rectangle) obj;
                tot += this.getArea(rect);
            } else if (obj instanceof Triangle) {
                Triangle tri = (Triangle) obj;
                tot += this.getArea(tri);
            }
        }

        return tot;
    }
}
