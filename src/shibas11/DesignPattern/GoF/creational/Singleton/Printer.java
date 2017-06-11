package shibas11.DesignPattern.GoF.creational.Singleton;

/**
 * Created by shiba on 2017-06-11.
 */
public class Printer {
    private static Printer printer = null;
    private int counter = 0;

    private Printer() {
    }

    public synchronized static Printer getPrinter() { // 메서드 동기화
        if (printer == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str) {
        synchronized (this) { // 오직 하나의 스레드만 접근을 허용함
            counter++;
            System.out.println(str + " counter= " + counter);
        }
    }

}
