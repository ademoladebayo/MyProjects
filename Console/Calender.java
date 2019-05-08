
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
public class Calender { 
    public static void main(String [] args){ 
        System.out.println("MON TUES WEDS THUR FRI SAT SUN"); 
        System.out.println("                   1    2   3");
        System.out.println(" 4   5    6   7    8    9  10");
        System.out.println(" 11  12  13   14   15  16  17");
        System.out.println(" 18  19  20   21   22  23  24"); 
        System.out.println(" 25  26  27   28   29  30  31"); 
        
        int date ; 
        Scanner input = new Scanner(System.in); 
        System.out.println("INPUT THE DATE YOU WANT TO CHECK");
        date = input.nextInt(); 
        System.out.println("   ");
         if (date == 4 || date == 11 || date == 18 || date == 25){
             System.out.println("IT A MONDAY AND A WEEKDAY"); 
             } 
         if (date == 5 || date == 12 || date == 19 || date == 26){
             System.out.println("IT A TUESDAY AND A WEEKDAY"); 
             } 
         if (date == 6 || date == 13 || date == 20 || date == 27){
             System.out.println("IT A WEDNESDAY AND A WEEKDAY"); 
             } 
         if (date == 7 || date == 14 || date == 21 || date == 28){
             System.out.println("IT A THURSDAY AND A WEEKDAY"); 
             } 
         if (date == 8 || date == 15 || date == 22 || date == 29){
             System.out.println("IT A FRIDAY AND A WEEKDAY"); 
             } 
         if (date == 9 || date == 16 || date == 23 || date == 30){
             System.out.println("IT A SATURDAY AND A WEEKEND"); 
             } 
         if (date == 10 || date == 17 || date == 24 || date == 31){
             System.out.println("IT A SUNDAY AND A WEEKEND");  
             }  
         
         
    } 
        
        
    }
    
