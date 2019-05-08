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
import javax.swing.JOptionPane;
public class SalesTicket {
    public static void main (String [] args){  
        String  order = "on";   
       String response[] = new String[15];  
       String FinalReply [] = new String[15];
             int reply[] = new int[15];
        int n = 0, TotalBill = 0 , sum  = 0 , c = 0 ,print = 0;
        int rice = 50 , beans = 50  , yam_porrage = 70 , amala = 50,pounded_yam = 50 , semo = 50,indomie = 75 ,egg = 50, fish = 50, meat = 50 , plantain = 10 , salad = 50; 
        Scanner input = new Scanner(System.in); 
        System.out.println("             THESE ARE THE FOOD ITEMS AVAIABLE             ");
    System.out.println("-----------------------------------|-------------------------------");
    System.out.println("ITEMS AVAIABLE                     |                   PRICE(NGN)"); 
    System.out.println("-----------------------------------|-------------------------------");
    System.out.println("1.RICE                             |                   50\n"  
                     + "2.BEANS                            |                   50 \n"
                     + "3.YAM PORRAGE                      |                   70\n"                  
                     + "4.AMALA                            |                   50 \n"
                     + "5.POUNDED YAM                      |                   60 \n"
                     + "6.SEMO                             |                   50 \n"
                     + "7.INDOMIE                          |                   75 \n"
                     + "8.EGG                              |                   50 \n"
                     + "9.FISH                             |                   50 \n"
                     + "10.MEAT                            |                   50 \n" 
                     + "11.PLANTAIN                        |                   10 \n"
                     + "12.SALAD                           |                   50 \n" 
                     +"-------------------------------------------------------------------"); 
    System.out.println(" "); 
   
    System.out.println(" WHAT WOULD YOU LIKE TO BUY ?"); 
    response[c]  = input.nextLine(); 
     while (order.equalsIgnoreCase("on")) { 
   
    if (response[c].equalsIgnoreCase("rice")) {  
        System.out.println(" HOW MANY SPOON OF RICE ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = rice * reply[c]; 
        sum = sum + TotalBill; 
        String finalreply = String.valueOf(reply[c]);  
        finalreply =  "      X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;
    } 
    else if (response[c].equalsIgnoreCase("beans") ){ 
         System.out.println(" HOW MANY SPOON OF BEANS ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = beans * reply[c]; 
        sum = sum + TotalBill; 
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "     X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;
        
        
    } 
    
     else if (response[c].equalsIgnoreCase("yamporrage") ){ 
         System.out.println(" HOW MANY SPOONS OF YAM_PORRAGE ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = yam_porrage * reply[c]; 
        sum = sum + TotalBill; 
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "X" + finalreply  + "              " + TotalBill;;
        FinalReply[c]= finalreply;
        
    } 
    
     else if (response[c].equalsIgnoreCase("amala") ){ 
         System.out.println(" HOW MANY WRAP OF AMALA ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = amala * reply[c]; 
        sum = sum + TotalBill;  
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "     X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;
        
      
    }  
    
     else if (response[c].equalsIgnoreCase("indomie") ){ 
         System.out.println(" HOW MANY INDOMIE ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = indomie * reply[c]; 
        sum = sum + TotalBill;  
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "   X" + finalreply  + "               " + TotalBill; 
        FinalReply[c]= finalreply;
        
      
    }  
     else if (response[c].equalsIgnoreCase("poundedyam") ){ 
         System.out.println(" HOW MANY WRAP OF POUNDED YAM  ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = pounded_yam * reply[c]; 
        sum = sum + TotalBill;  
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;
        
      
    }   
     else if (response[c].equalsIgnoreCase("plantain") ){ 
         System.out.println(" HOW MANY PIECE OF PLANTAIN ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = plantain * reply[c]; 
        sum = sum + TotalBill; 
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "  X" + finalreply  + "              " + TotalBill;;
        FinalReply[c]= finalreply;
        
      
    }   
     else if (response[c].equalsIgnoreCase("egg") ){ 
         System.out.println(" HOW MANY EGG ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = egg * reply[c]; 
        sum = sum + TotalBill; 
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "       X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;
        
      
    }  
     else if (response[c].equalsIgnoreCase("fish") ){ 
         System.out.println(" HOW MANY FISH ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = fish * reply[c]; 
        sum = sum + TotalBill; 
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "      X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;  
        
      
    }  
     else if (response[c].equalsIgnoreCase("meat") ){ 
         System.out.println(" HOW MANY MEAT ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = meat * reply[c]; 
        sum = sum + TotalBill;  
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "      X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;
        
      
    }  
     else if (response[c].equalsIgnoreCase("salad") ){ 
         System.out.println(" HOW MANY SPOON OF SALAD ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = salad * reply[c]; 
        sum = sum + TotalBill;  
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "     X" + finalreply  + "               " + TotalBill;;
        FinalReply[c]= finalreply;
       
        
        
        
      
    }  
     else if (response[c].equalsIgnoreCase("semo") ){ 
         System.out.println(" HOW MANY WRAP OF SEMO ? "); 
        reply[c] = input.nextInt(); 
        TotalBill = semo * reply[c]; 
        sum = sum + TotalBill; 
         String finalreply = String.valueOf(reply[c]);  
        finalreply =  "      X" + finalreply + "               " + TotalBill;
        FinalReply[c]= finalreply;
        
      
    } else { 
     JOptionPane.showMessageDialog(null, "SORRY WE DON'T SELL " + response[c] + ", PLEASE SELECT FROM OUR LIST  "  +  JOptionPane.ERROR_MESSAGE);
       String finalreply = String.valueOf(reply[c]);  
        finalreply =  "   " + "   NULL" + "           " + "NULL(Cancelled)";
        FinalReply[c]= finalreply; 
        
     } 
    
 
    
    System.out.println(" "); 
    c = c + 1;
    System.out.println("WHAT ELSE WOULD YOU LIKE FROM OUR LIST ?.....IF NOTHING,  ENTER 'DONE' TO SIGNIFY YOU ARE THROUGH "); 
    response[c] = input.next(); 
     if (response[c].equalsIgnoreCase("DONE")) { 
         order = response[c]; 
         JOptionPane.showMessageDialog(null, "THANKS FOR YOUR PATRONAGE, PLEASE TAKE YOUR RECEIPT " + JOptionPane.INFORMATION_MESSAGE);
         
     }else{ 
       order = "on"; 
       
     }     
     
     
     
    }  
     print = 0;  
     System.out.println("    "); 
     System.out.println("*****************YOUR RECEIPT*****************");
     System.out.println(          "ITEMS        QUANTITY         PRICE(NGN)");
     while (print <= c-1 ) { 
    System.out.println( print+1 + "." + response[print]    +   "   " + FinalReply[print]);  
    print = print + 1; 
    } 
      System.out.println("-----------------------------------------------\n"  
            +          "TOTAL : "  + sum + "(NGN)" + "\n" 
            +          "-----------------------------------------------\n"); 
} 
}