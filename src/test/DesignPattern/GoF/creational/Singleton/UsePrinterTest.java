package test.DesignPattern.GoF.creational.Singleton;

import org.junit.Test;
import shibas11.DesignPattern.GoF.creational.Singleton.FakePrinter;
import shibas11.DesignPattern.GoF.creational.Singleton.UsePrinter;

import static org.junit.Assert.assertEquals;

/**
 * Created by shiba on 2017-06-11.
 */
public class UsePrinterTest {
    @Test
    public void doSomething() throws Exception {
        String str = "doSomething and print it.";
        FakePrinter fake = new FakePrinter();
        UsePrinter u = new UsePrinter();
        u.doSomething(fake);
        assertEquals(str, fake.get());
    }
}
