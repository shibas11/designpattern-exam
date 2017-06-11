package shibas11.DesignPattern.GoF.creational.Singleton;

/**
 * Created by shiba on 2017-06-11.
 */
public class Printer {
    private static Printer printer = new Printer();
    private int counter = 0;

    private Printer() {
    }

    public static Printer getPrinter() {
//        if (printer == null) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//            }
//            printer = new Printer();
//        }
        return printer;
    }

    public void print(String str) {
        counter++;
        System.out.println(str + " counter= " + counter);
    }

}
