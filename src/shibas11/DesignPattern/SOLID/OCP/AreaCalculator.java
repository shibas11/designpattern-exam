package shibas11.DesignPattern.SOLID.OCP;

import java.util.List;

/**
 * Created by shiba on 2017-06-11.
 */
public class AreaCalculator {

    public double getTotalArea(List<Shape> list) {
        double tot = 0;
        for (Shape obj : list)
            tot += obj.getArea();
        return tot;
    }
}
