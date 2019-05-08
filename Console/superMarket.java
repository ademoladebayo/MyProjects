/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADEBAYO ADEMOLA
 */ 
import java.util.Scanner;
public class superMarket { 
    
   public static void main(String[]args) { 
    
       int  qty = 0 , amt = 0   ,gp = 0;   
       double dis = 0, np = 0; 
       
       amt = 50;
       Scanner sc = new Scanner(System.in);  
       System.out.println("HOW MANY BOOKS WOULD YOU LIKE?"); 
       qty = sc.nextInt(); 
       
       if (qty >= 21){ 
        gp = amt * qty;
       dis = 0.1 * gp; 
       np = gp - dis; 
   
       } 
       else if (qty >= 11 && qty <=20){ 
       gp = amt * qty;
       dis = 0.08 * gp; 
       np = gp - dis;  
    
       } 
       else if (qty >= 6 && qty <=10){ 
       gp = amt * qty;
       dis = 0.08 * gp; 
       np = gp - dis;  
   
       } 
       else if (qty >= 11 && qty <=20){ 
       gp = amt * qty;
       dis = 0.05 * gp; 
       np = gp - dis;  
   
       }
       else if (qty >= 1 && qty <=5){ 
       gp = amt * qty;
       dis = 0.02 * gp; 
        np = gp - dis;  
       }
       else { 
       System.out.println("OUT OF RANGE"); 
   }  
    
       System.out.println("THE GROSS PAY IS " + gp + "\n" 
    +                  "THE DISCOUNT IS " + dis + "\n" 
    +                  "THE NET PAY IS " + np);
    
}
}