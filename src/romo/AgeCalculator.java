
package romo;

import java.util.Scanner;

public class AgeCalculator {
    public void getAge(){ 
    
    Scanner input = new Scanner(System.in);
        
        String fname;
        int byear, cyear;
        
        System.out.print("Enter your name: ");
        fname = input.nextLine();
        System.out.print("Enter birth year: ");          
        byear = input.nextInt();
        System.out.print("Enter current year: ");          
        cyear = input.nextInt();
        
              
        System.out.println("Hello "+fname+", your are "+(cyear-byear)+" years of age!\n");
    }
        
}
