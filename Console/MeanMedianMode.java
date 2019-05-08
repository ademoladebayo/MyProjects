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
public class MeanMedianMode { 
    
    public static void main(String[]args){  
    //SCANNER    
    Scanner sc = new Scanner(System.in); 
    
     
   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------- ");
   System.out.println("                        PROGRAM TO CALCULATE THE MEAN ,MEDIAN, MODE AND STANDARD DERIVATIVE OF A GIVEN SET OF NUMBER");
   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------- ");
 
   System.out.println("ENTER THE SIZE OF THE ARRAY : "); 
   int n = sc.nextInt(); 
    
   System.out.println("  ");
   
   //ARRAYS OF NUMBERS
   int [] numbers = new int [n]; 
   
   //ARRAY FOR MODE MANIPULATIONS
   int[] numMode = new int [numbers.length]; 
  
  
   //LOOP TO RECEIVE INPUT FROM USER
   for(int i=0; i< numbers.length; i++ ){
   System.out.print("ENTER VALUE " + (i+1) + " :"); 
   numbers[i] = sc.nextInt(); 
    }   
    System.out.println(" ");
   
    
   // SORTING THE ARRAY
   for(int i=0; i<numbers.length; i++){ 
       for(int j=(i+1); j<numbers.length; j++){ 
         if(numbers[i] > numbers[j]){ 
          int temp = numbers[i]; 
          numbers[i] = numbers[j];  
          numbers[j] = temp;
         }
     }
   } 
   
   // LOOP TO CHECK THE HIGHEST RE-OCCURING NUMBER
    for(int i=0; i<numbers.length; i++){ 
        numMode[i]= 0;
       for(int j=(i+1); j<numbers.length; j++){ 
         if(numbers[i] == numbers[j]){  
            numMode[i] += 1; 
        }
     }
   }  
    
    
    
    
     // FINAL SECTION TO DETERMINE THE  MODE
     int  large = 0;
     int index = 0;  
     for( int j=0; j<numbers.length; j++){ 
         if(numMode[j] >  large){  
            large = numMode[j]; 
            index = j;
         }
     } 
     
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
       //PRINTING MY ELEMENTS AFTER SORTING 
     System.out.print("THE VALUES YOU INPUTED AFTER SORTING ARE : ");
     for(int p=0; p<numbers.length; p++){  
        System.out.print(numbers[p] + "\t");
        } 
     System.out.println(" ");
     System.out.println(" ");
   
   
   //CONDITION TO CHECK IF THERE IS A MODE OR NOT
   if (large > 0){
    System.out.println("THE MODE IS " + numbers[(index)] + " OF FREQUECY " + (large+1));
    
    } 
   else{ 
      System.out.println("THERE IS NO MODE IN THIS SET OF NUMBERS ");
   } 
     System.out.println(" ");
   
    //SECTION FOR MEDIAN
     if (numbers.length%2 != 0 ){ 
     int mid = numbers.length / 2; 
     System.out.println("THE MEDIAN IS " + numbers[mid]);
     
     }else{ 
     int mid = numbers.length / 2; 
     System.out.println("THE MEDIAN OF THIS SET OF NUMBERS IS BETWEEN " + numbers[mid-1] + " AND " + numbers[mid] );
     }
       System.out.println(" ");
     
     
     
     
     //SECTION TO GET THE MEAN  
     int sum =0;
     for(int m=0; m<numbers.length; m++){ 
     sum+= numbers[m];
     }
     double mean = (sum / numbers.length); 
     System.out.println("THE MEAN OF NUMBERS INPUTED IS : " + mean);
     System.out.println(" ");
   
     // SECTION FOR STANDARD DERIVATIVE
     double var = 0; 
     double std = 0;
     for (int i=0; i<numbers.length; i++){ 
     var += Math.pow((numbers[i] - mean),2);  
     var = var/numbers.length;
     std = Math.sqrt(var);
     
     }
     System.out.println("THE STANDARD DERIVATIVE IS : " + std);
     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
    
    
    
    
    } 
    
    
    
    
    
    
}
