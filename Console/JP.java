
/**
 *
 * @author ADEBAYO ADEMOLA SSE|016|17037
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class JP {
 int pri,qy;   String itm, FinalOutput= ""; 
 //CONSTRUCTOR  rd
 public JP(int p, int q){
 pri =p;    
 qy = q; 
 }
//METHOD FOR GROSSPAY   
 public float grossPay(){ 
  return pri*qy;
  }
//METHOD FOR DISCOUNT 
 public double dis(){ 
 if(qy > 10){
   return (0.1 * grossPay());     
  }    
 else if(qy>=6 && qy<=10){ 
 return (0.05 * grossPay());   
  }
 else if(qy == 5){ 
  return (0.03 * grossPay()); 
 }
else{
  return 0.0;
  }
}  
//METHOD FOR NETPAY   
public double netpay(){ 
  return (grossPay() - dis());
  }
//MAIN METHOD  
public static void main (String[]args){
    DecimalFormat DF = new DecimalFormat("0.0");  
     float TOTgp = 0,TOTnp = 0,TOTdis = 0; 
     String  FinalOutput= "";
    Scanner sc = new Scanner(System.in);
    String order = "y"; 
    int n = 1;
    while(order.equalsIgnoreCase("y")){
    System.out.println("--------------ORDER-" + n + "------------------");     
    System.out.println("WHICH ITEM WOULD YOU LIKE TO BUY ?");
   String itm = sc.next();
    System.out.println("HOW MANY PACKET OF " + itm + " WOULD YOU LIKE TO BUY ?");
   int  qy = sc.nextInt();
    System.out.println("WHAT IS THE UNIT PRICE OF " + itm + " ?" );
   int pri = sc.nextInt();
    //CREATING OBJECT OF THE CLASS
    JP sales = new JP(pri,qy);
    //INVOICE ACCUMULATOR
    FinalOutput += "\n" + n + "\t"+ itm +"\t\t"+qy+"\t"+ pri+"\t\t"+ DF.format(sales.dis()) +"\t\t"+ DF.format(sales.netpay());
    TOTgp += sales.grossPay();
    TOTdis  += sales.dis();
    TOTnp += sales.netpay();
    //CONDITION TO TAKE ANOTHER OTHER
    System.out.println("WOULD YOU LIKE ANYTHING ELSE y/n?");
    order = sc.next();
    n++;
    System.out.println("--------------------------------------");
    System.out.println(" "); 
    }
    System.out.println("S/N\tITEM\tNO OF PACKET\tUNIT_PRICE\tDISCOUNT\tTOTAL_PAYABLE");
    System.out.println(FinalOutput);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("\t\t\t\t\t\t TOTAL_GROSS PAY      :" + TOTgp +"\n"
                      +"\t\t\t\t\t\t TOTAL_DISCOUNT GIVEN :" + TOTdis+"\n" 
                      +"\t\t\t\t\t\t NET PAYABLE          :" + TOTnp +"\n" 
                      +"        " + "\n"
                      +"        " + "\n"
                      +"\t\t\t\t\t\t -------------------------------"+ "\n"
                      +"\t\t\t\t\t\t              Manager     ");
}
}