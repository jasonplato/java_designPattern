package design_pattern1;

public class PricingStrategyFactory {
    private static PricingStrategyFactory instance;

    private PricingStrategyFactory()
    {

    }

    public static PricingStrategyFactory getInstance()
    {
        if(instance==null)
        {
            instance=new PricingStrategyFactory();
        }
        return instance;
    }

    public IPricingStrategy getPricingStrategy(saleLineitem temp)
    {
        if(temp==null) {
            return null;
        }
        else
        {
            switch (temp.getProdSpec().getType())
            {
                case 1:return new Percentagestrategy2();
                case 2:return new Flatratestrategy();
                case 3:return new Percentagestrategy1();
                case 4:return new Nodiscountstrategy();
            }
        }
        return null;
    }

}
