package shibas11.DesignPattern.GoF.creational.AbstractFactory;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.MusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.SamsungMusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.SamsungSpeaker;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.Speaker;

public class SamsungPlayerFactory implements PlayerFactory {
    @Override
    public Speaker createSpeaker() {
        return new SamsungSpeaker();
    }

    @Override
    public MusicPlayer createMusicPlayer() {
        return new SamsungMusicPlayer();
    }
}
