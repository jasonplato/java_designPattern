package design_pattern1;

import java.util.ArrayList;

public class pattern1_test {
    public static void main(String[] args) {
        PricingStrategyFactory strategyfactory = PricingStrategyFactory.getInstance();

        sale salelist = new sale();
        IPricingStrategy strategy;
        ArrayList<saleLineitem> items = salelist.getarraylist();
        for (int i=0;i<items.size();i++)
        {
            strategy=strategyfactory.getPricingStrategy(items.get(i));
            items.get(i).setStrategy(strategy);
        }
        System.out.println("*********************************");
        System.out.println("the total price :");
        System.out.println(String.format("%.2f",salelist.getTotal()));
    }
}
