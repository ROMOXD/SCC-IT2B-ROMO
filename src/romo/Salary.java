
package romo;

import java.util.Scanner;

public class Salary {
    
    public void getSalary(){
     
Scanner scan = new Scanner(System.in);

   Salaries[] sr = new Salaries[100];
      
    System.out.print("Enter no. of Employees: ");
    int nume = scan.nextInt();
    
    if(nume > 100){
   
       System.out.println("Exceed Maximum Capacity!!");
       
    }
      else{break;}
    for(int i = 0; i < nume; i++){
        
        System.out.println("Enter details of Employee "+(i+1)+":");
        System.out.print("Enter ID: ");
        String Id = scan.next();
        System.out.print("Enter Name: ");
        String Name = scan.next();
        System.out.print("Enter Rate(Hourly): ");
        double rateH = scan.nextDouble();
        System.out.print("Enter Hours Worked: ");        
        double hour = scan.nextDouble();
        System.out.print("Enter Deduction: ");
        double deduc = scan.nextDouble();
        
        sr[i] = new Salaries();
        sr[i].addSalaries(Id, Name, rateH, hour, deduc);
        
   
    }
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("| Id \t     | Name \t  | Rate       | Hours \t    | Gross \t | Deduction  | NetPay \t   |");
    System.out.println("--------------------------------------------------------------------------------------------");
        for(int i = 0; i < nume; i++){
            
           sr[i].viewSalaries();
     
    }
    System.out.println("--------------------------------------------------------------------------------------------");
    
    tsr = gross + i++;
    
        System.out.println("Total Salary Request: "+);
        System.out.println("Total Employee Deduction: "+);
        System.out.println("Total Net Pay: "+);
        System.out.println("No. of Employees: "+);
    
    }
    
}
