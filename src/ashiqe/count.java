/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashiqe;

/**
 *
 * @author Lab5-29
 */
public class count {
    
    int count = 0;
    
   void  display()
   {
      count++;
      System.out.println(count);
   }
   
   public static void main()
   {
     count ob1 = new (count);
           ob1.display();
           
           count ob2 = new count();
           
                 ob2 = display();
            count ob3 = new count();
                  ob3.display();
   
   }
}
