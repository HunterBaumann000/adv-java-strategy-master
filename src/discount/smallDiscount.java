package discount;

public class smallDiscount implements DiscountStrategy{
    @Override
    public double Discount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}
