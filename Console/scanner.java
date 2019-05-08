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
public class scanner { 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] A = new int[3][3];   int [][] B = new int[3][3];   int [][] C = new int[3][3]; int cc1= 0, cc2= 0 , sum = 0 , c1=0, c2=0; String out1 = "" , out2 = "" ,out3 = "";
       
        
        System.out.println("VALUES OF MATRIX A"); 
        for(int i =0; i<A.length; i++){
             for(int j =0; j<A[0].length; j++){
                 System.out.println("ENTER VALUE AT ROW " + (i+1) + " COL " + (j+1)); 
                 A[i][j]= sc.nextInt(); 
            } 
        }   
        
        
        
        
         
         
        System.out.println("VALUES OF MATRIX B"); 
        for(int i =0; i<A.length; i++){
             for(int j =0; j<A[0].length; j++){
                 System.out.println("ENTER VALUE AT ROW " + (i+1) + " COL " + (j+1)); 
                 B[i][j]= sc.nextInt(); 
            } 
        }  
        
        
        
          
          
          
        int r1 = 0;
        int r2 = 0;
        
        for( ; ;  ){
              cc1 = 0; 
             
             for( ; ; ){
               int p =  A[r1][cc1] *  B[r2][cc2];
               sum +=p; 
                  cc1++;  
                  r2++;
            if(r2 == 2){  
                r2=0;
                break;
            }
            }  
         
                cc2++;
             if (cc2<2){
                 r1 = 0;
             } 
             else { 
             r1++; 
             cc2=0;
      
             
             }  
                if ((cc2 ==2) &&( r2 ==2)){
              break;
             } 
             
        } 
        
        
        
        
        
     
} 

        
}  
    
      
    
    
    
    
    
    

