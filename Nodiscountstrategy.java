package design_pattern1;

public class Nodiscountstrategy implements IPricingStrategy{
    @Override
    public double getSubtotal(saleLineitem temp) {
        return temp.getProdSpec().getPrice()*temp.getCopies();
    }
}
