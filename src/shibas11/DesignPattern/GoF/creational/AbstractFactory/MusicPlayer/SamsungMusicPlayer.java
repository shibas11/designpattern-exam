package shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer;

public class SamsungMusicPlayer extends MusicPlayer {
    @Override
    protected void doStop() {
        System.out.println("그대로 멈춰라 [삼성]");
    }

    @Override
    protected void doPlay() {
System.out.println(("음질 좋~게 플레이! [삼성]"));
    }
}
