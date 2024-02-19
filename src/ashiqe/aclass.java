/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashiqe;

/**
 *
 * @author Lab5-05
 */
public class aclass {
    void dis()
    {
      System.out.println("Day71");
      this.dis();
    }
    void dis2()
    {
      System.out.println("Day 72");
    }
    
    public  static void main(String[] args)
    {
      aclass ob = new aclass();
             ob.dis();
    }
}
