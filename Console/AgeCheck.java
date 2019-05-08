/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class AgeCheck {
    public static void main(String[]args){
    for(int number = 1; number <= 100; number++) {
        if(number % 10 == 0 && number > 0)
            System.out.println(number);
        else
            System.out.print(number + " ");
    }
    
     int n = 2;
     
     System.out.println(n++);
   
}
}