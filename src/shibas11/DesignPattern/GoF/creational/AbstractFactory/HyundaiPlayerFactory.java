package shibas11.DesignPattern.GoF.creational.AbstractFactory;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.HyundaiMusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.MusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.HyundaiSpeaker;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.Speaker;

public class HyundaiPlayerFactory extends PlayerFactory {
    @Override
    public Speaker createSpeaker() {
        return new HyundaiSpeaker();
    }

    @Override
    public MusicPlayer createMusicPlayer() {
        return new HyundaiMusicPlayer();
    }
}
