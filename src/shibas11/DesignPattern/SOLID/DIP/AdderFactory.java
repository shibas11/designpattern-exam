package shibas11.DesignPattern.SOLID.DIP;

public class AdderFactory {
    public static IAdder create(AdderType type) {
        switch (type) {
            case NORMAL:
                return new Adder();
            case X2:
                return new X2Adder();
            default:
                throw new IllegalArgumentException();
        }
    }

    public enum AdderType {
        X2,
        NORMAL
    }
}
