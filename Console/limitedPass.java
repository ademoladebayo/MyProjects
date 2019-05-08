
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class limitedPass {
    public static void main(String[]args){  
        Scanner input = new Scanner(System.in); 
        String pass;  
        int n = 1;
        System.out.println("ENTER THE PASSWORD"); 
        pass = input.nextLine(); 
        if ( pass.equalsIgnoreCase("adebayo")) { 
            System.out.println("LOG IN SUCCESSFULL!!!"); 
            } 
        
        
        else if (pass != "adebayo") { 
             while(n == 1){ 
             
              for(int c = 1; c<6; c++){
          
            System.out.println("YOU HAVE ENTERED A WRONG PASSWORD, PLEASE TRY AGAIN");   
               pass = input.nextLine();  
               
               
               if ( pass.equalsIgnoreCase("adebayo")) { 
                   n = 2; 
                   c = 7;
                   
            System.out.println("LOG IN SUCCESSFULL!!!");  
            
            } 
               
                if ( pass.equalsIgnoreCase("adebayo") && (c==5)) { 
                   n = 2; 
                   c = 7;
                   
            System.out.println("LOG IN SUCCESSFULL!!!");  
            
            }  
                if( c == 5 && pass != "adebayo"){ 
               n = 2; 
                System.out.println("NO OF ATTEMPTS EXCEEDED"); 
               
               }
        
               
          } 
              
               
          }
         
         }
             
                   
               } 
           
            } 
                
        
       
          
         
         
        
        
        
         
    
       

    
