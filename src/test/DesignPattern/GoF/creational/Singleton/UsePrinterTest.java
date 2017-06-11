package test.DesignPattern.GoF.creational.Singleton;

import junit.framework.TestCase;
import org.junit.Test;
import shibas11.DesignPattern.GoF.creational.Singleton.FakePrinter;
import shibas11.DesignPattern.GoF.creational.Singleton.UsePrinter;

import static org.junit.Assert.*;

/**
 * Created by SDS on 2017-06-12.
 */
public class UsePrinterTest extends TestCase {
    @Test
    public void test_doSomething() throws Exception { // 메소드명이 test 로 시작해야 함?
        FakePrinter fake = new FakePrinter();
        UsePrinter u = new UsePrinter();
        u.doSomething(fake);
        assertEquals("doSomething and print it.", fake.get());
    }
}
