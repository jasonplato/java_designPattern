package design_pattern1;

import java.util.Scanner;

public class saleLineitem {
    private int copies;
    private ProductSpecification prodSpec;
    private IPricingStrategy strategy;


    public saleLineitem()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the book u wanna buy");
        prodSpec=new ProductSpecification();
        System.out.println("please input the quantity:");
        copies=sc.nextInt();
        System.out.println("success!");
        strategy=null;
    }

    public int getCopies()
    {
        return copies;
    }

    public ProductSpecification getProdSpec() {
        return prodSpec;
    }

    public IPricingStrategy getStrategy() {

        return strategy;
    }

    public void setStrategy(IPricingStrategy strategy)
    {
        this.strategy=strategy;
    }

    public double getSubtotal()
    {
        return strategy.getSubtotal(this);
    }
}
