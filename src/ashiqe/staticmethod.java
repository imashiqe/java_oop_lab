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
public class staticmethod {
    
    
    int a;
    static int b;
    
    void display()
    {
         System.out.println(a);
         System.out.println(b);
         
    }
    
    void display2()
    {
        System.out.println(a);
        System.out.println(b);
    }
    
    public static  void main()
    {
      staticmethod ob = new staticmethod();
        ob.display2();
    }
    
}
