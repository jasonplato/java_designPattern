package design_pattern1;

import java.util.Scanner;

public class ProductSpecification {
    private String isbn;
    private String title;
    private double price;
    private int type;

    public ProductSpecification()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the name of book:");
        title=sc.next();
        System.out.println("please input the price/book:");
        price=sc.nextDouble();
        System.out.println("please input the type\n(1.non-textbook computer books\t2.textbook\t3.comic\t4.others)");
        type=sc.nextInt();
        isbn="0000";
    }

    public double getPrice()
    {
        return price;
    }

    public int getType()
    {
        return type;
    }
}
