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
public class method {
    
    
    static void sum(int a,int b){  
     Scanner sc = new Scanner(System.in);   
     int c = 0;
    if (a<0 && b<0){ 
        
    System.out.println("ENTER FIRST NUMBER"); 
    a = sc.nextInt();
    System.out.println("ENTER SECOND NUMBER"); 
    b = sc.nextInt(); 
    c = a+b;
   
   }else if(a<0) { 
       
   System.out.println("FIRST NUMBER IS NEGATIVE PLEASE ENTER A POSITIVE ONE");
   a = sc.nextInt();
   
   if(b<0){ 
   System.out.println("SECOND NUMBER IS NEGATIVE PLEASE ENTER A POSITIVE ONE");    
   b = sc.nextInt();   
   } 
    
   c= a+b;
   }
   else{
       c = a+b;
   }
   
    System.out.println("sum is "+ c);
    
    }
    
      static void display(){ 
     System.out.println("HELLO");
   
    
    
    }
    
    
    
    
    
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER FIRST NUMBER"); 
   int b = sc.nextInt();
    System.out.println("ENTER SECOND NUMBER"); 
   int c = sc.nextInt(); 
   
   method.sum(c, b);
   method.display();
    }
    
    
    
    
    
}
