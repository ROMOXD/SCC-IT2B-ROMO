package romo;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Salary sl = new Salary();
        Account ac = new Account();
        Receipts rc = new Receipts();
        
        String transaction;
        
        System.out.println("-------------------");
        System.out.println("| Prelim Projects |");
        System.out.println("-------------------\n");
        
        do{
                             
                System.out.println("1. Salary");
                System.out.println("2. Account");  
                System.out.println("3. Reciept");
            System.out.print("\nEnter selection: ");
            int select = sc.nextInt();

            switch(select){
                case 1:
                    sl.getSalary();
                    break;
                case 2: 
                    ac.getAccounts();
                break;
                case 3:
                    rc.getReceipt();
                    break;
                default: System.out.println("Invalid choice.");
            }
            System.out.print("Make another transaction? (y/n): ");
            transaction = sc.next();
        } while(transaction.contains("y"));
        
    }
    }


        
        //AgeCalculator ac = new AgeCalculator();
        //ac.getAge();
        
        //Grade grd = new Grade();
        //grd.getGrades();

        //Loan ln = new Loan();
        //ln.getLoan();
           
