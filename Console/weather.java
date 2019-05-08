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
public class weather {
    public static void main(String[]args){  
    Scanner sc = new Scanner(System.in);  
    System.out.println("------------------------------------------------------------------------------------------------------ ");
    System.out.println(" \t\t PROGRAM TO STORE AND ACCESS RAINFALL DATAS IN A 2D ARRAY ");
    System.out.println("------------------------------------------------------------------------------------------------------ ");
    System.out.println(" "); 
    System.out.print("ENTER THE NUMBER OF ROW :");
    int r = sc.nextInt();
    System.out.print("ENTER THE NUMBER OF COL : ");
    int c = sc.nextInt();  
    System.out.println(" "); 
    System.out.println(" ");
    
    // DECLARATION OF 2D ARRAY
    float [][] rainFall = new float [r][c]; 
    
  
    //INTIALIZATION OF THE ARRAY
    for (int i=0; i<r; i++){  
        
       for (int j=0; j<c; j++){ 
       System.out.print("ENTER THE RAINFALL AT ROW " + (i+1) + " AND " + " COL " +(j+1) + " :");
       rainFall[i][j] = sc.nextFloat();
        
    }
    } 
    
    
    System.out.println(" ");
    System.out.println("------------------------------------------------------------------------------------------------------ ");
    System.out.println(" "); 
    System.out.println("    THE RAIN FALL TABLE OF ROW " + r + " AND COL " + c); 
     System.out.println(" "); 
     //PRINTING OUT MY ARRAY CONTENT
     System.out.println("DAYS\tDAY1\tDAY2\tDAY3\tDAY4\tDAY5  ") ; 
     System.out.println(" ");
     for (int i=0; i<r; i++){  
     System.out.print("WEEK" + (i+1) + "  "); 
     
     for (int j=0; j<c; j++){ 
         
      System.out.print(rainFall[i][j] + "\t") ; 
        
    }
    System.out.println("\n"); 
    } 
     
    System.out.println(" ");
       
    //WEEKLY MEAN  
     double m = 0;
   for (int i=0; i<r; i++){ 
         int sum = 0;
    
       for (int j=0; j<c; j++){
            sum+=rainFall[i][j]; 
             m = sum/c; 
            
    } 
        System.out.println("THE MEAN FOR WEEK " + (i+1) + " IS " + m);
   }  
   
   
     //OVERALL  MEAN 
   int sum = 0;
   for (int i=0; i<r; i++){ 
         for (int j=0; j<c; j++){
            sum+=rainFall[i][j]; 
            
            
    } 
   }
    
    double overallMean = sum/(r*c);
  
   
   System.out.println("THE OVERALL MEAN IS : " + overallMean); 
   System.out.println(" "); 
    
    //MAXIMUM RAIN FALL 
     double maxRain = rainFall[0][0]; 
     for (int i=0; i<r; i++){ 
       for (int j=0; j<c; j++){
            if (rainFall[i][j] > maxRain){ 
             maxRain = rainFall[i][j];
             }
            }
    }   
    
   
    
    //MAXIMUM RAIN FALL 
     double minRain =  rainFall[0][0]; 
     for (int i=0; i<r; i++){ 
       for (int j=0; j<c; j++){
            if (rainFall[i][j] < minRain){ 
             minRain = rainFall[i][j];
             }
            }
    }   
       System.out.println("THE HIGHEST RAINFALL  IS " + maxRain);  
       System.out.println(" "); 
       System.out.println("THE LOWEST  RAINFALL  IS " + minRain); 
    System.out.println("------------------------------------------------------------------------------------------------------ ");
    
    
    
    
}
}