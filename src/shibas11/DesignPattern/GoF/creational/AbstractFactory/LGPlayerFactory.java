package shibas11.DesignPattern.GoF.creational.AbstractFactory;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.LGMusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.MusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.LGSpeaker;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.Speaker;

public class LGPlayerFactory extends PlayerFactory {
    @Override
    public Speaker createSpeaker() {
        return new LGSpeaker();
    }

    @Override
    public MusicPlayer createMusicPlayer() {
        return new LGMusicPlayer();
    }
}
