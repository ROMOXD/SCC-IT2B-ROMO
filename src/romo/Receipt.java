
package romo;

import java.util.Scanner;

public class Receipt {
public void receiptNew(){
   Scanner input = new Scanner(System.in);
    
   String cname, pname;
   int quan, price, cash;
   
   System.out.print("Enter customer name: ");
     cname = input.nextLine();
   System.out.print("Enter product name: ");
     pname = input.nextLine();
   System.out.print("Quantity: ");
   quan = input.nextInt();
   System.out.print("Price: ");
     price = input.nextInt();
   System.out.print("cash: ");
     cash = input.nextInt();
        
     System.out.println("\n-----------------------");
     System.out.println("RECEIPT");
     System.out.println("-----------------------");
    
   System.out.println("Name: "+cname);
   System.out.print("Product Name: "+pname); 
   System.out.print("\nQuantity: "+quan);
   System.out.print("\nTotal Due: "+(quan*price));
   System.out.print("\nCash: "+(cash));
   System.out.print("\n-----------------------");
   System.out.print("\nChange: "+(cash-(quan*price)));
   System.out.print("\n-----------------------\n"); 
    
    
    }  
    
}
