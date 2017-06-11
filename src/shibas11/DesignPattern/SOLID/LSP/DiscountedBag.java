package shibas11.DesignPattern.SOLID.LSP;

/**
 * Created by shiba on 2017-06-11.
 */
public class DiscountedBag extends Bag {
    private double discountedRate;

    public void setDiscountedRate(double discountedRate) {
        this.discountedRate = discountedRate;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price - (int) (price * discountedRate));
    }
}
