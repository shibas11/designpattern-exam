package shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker;

/**
 * Created by shiba on 2017-06-18.
 */
public class LGSpeaker extends Speaker {
    @Override
    protected void doTurnOn() {
        System.out.println("turn on LG speaker.");
    }

    @Override
    protected void doTurnOff() {
        System.out.println("turn off LG speaker.");
    }
}
