package design_pattern1;

import java.util.ArrayList;
import java.util.Scanner;

public class sale {
    private ArrayList<saleLineitem> items=new ArrayList<saleLineitem>();

    public sale()
    {
        Scanner sc=new Scanner(System.in);
        while(true) {
            String choice;
            System.out.println("are u sure to buy something?(Y/N)");
            choice=sc.next();
            if (choice.equals("N"))break;
            else if(choice.equals("Y"))
            {
            System.out.println("what u wanna buy ");
            saleLineitem temp = new saleLineitem();
            items.add(temp);}
            else
            {
                System.out.println("wrong input!");
                continue;
            }
        }
    }

    public double getTotal()
    {
        double result=0.0;
        for(int i=0;i<items.size();i++)
        {
            result+=items.get(i).getSubtotal();
        }
        return result;
    }

    public ArrayList getarraylist()
    {
        return items;
    }
}
