
package romo;

import java.util.Scanner;

public class Grade {
    
    public void getGrades(){
        
    Scanner scan = new Scanner(System.in);

    Grades[] gr = new Grades[100];
    
        System.out.print("Enter no. of Students: ");
        int nums = scan.nextInt();
        
        for(int i = 0;i < nums;i ++){
            
            System.out.println("Enter details of Student "+(i+1)+":");
            System.out.print("Enter Student ID: ");
            String id = scan.next();
            System.out.print("Enter Student Name: ");
            String name = scan.next();
            System.out.print("Enter Student Prelim Grade: ");
            double p = scan.nextDouble();
            System.out.print("Enter Student Midterm Grade: ");
            double m = scan.nextDouble();
            System.out.print("Enter Student Pre-Final Grade: ");
            double pf = scan.nextDouble();
            System.out.print("Enter Student Final Grade: ");
            double f = scan.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(id, name, p, m, pf, f);
            
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("| ID \t     | NAME \t  | PRELIM       | MIDTERM \t    | PRE-FINAL \t | FINAL       | AVERAGE \t   | REMARKS \t   |");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        
            for(int i = 0;i < nums;i ++){
        
            gr[i].viewGrades();
        
        }
            
        
    }
    
}
