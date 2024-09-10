
package romo;


public class Grades {
     
    String name, id;
    double p, m, pf, f;
     
    public void addGrades(String sname,String sid, double sp,double sm,double spf,double sf){
        
    this.name = sname;
    this.id = sid;
    this.p = sp;
    this.m = sm;
    this.pf = spf;
    this.f = sf;
        
    }
    
    public void viewGrades(){
     
    double average = (this.p + this.m + this.pf + this.f) /4;   
    String remarks = (average > 3.0) ? "Failed" : "Passed";
             
        System.out.printf("| %-10s | %-10s | %-10.2f   | %-10.2f       | %-10.2f         | %-10.2f  | %-10.2f        | %-10s    |\n", this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);    
        
        
    }
    
}
