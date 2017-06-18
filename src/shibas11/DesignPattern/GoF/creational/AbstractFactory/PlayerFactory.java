package shibas11.DesignPattern.GoF.creational.AbstractFactory;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.MusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.Speaker;

public interface PlayerFactory {
    Speaker createSpeaker();

    MusicPlayer createMusicPlayer();
}
