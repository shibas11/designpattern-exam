package shibas11.DesignPattern.SOLID.OCP;

import java.util.List;

/**
 * Created by shiba on 2017-06-11.
 */
public class AreaCalculator {

    public double getTotalArea(List<Object> list) {
        double tot = 0;
        for (Object obj : list) {
            if (obj instanceof Rectangle) {
                Rectangle rect = (Rectangle) obj;
                tot += rect.getArea();
            } else if (obj instanceof Triangle) {
                Triangle tri = (Triangle) obj;
                tot += tri.getArea();
            }
        }

        return tot;
    }
}
