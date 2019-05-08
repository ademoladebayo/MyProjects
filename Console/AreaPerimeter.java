import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		// display message
		System.out.println("Welcome to the area and perimeter calculator");
		
		// create an object of scanner class
		Scanner input = new Scanner(System.in);
		
		// formating
	
		String choice; 
	    choice = "y";
		
		// to get user input 
	    while ("y".equals(choice)) {
		System.out.print("Enter length: ");
		int length = input.nextInt();
		
		System.out.print("Enter width: ");
		int width = input.nextInt();
		
		// initialization
		double area = length * width;
		double perimeter = 2 * length + 2 * width;
		
		// display result
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		System.out.println("Continue? (y/n): ");
	         choice = input.nextLine(); 
	         
	    } 
	    
		
		
		
		
		

	}

}
