package shibas11.DesignPattern.GoF.creational.Singleton;

/**
 * Created by SDS on 2017-06-12.
 */
public class PrinterFactory {
    private static Printer printer;
    private static PrinterFactory printerFactory = null;

    protected PrinterFactory() { // protected 제한자를 사용한다
    }

    public synchronized static PrinterFactory getPrinterFactory() {
        if (printerFactory == null) {
            printerFactory = new PrinterFactory();
        }
        return printerFactory;
    }

    // 정적 getter 메소드
    public static Printer getPrinter() {
        return PrinterFactory.printer;
    }

    // 정적 setter 메소드
    public static void setPrinter(Printer printer) {
        PrinterFactory.printer = printer;
    }
}
