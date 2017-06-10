package shibas11.DesignPattern;

import shibas11.DesignPattern.SOLID.DIP.AdderFactory;
import shibas11.DesignPattern.SOLID.DIP.Calculator;
import shibas11.DesignPattern.SOLID.DIP.IAdder;

/**
 * Created by shiba on 2017-06-10.
 */
public class ExamRunner {
    public void run(String code) {
        System.out.println("=== " + code + " ===");
        switch (code) {
            case "SOLID.DIP":
                IAdder adder = AdderFactory.create(AdderFactory.AdderType.X2);
                Calculator cal = new Calculator();
                cal.setAdder(adder);
                System.out.println("1 + 2 = " + cal.add(1, 2));
                break;
            default:
                break;
        }
        System.out.println();
    }
}
