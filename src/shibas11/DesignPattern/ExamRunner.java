package shibas11.DesignPattern;

import shibas11.DesignPattern.SOLID.DIP.AdderFactory;
import shibas11.DesignPattern.SOLID.DIP.Calculator;
import shibas11.DesignPattern.SOLID.DIP.IAdder;
import shibas11.DesignPattern.SOLID.ISP.Bird;
import shibas11.DesignPattern.SOLID.ISP.Penguin;
import shibas11.DesignPattern.SOLID.ISP.Pigeon;
import shibas11.DesignPattern.SOLID.LSP.DiscountedBag;
import shibas11.DesignPattern.SOLID.OCP.AreaCalculator;
import shibas11.DesignPattern.SOLID.OCP.Rectangle;
import shibas11.DesignPattern.SOLID.OCP.Shape;
import shibas11.DesignPattern.SOLID.OCP.Triangle;
import shibas11.DesignPattern.SOLID.SRP.Employee;
import shibas11.DesignPattern.SOLID.SRP.Student;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by shiba on 2017-06-10.
 */
public class ExamRunner {
    public void run(String code) {
        System.out.println("=== " + code + " ===");
        switch (code) {
            case "SOLID.SRP":
                Student st = new Student("Jake");
                Employee em = new Employee("Lee");
                st.study();
                em.work();
                break;
            case "SOLID.OCP":
                AreaCalculator ac = new AreaCalculator();
                Rectangle rect = new Rectangle(2, 3);
                Triangle tri = new Triangle(2, 3);
                List<Shape> list = new LinkedList<>();
                list.add(rect);
                list.add(tri);
                System.out.println(String.format("사각형의 넓이는 %f", rect.getArea()));
                System.out.println(String.format("삼각형의 넓이는 %f", tri.getArea()));
                System.out.println(String.format("넓이의 총합은 %f", ac.getTotalArea(list)));
                break;
            case "SOLID.LSP":
                DiscountedBag bag = new DiscountedBag();
                bag.setDiscountedRate(0.5);
                bag.applyDiscount(100);
                System.out.println("가방 가격 설정: 100");
                System.out.println("가방 가격은? " + bag.getPrice());

                break;
            case "SOLID.DIP":
                IAdder adder = AdderFactory.create(AdderFactory.AdderType.X2);
                Calculator cal = new Calculator();
                cal.setAdder(adder);
                System.out.println("1 + 2 = " + cal.add(1, 2));
                break;

            case "SOLID.ISP":
                Bird pigeon = new Pigeon();
                pigeon.eat();
                pigeon.sing();
                pigeon.fly();
                Bird penguin = new Penguin();
                penguin.eat();
                penguin.sing();
                penguin.fly();
                break;
            default:
                break;
        }
        System.out.println();
    }
}
