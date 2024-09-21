
package romo;

import java.util.Scanner;

public class Salary {
    

    
    public void getSalary(){
     
Scanner scan = new Scanner(System.in);

   Salaries[] sr = new Salaries[100];
      
    System.out.print("\nEnter no. of Employees: ");
    int nume = scan.nextInt();
    
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
    System.out.println("| ID \t     | NAME \t  | RATE       | HOURS \t    | GROSS \t | DEDUCTION  | NETPAY \t   |");
    System.out.println("--------------------------------------------------------------------------------------------");
        for(int i = 0; i < nume; i++){
            
           sr[i].viewSalaries();
     
    }
    System.out.println("--------------------------------------------------------------------------------------------");
    
    double tsr = 0;
    double ted = 0;
    double tnp = 0;
    
    for(int i = 0; i < nume; i++){
    
    tsr = tsr + (sr[i].rateH * sr[i].hour) ;
    ted = ted + sr[i].deduc;
    tnp = tnp +((sr[i].rateH * sr[i].hour)-sr[i].deduc);
    
    
    }
    
        System.out.println("Total Salary Request: "+tsr);
        System.out.println("Total Employee Deduction: "+ted);
        System.out.println("Total Net Pay: "+tnp);
        System.out.println("No. of Employees: "+nume);
        

    
    }
    
}
