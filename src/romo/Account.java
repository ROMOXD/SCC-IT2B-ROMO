
package romo;

import java.util.Scanner;

public class Account {
    
    public void getAccount(){
    
     Scanner sc = new Scanner(System.in);
     
     Account[] ac = new Account[100];
        
        System.out.print("Enter no. of Account: ");
        int numa = sc.nextInt();
        
        for(int i = 0; i < numa; i++){
            
            System.out.println("Enter details of Account "+(i+1)+":");
            System.out.print("Enter ID: ");
            String id = sc.next();
            System.out.print("Enter Last Name: ");
            String lName = sc.next();
            System.out.print("Enter First Name: ");
            String fName = sc.next();
            System.out.print("Enter Email: ");
            String email = sc.next();
            System.out.print("Enter Username: ");
            String userN = sc.next();
            System.out.print("Enter Password: ");
            String pass = sc.next();
            
            boolean valid = true;
            
        ac[i] = new Account();
        ac[i].addAccounts(id, lName, fName, email, userN, pass);
        
        }
        
        System.out.println("------------------------------------------------------------------------------------------------");
    System.out.println("| ID \t     | LAST NAME \t  | FIRST NAME       | EMAIL \t    | USERNAME \t | PASSWORD       |");
        System.out.println("------------------------------------------------------------------------------------------------");
    
         for(int i = 0; i < numa; i++){
         
         ac[i].viewAccounts();
         
         
         
         }
    
    
    }
    
}
