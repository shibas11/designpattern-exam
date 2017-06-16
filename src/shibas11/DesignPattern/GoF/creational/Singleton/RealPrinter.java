package shibas11.DesignPattern.GoF.creational.Singleton;

public class RealPrinter implements Printer { // 싱글턴 적용
    private static RealPrinter printer = null;
    private int counter = 0;

    private RealPrinter() {
    }

    public synchronized static RealPrinter getPrinter() { // 메서드 동기화
        if (printer == null)
            printer = new RealPrinter();
        return printer;
    }

    @Override
    public void print(String str) {
        synchronized (this) { // 오직 하나의 스레드만 접근을 허용함
            counter++;
            System.out.println(str + " counter= " + counter);
        }
    }

}
