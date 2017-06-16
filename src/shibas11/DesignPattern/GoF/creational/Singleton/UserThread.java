package shibas11.DesignPattern.GoF.creational.Singleton;

public class UserThread extends Thread {
    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //super.run();
        Printer printer = RealPrinter.getPrinter();
        printer.print(Thread.currentThread().getName() + " print using " + printer.toString() + ".");
    }
}
