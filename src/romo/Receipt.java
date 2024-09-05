
package romo;

import java.util.Scanner;

public class Receipt {
public void receiptNew(){
   Scanner input = new Scanner(System.in);
    
   String cname, pname;
   int quan, price, cash;
   
   System.out.println("Enter customer name: ");
     cname = input.nextLine();
   System.out.println("Enter product name: ");
     pname = input.nextLine();
   System.out.println("Quantity: ");
   quan = input.nextInt();
   System.out.println("Price: ");
     price = input.nextInt();
   System.out.println("cash: ");
     cash = input.nextInt();
        
     System.out.println("\n-----------------------");
     System.out.println("RECEIPT");
     System.out.println("-----------------------");
    
   System.out.println("Name: "+cname);
   System.out.println("pname: "+pname); 
   System.out.println("qu\n" +
"   System.out.println(\"Total Due: \"+(quan*price));\n" +
"   System.out.println(\"Cash: \"+(cash));\n" +
"   System.out.println(\"----------------an: "+quan);
   System.out.println("------------------------------");
   System.out.println("Change: "+(cash-(quan*price)));
    
    
    
    }  
    
}
