package shibas11.DesignPattern.GoF.creational.Singleton;

public class UsePrinter {
    public void doSomething() {
        String str = "doSomething and print it.";
        PrinterFactory.getPrinterFactory().getPrinter().print(str);
    }
}
