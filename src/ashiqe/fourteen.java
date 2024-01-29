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
public class fourteen {
    int a = 10;
    int b = 5;
    
    void  sum(int x, int y)
    {
        a = x;
        b = y;
    }
    void display()
    {
         System.out.println(a+b);
         
    }
    
    public static void main()
    {
        fourteen ob = new fourteen();
                  ob.sum(8,6);
                  ob.display();
    }
}
