
import static java.lang.System.out;
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
class SimpleIfDemo {
    // create scanner object 
    public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in); 
        String pass;  
        int n = 1;
        System.out.println("ENTER THE PASSWORD"); 
        pass = input.nextLine(); 
        if ( pass.equalsIgnoreCase("adebayo")) { 
            System.out.println("LOG IN SUCCESSFULL!!!"); 
            } 
         else{ 
            while(!pass.equals("adebayo")){
            System.out.println("YOU HAVE ENTERED A WRONG PASSWORD, PLEASE TRY AGAIN");   
            pass = input.nextLine();
            if(n > 3){
               System.out.println("YOU HAVE REACHED YOUR LIMIT");   
               System.exit(0);  
            }
            n++;
        }
            System.out.println("LOG IN SUCCESSFULL!!!");
        }
    
    }
 }
