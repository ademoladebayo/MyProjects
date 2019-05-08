
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
public class GradeBookTest1 { 
    public static void main (String[]args){ 
        Scanner input = new Scanner(System.in); 
        System.out.print("ENTER COURSE NAME : "); 
        String coursename = input.nextLine(); 
        
        
        GradeBook1 book = new GradeBook1(); 
        book.displayName(coursename);
        
    }
    
}
