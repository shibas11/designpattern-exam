package shibas11.DesignPattern.GoF.creational.AbstractFactory;

/**
 * Created by shiba on 2017-06-18.
 */
public class HyundaiMusicPlayer extends MusicPlayer {
    @Override
    protected void doStop() {
        System.out.println("멈추세요!!!!! [현대]");
    }

    @Override
    protected void doPlay() {
        System.out.println("풍월을 울려라~~~ [현대]");
    }
}
