package shibas11.DesignPattern.GoF.creational.AbstractFactory;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.MusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.Speaker;

public abstract class PlayerFactory {
    public abstract Speaker createSpeaker();

    public abstract MusicPlayer createMusicPlayer();
}
