/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADEBAYO ADEMOLA
 */

import java.text.DecimalFormat; 
public class Tables {
    public int a;
    
    //MY CONSTRUCTOR
    public Tables(int NUM){ 
    a = NUM;    
    }
  
    //SPECIAL METHOD FOR THE TABLE
    public void TABLE_CALCULATION(){ 
     DecimalFormat d = new DecimalFormat("0.00");
     System.out.println("NUM\tNUM_SQUARE\tNUM_SQUROOT\tNUM_CUBE\tNUM_CUBEROOT");
     for (int i = a; i<=5; i++){ 
     System.out.println(i+"\t"+ d.format(Math.pow(i,2))+"\t\t"+d.format(Math.sqrt(i))+"\t\t"+d.format(Math.pow(i,3))+"\t\t"+d.format(Math.cbrt(i)));
     System.out.println("\n");
     }
    } 
   
   
   // MAIN METHOD
    public static void main(String[]args){  
   //CREATING AN OBJECT OF THE CLASS 
    Tables t = new Tables(1); 
    t.TABLE_CALCULATION();
   
   }   
  //END PROGRAM
    
    
   
  
  
       
    
    
      
   
       
    

    

}