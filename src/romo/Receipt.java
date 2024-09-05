
package romo;

import java.util.Scanner;

public class Receipt {
public void receiptNew(){
   Scanner input = new Scanner(System.in);
    
   String cname, pname;
   int quan, price, cash;
   
   System.out.println("Enter customer name: ");
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
   System.out.print("Pname: "+pname); 
   System.out.print("\nQuan: "+quan);
   System.out.println("/n-----------------------");
   System.out.print("\nTotal Due: "+(quan*price));
   System.out.print("\nCash: "+(cash));
   System.out.print("\n-----------------------");
   System.out.print("Change: "+(cash-(quan*price)));
   System.out.print("\n-----------------------"); 
    
    
    }  
    
}
