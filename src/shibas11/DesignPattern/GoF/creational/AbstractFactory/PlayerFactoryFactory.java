package shibas11.DesignPattern.GoF.creational.AbstractFactory;

public class PlayerFactoryFactory {
    public static PlayerFactory getFactory(VendorId vendorId) {
        PlayerFactory playerFactory = null;
        switch (vendorId) {
            case Hyundai:
                playerFactory = new HyundaiPlayerFactory();
                break;
            case LG:
                playerFactory = new LGPlayerFactory();
                break;
            case SAMSUNG:
                playerFactory = new SamsungPlayerFactory();
                break;
        }
        return playerFactory;
    }
}
