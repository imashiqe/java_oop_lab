/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashiqe;
import java.util.*;  
/**
 *
 * @author Ashiqe
 */
public class hashMapDuplicate {
     public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();   
   map.put(1,"Mango");  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(1,"Grapes"); 
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}
