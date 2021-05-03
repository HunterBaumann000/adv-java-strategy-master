package discount;

public class mediumDiscount implements DiscountStrategy{
    @Override
    public double Discount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
