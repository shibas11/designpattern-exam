package shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer;

import shibas11.DesignPattern.GoF.creational.AbstractFactory.VendorId;

/**
 * Created by shiba on 2017-06-18.
 */
public class MusicPlayerFactory {
    public static MusicPlayer createMusicPlayer(VendorId vendorId) {
        MusicPlayer musicPlayer = null;
        switch (vendorId) {
            case Hyundai:
                musicPlayer = new HyundaiMusicPlayer();
                break;
            case LG:
                musicPlayer = new LGMusicPlayer();
                break;
        }
        return musicPlayer;
    }
}
