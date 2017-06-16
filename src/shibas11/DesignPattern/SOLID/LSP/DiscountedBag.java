package shibas11.DesignPattern.SOLID.LSP;

public class DiscountedBag extends Bag {
    private double discountedRate;

    public void applyDiscount(int price) {
        super.setPrice(price - (int) (price * discountedRate));
    }

    public void setDiscountedRate(double discountedRate) {
        this.discountedRate = discountedRate;
    }
}
