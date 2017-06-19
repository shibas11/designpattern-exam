package shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer;

/**
 * Created by shiba on 2017-06-18.
 */
public class LGMusicPlayer extends MusicPlayer {
    @Override
    protected void doStop() {
        System.out.println("음악멈추기 [LG]");
    }

    @Override
    protected void doPlay() {
        System.out.println("음악 실행 [LG]");
    }
}
