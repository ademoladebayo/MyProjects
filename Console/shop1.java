/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
 class shopp{
    public static void foods(String food1, String food2,String food3){ 
       food1 = "bread and egg"; 
       food2 = "porrage"; 
       food3 = "rice";
     System.out.println("WE SELL " + food1 + " AND " + food2+" AND " + food3);           
    }
}


  

 class shop{ 
     
    public static void main(String[]args){  
      
       String  cloth1 = "gucci top"; 
       String cloth2 = "native wear";
            
      shopp f = new shopp(); 
       f.foods(cloth1,cloth2,null); 
       System.out.println("WE SELL " + cloth1 + " AND " + cloth2);
    }
}

