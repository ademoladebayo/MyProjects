//THE ACCOUNT PROGRAM TO SHOW AMOUNT DEBITED
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */ 
import java.util.Scanner; 
import static java.lang.System.out;
public class account {  
    // INSTANCE VARIABLE WITH PUBLIC ACCESS MODIFIER
   public double amountDebited;
    // METHOD CREATED
    public void debit(){ 
     out.println("YOU DEBITED " + amountDebited );
     
     
      
      }
      
      
      
    }
 
//TEST APPLICATION
class accountTest{     
//MAIN METHOD
public static void main(String[]args){ 
     Scanner input = new Scanner(System.in);  
      out.print("HOW MUCH DO YOU HAVE LEFT IN YOUR ACCOUNT :"); 
      double bal = input.nextDouble(); 
      out.print("HOW MUCH DO YOU WANT TO WITHDRAW :"); 
      double amountDebited = input.nextDouble(); 
      if (amountDebited > bal) { 
      out.println("TRANSACTION DENIED!!!!");
      out.println("INSUFFICENT FUND"); 
      
      }  
      else { 
      double TotalBalance = bal - amountDebited; 
      out.println("YOUR NEW BALANCE = "+ TotalBalance ); 
      out.println("--------------------------------------");
        //CREATING NEW OBJECT FROM CLASS ACCOUNT
       account d = new account(); 
      d.amountDebited = amountDebited; 
      d.debit();
     out.println ("-------------TRANSACTION SUCCESSFULL-------------------");
}  
     
      
} 
}
