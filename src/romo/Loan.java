package romo;

import java.util.Scanner;

public class Loan{
    
    Scanner sc = new Scanner(System.in);
    
   public void getLoan(){
       System.out.print("Enter your credit score (0-850): ");
        int cScore = sc.nextInt();

        System.out.print("Enter your annual income (in PHP): ");
        double income = sc.nextDouble();

        System.out.print("Enter your existing debt (in PHP): ");
        double debt = sc.nextDouble();
        
        boolean Approved = true;
        
         if (cScore < 700) {
            Approved = false;
            System.out.println("Loan rejected, Credit score is less than 700.");
        }

        if (income < 300000) {
            Approved = false;
            System.out.println("Loan rejected, Annual income is less than 300,000 PHP.");
        }

        if (debt > (0.5 * income)) {
            Approved = false;
            System.out.println("Loan rejected, Existing debt exceeds 50% of the annual income.");
        }
       
        if (Approved) {
            System.out.println("\nLoan is approved!");
        } else {
            System.out.println("Loan is not approved!");
        }

        sc.close();
        
   }
}
