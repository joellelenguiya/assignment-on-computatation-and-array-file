/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author STUDENTS
 */
public class Fibonacci {

    public static void main(String[] args) {
       int sum = 0;
       int a = 1;
       int b = 2;
       while (b <= 40000000) {
           if (b % 2 == 0) {
               sum += b;
           }
           int c = a + b;
           a = b;
           b = c;
       }
       System.out.println(sum);
    }
    
}
