
package romo;

import java.util.Scanner;

public class Receipts {
    public void getReceipt(){
        
        Scanner input = new Scanner(System.in);
        String fname,pname;
        
        int quan, price, cash, totald,change;
        
        System.out.print("\nCustomer name: ");
        fname = input.nextLine();
        
        System.out.print("Product Name: ");
        pname = input.nextLine();
        
        System.out.print("Quantity: ");
        quan = input.nextInt();
        
        System.out.print("Price: ");
        price = input.nextInt();
        
        System.out.print("Cash: ");
        cash = input.nextInt();
        Receipt rc = new Receipt();
        rc.processReceipt(fname, pname, quan, price, cash);
        rc.viewReceipt();
        
    }
}