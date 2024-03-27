/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashiqe;

/**
 *
 * @author Ashiqe
 */
public class veriableLength {
        public static void main(String[] args) {
        int sum1 = calculateSum(1, 2, 3, 4, 5);
        System.out.println("Sum 1: " + sum1);

        int sum2 = calculateSum(10, 20, 30);
        System.out.println("Sum 2: " + sum2);
    }

    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
