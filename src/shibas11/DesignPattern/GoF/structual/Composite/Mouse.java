package shibas11.DesignPattern.GoF.structual.Composite;

public class Mouse {
    private int price;
    private int power;

    public Mouse(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }
}
