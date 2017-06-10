package shibas11.DesignPattern;

import shibas11.DesignPattern.SOLID.DIP.Calculator;

/**
 * Created by shiba on 2017-06-10.
 */
public class ExamRunner {
    public void run(String code) {
        System.out.println("=== " + code + " ===");
        switch (code) {
            case "SOLID.DIP":
                Calculator cal = new Calculator();
                System.out.println("1 + 2 = " + cal.add(1, 2));
                break;
            default:
                break;
        }
        System.out.println();
    }
}
