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
public class diuclass {
    int a,b;
    
    diuclass(){
      System.out.println("DIU");
    }
    
    diuclass(int i, int j)
    {
        a =i;
        b = j;
        
        System.out.println(a+b);
                
    }
    
    public static void main(String[] args)
    {
        diuclass ob = new diuclass();
        diuclass ob2 = new diuclass(5,7);
    }
}
