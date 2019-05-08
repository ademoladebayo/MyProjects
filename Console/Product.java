//CREATING CLASSES AND THEIR PROPERTIES
import java.util.Scanner; 
import java.text.DecimalFormat;
 class Product { 
     int n; 
     
     
     public Product(int n1){
     n = n1;
     
     }
     
     public double sq(){ 
         return Math.pow(n, 2);
     
     }  
     
      public double sqrt(){ 
      return Math.sqrt(n);
     }  
       public double cb(){ 
        return Math.pow(n, 3);
     }  
       
        public double cbrt(){ 
      return Math.cbrt(n);
     }  
        
        public static void main(String[]args){
        Scanner sc = new Scanner (System.in);  
        DecimalFormat df = new DecimalFormat("0.00");
       System.out.println("ENTER 1 - N"); 
       int   n = sc.nextInt(); 
       for (int i=1; i<=n; i++){ 
       
       Product p = new Product(i) ; 
       System.out.println(i +"\t " + df.format(p.sq()) + "\t " + df.format(p.sqrt()) + "\t " + df.format(p.cb()) + "\t " +df.format(p.cbrt()));
       
       }
        
        
        }
     
  
}


