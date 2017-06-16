package test.DesignPattern.GoF.creational.Singleton;

import junit.framework.TestCase;
import org.junit.Test;
import shibas11.DesignPattern.GoF.creational.Singleton.FakePrinter;
import shibas11.DesignPattern.GoF.creational.Singleton.PrinterFactory;
import shibas11.DesignPattern.GoF.creational.Singleton.UsePrinter;

public class UsePrinterTest extends TestCase {
    @Test
    public void test_doSomething() throws Exception { // 메소드명이 test 로 시작해야 함?
        FakePrinter fake = new FakePrinter();
        PrinterFactory.setPrinter(fake);
        UsePrinter u = new UsePrinter();
        u.doSomething();
        assertEquals("doSomething and print it.", fake.get());
    }
}
