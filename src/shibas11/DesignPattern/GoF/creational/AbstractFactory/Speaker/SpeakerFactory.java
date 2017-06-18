package shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.VendorId;

/**
 * Created by shiba on 2017-06-18.
 */
public class SpeakerFactory {
    public static Speaker createSpeaker(VendorId vendorId) {
        Speaker speaker = null;
        switch (vendorId) {
            case Hyundai:
                speaker = new HyundaiSpeaker();
                break;
            case LG:
                speaker = new LGSpeaker();
                break;
        }
        return speaker;
    }
}
