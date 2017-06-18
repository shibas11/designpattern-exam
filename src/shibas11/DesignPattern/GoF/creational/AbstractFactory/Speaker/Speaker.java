package shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker;

/**
 * Created by shiba on 2017-06-18.
 */
public abstract class Speaker {
    private SpeakerStatus speakerStatus;

    public Speaker() {
        speakerStatus = SpeakerStatus.PowerOff;
    }

    public void turnOn() {
        if (speakerStatus == SpeakerStatus.PowerOn)
            return;

        doTurnOn();
        speakerStatus = SpeakerStatus.PowerOn;
    }

    public void turnOff() {
        if (speakerStatus == SpeakerStatus.PowerOff)
            return;

        doTurnOff();
        speakerStatus = SpeakerStatus.PowerOff;
    }

    public SpeakerStatus getSpeakerStatus() {
        return speakerStatus;
    }

    protected abstract void doTurnOn();

    protected abstract void doTurnOff();
}
