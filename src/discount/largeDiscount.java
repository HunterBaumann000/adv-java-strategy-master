package discount;

public class largeDiscount implements DiscountStrategy{
    @Override
    public double Discount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}
