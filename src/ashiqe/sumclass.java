/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashiqe;

/**
 *
 * @author DIU
 */
public class sumclass {
    int  a = 10, b =5;
    
    void  sum(int  a , int b)
    {                                                                         
         a= a;
         b = b;
    }
    void display()
    {
         System.out.println(a+b);
    }
    
     public static void main(String[] args)
    {
        sumclass ob = new sumclass();
        ob.sum(8, 6);
        ob.display();
    }
}
