package shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.Speaker;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.SpeakerStatus;

/**
 * Created by shiba on 2017-06-18.
 */
public abstract class MusicPlayer {
    private Speaker speaker;
    private MusicPlayerStatus playerStatus;

    public MusicPlayer() {
        playerStatus = MusicPlayerStatus.Ready;
    }

    public void play() {
        if (playerStatus == MusicPlayerStatus.Playing)
            return;

        SpeakerStatus speakerStatus = speaker.getSpeakerStatus();
        if (speakerStatus == SpeakerStatus.PowerOff)
            speaker.turnOn();

        doPlay();
        playerStatus = MusicPlayerStatus.Playing;

    }

    public void stop() {
        SpeakerStatus speakerStatus = speaker.getSpeakerStatus();
        if (speakerStatus == SpeakerStatus.PowerOff)
            speaker.turnOn();

        doStop();
        playerStatus = MusicPlayerStatus.Playing;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    protected abstract void doStop();

    protected abstract void doPlay();
}
