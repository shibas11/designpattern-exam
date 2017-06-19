package shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker;

/**
 * Created by shiba on 2017-06-18.
 */
public class SamsungSpeaker extends Speaker {
    @Override
    protected void doTurnOn() {
        System.out.println("삼성 스피커 파워 온!");
    }

    @Override
    protected void doTurnOff() {
        System.out.println("삼성 스피커 파워 오프!");
    }
}
