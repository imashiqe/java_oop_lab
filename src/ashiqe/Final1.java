/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashiqe;

/**
 *
 * @author Ashiqe
 */
public class Final1 {
    final int a = 10;

    Final1() {
        // Attempting to modify 'a' here would cause an error
        // a = 20; // This line is causing the error
        System.out.println("a=" + a);
    }

    public static void main(String[] args) {
        Final1 ob = new Final1();
        ob.d();
    }

    // Adding a method 'd' to demonstrate usage
    public void d() {
        System.out.println("Method d() called.");
    }
}
