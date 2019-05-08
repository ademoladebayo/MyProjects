import java.util.Scanner; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ADEBAYO ADEMOLA AYOBAMI
 */  

//PROGRAM THAT ALLOWS USER CALCULATE AREA AND PERIMETER OF SOME SPECIFIC SHAPES
public class AreaAndPerimeterOfShapes {
    public static void main(String [] args){ 
    int choice ;  
    System.out.println(" ");
    System.out.println("ENTER THE COORESPONDING NUMBER OF THE SHAPE YOU WOULD LIKE TO CALCULATE IT AREA AND PERIMETER " + "\n" 
                       +"1. FOR RECTANGLE " + "\n" 
                       +"2. FOR TRAPEZOID " + "\n" 
                       +"3. FOR CIRCLE " + "\n"  
                       +"4. FOR PARALLELOGRAM  " + "\n"  
                       +"5. FOR SQUARE " + "\n" 
                       +"6. FOR TRIANGLE " + "\n" 
                       +"7. TO CLOSE THE PROGRAM " + "\n");   
                       Scanner sc = new Scanner(System.in); 
                       choice = sc.nextInt();  
    
    switch (choice){ 
        //PARALLELOGRAM CASE
        case 4: System.out.println("YOU HAVE CHOOSEN PARALLELOGRAM");
                System.out.println("INPUT THE BASE AND HEIGHT "); 
                System.out.println();  
                double bA,hE,L1,L2; 
         bA = sc.nextDouble();
         hE = sc.nextDouble();
         double area = bA * hE;   
         System.out.print("  ");  
         System.out.print("INPUT THE 2 LENGHT OF THE PARALLELOGRAM");  
         L1 = sc.nextDouble(); L2 = sc.nextDouble(); double pE = 2 *( L1 + L2);  
        System.out.println("THE AREA IS " + area + " AND THE PERIMETER IS " + pE );  
        break; 
            
        //SQUARE CASE    
       case 5: System.out.println("YOU HAVE CHOOSEN SQUARE"); 
               System.out.println("INPUT THE LENGHT ");  
               double lE; lE = sc.nextDouble();
               double AR = Math.pow(lE,2); double p =  4*lE; 
               System.out.println("THE AREA IS " + AR + " AND THE PERIMETER IS " + p ); 
        break;
           
       //TRIANGLE CASE    
       case 6: System.out.println("YOU HAVE CHOOSEN TRIANGLE"); 
                System.out.println("INPUT THE BASE AND HEIGHT ");  
           double BaSE,H,A,B,C; 
         BaSE = sc.nextDouble();   H = sc.nextDouble();
         double Area = 0.5 * BaSE * H;     
         System.out.print("INPUT THE 3 LENGTH OF THE TRIANGLE");  
        double le1 = sc.nextDouble(); double le2 = sc.nextDouble(); double le3 = sc.nextDouble();
        double Per =  le1 +  le2 +  le3; 
        System.out.println("THE AREA IS " + Area + " AND THE PERIMETER IS " + Per );  
        break; 
           
       //RECTANGLE CASE    
       case 1: System.out.println("YOU HAVE CHOOSEN RECTANGLE "); 
                System.out.println("INPUT THE LENGHT AND WIDTH ");  
                double Len,WID,l1,l2,l3,l4; 
         Len = sc.nextDouble();WID =  sc.nextDouble() ;double ARea = Len * WID;
         System.out.print("INPUT THE FOUR SIDE OF THE RECTANGLE");  
         l1 = sc.nextDouble(); l2 = sc.nextDouble();l3 = sc.nextDouble();  l4 = sc.nextDouble();
         double PER = l1+ l2 + l3+l4; 
         System.out.println("THE AREA IS " + ARea + " AND THE PERIMETER IS " + PER );  
            break;
           
       //TRAPEZOID CASE    
       case 2: System.out.println("YOU HAVE CHOOSEN TRAPEZOID"); 
                System.out.println("INPUT THE VALUE OF THE TWO BASE AND HEIGHT ");  
                double B1,B2,Height,D,E; 
         B1 = sc.nextDouble();  B2 = sc.nextDouble(); Height = sc.nextDouble();
         double AREa = ((B1 + B2)/2) * Height;   
         System.out.print("  ");  
         System.out.print("INPUT THE LEFT AND RIGHT SIDE OF THE TRAPEZOID");  
         D = sc.nextDouble(); E=  sc.nextDouble(); 
        double PeR = D + B1 + B2 + E; 
        System.out.println("THE AREA IS " + AREa + " AND THE PERIMETER IS " + PeR );  
            break;  
           
           
        //CIRCLE CASE   
        case 3: System.out.println("YOU HAVE CHOOSEN CIRCLE"); 
                System.out.println("INPUT THE RADIUS OF THE CIRCLE ");  
                double R,PI= 3.142; 
         R = sc.nextDouble();
        double Ar = PI *(R * R);   
        double c = 2 * PI * R;
         System.out.print("  ");  
        System.out.println("THE AREA IS " + Ar + " AND THE CIRCUMFRENCE IS " + c );  
        break; 
            
            //EXIT CASE   
        case 7:  
       System.out.println("PROGRAM ENDED!!! ");  
       System.exit(0);
        break; 
       
    }
    }
    
    }