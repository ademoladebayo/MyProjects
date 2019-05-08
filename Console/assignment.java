// PROGRAM FOR EMPLOYEE'S 10% RAISED SALARY
import java.util.Scanner; 
import static java.lang.System.out;
class employee{ 
      // creating instance variable 
      public String firstName; 
      public String lastName; 
      public double monthlySalary;  
      double salaryRaised , newSalary;

  
    public employee(String fn,String ln,double ms){ 
        firstName = fn; 
        lastName = ln; 
        monthlySalary = ms; 
      
      }
      
      
      
 
      // set and get format
public void  setfirstName(String fn){ 
 this.firstName = fn;
} 
 
public String getfirstName(){ 
return firstName;
} 
public void  setlastName(String ln){ 
 this.lastName = ln;
} 
 
public String getlastName(){ 
return lastName; 
} 

public void  setmonthlySalary(double ms){ 
 this.monthlySalary = ms;
} 
 
public double getmonthlySalary(){ 
return monthlySalary;
} 

public double salaryRaised(){ 
 return salaryRaised;
}   
public double newSalary(){ 
 return newSalary;
}

}

class employeeCapability{ 
 public static void main(String[]args){ 
     Scanner input = new Scanner(System.in);  
     out.println("ENTER YOUR FIRSTNAME"); 
     String fn = input.nextLine(); 
     out.println("ENTER YOUR LASTNAME"); 
     String ln = input.nextLine() ;
     out.println("ENTER YOUR MONTHLY SALARY"); 
     double ms = input.nextDouble();  
     double yearSalary = ms * 12; 
     double salaryRais = ms * 10/100; 
     double salaryRaised = salaryRais + ms;
     double newSalary = salaryRaised * 12;  
     
      employee ademola = new employee(fn,ln,ms);
     out.printf("DEAR %n%s%n", ademola.getfirstName()+ " " + ademola.getlastName()); 
     out.printf("YOUR MONTHLY SALARY IS = %n%s%n",ademola.getmonthlySalary()); 
     out.printf("YOUR YEARLY SALARY IS = %n%s%n", + yearSalary); 
     out.println(" "); 
    
     employee adebayo = new employee(fn,ln,salaryRaised);
     out.println("     CHANGE OF SALARY AFTER 10% INCREASE       "); 
     out.printf("YOUR NEW MONTHLY SALARY IS = %n%s%n", salaryRaised); 
     out.printf("YOUR NEW YEARLY  SALARY IS = %n%s%n", newSalary);
     
     
     
     
     
 }
}



