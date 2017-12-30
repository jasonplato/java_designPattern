package design_pattern1;

public class Percentagestrategy2 implements IPricingStrategy{
    private float percentageperbook=(float)0.03;


    @Override
    public double getSubtotal(saleLineitem temp) {
        return temp.getProdSpec().getPrice()*(1-percentageperbook)*temp.getCopies();
    }
}
