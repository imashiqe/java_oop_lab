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
public class thisprogram {
    int a = 10, b =5;
    
    void sum(int a , int b)
    {
         this.a=a;
         this.b=b;
         
    }
    void display()
    {
        System.out.println(a+b);
    }
    
     public static void main(String[] args)
    {
        thisprogram ob = new thisprogram();
                    ob.sum(8, 6);
                    ob.display();
    }
}
