/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenumber;

/**
 *
 * @author students
 */
import java.util.Scanner;
public class PalindromeNumber {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int Num = input.nextInt();
       int reversedNum = 0;
       int originalNum = 535;
       while (Num != 0) {
           int remainder = Num % 10;
           reversedNum = reversedNum * 10 + remainder;
           Num /= 10;
       }
       if (originalNum == reversedNum) {
           System.out.println(originalNum + " is a palindrome.");
       } else{
           System.out.println(originalNum + " is not a palindrome number.");
       }
    }
    
}
