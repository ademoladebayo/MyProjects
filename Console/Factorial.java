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
 public class Factorial {
     
     static long fact(int n){ 
     long f = 1;    
     if(n<=1){
         return 1;
     }else{  
       
     for(int i=n; i>=2; i-- ){
         f *= i;
         System.out.println(i);
     }
    }
     
    return f; }
  
     
       void fact1(int n){ 
     long f = 1;    
     if(n<=1){
       System.out.println("THE FACTORIAL IS " + 1);
     }else{  
       
     for(int i=n; i>=1; i-- ){
         f *= i;
         System.out.println(i);
     }
    }
     System.out.println("THE FACTORIAL IS "+ f);
  
      } 
 
 
     

public static void main(String[] args) 
{ 
     
  System.out.println("WHICH NUMBER WILL YOU LIKE TO GET IT FACTORIAL ? ");  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(); 
  Factorial fac = new Factorial();
  fac.fact1(n);
  System.out.println("THE FACTORIAL IS "+ fact(n));
  
} 
 }
    
    

