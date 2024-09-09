
package romo;

public class Salaries {
    
    String Name, Id;
    double rateH, hour, deduc;
   
     public void addSalaries(String Ename, String EId, double ErateH, double Ehour, double Ededuc){
       this.Name = Ename;
       this.Id = EId;
       this.rateH = ErateH;
       this.hour = Ehour;
       this.deduc = Ededuc;
    }
     
       
       
      public void viewSalaries(){
        
    double gross = this.rateH * this.hour;
    double netPay = gross - this.deduc;
          
          System.out.printf("| %-10s | %-10s | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f |\n",this.Id, this.Name, this.rateH, this.hour,gross, this.deduc, netPay);
          
    }
      

}