
package romo;


public class Accounts {
    
      String id, lName, fName, email, userN, pass;
    
    public void addAccounts(String Aid,String AlName,String AfName,String Aemail,String AuserN,String Apass){
    
    this.id = Aid;
    this.lName = AlName;
    this.fName = AfName;
    this.email = Aemail;
    this.userN = AuserN;
    this.pass = Apass;
    
    }
    public void viewAccounts(){
    
    
    
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",this.id, this.lName, this.fName, this.email, this.userN, this.pass);
    
    
    
    }
}
