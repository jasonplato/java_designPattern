package design_pattern1;

public class Flatratestrategy implements IPricingStrategy{
    private double discountperbook=1;
    @Override
    public double getSubtotal(saleLineitem temp) {
        return temp.getProdSpec().getPrice()*temp.getCopies()-temp.getCopies()*discountperbook;
    }
}
