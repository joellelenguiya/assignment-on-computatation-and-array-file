/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperations;

/**
 *
 * @author students
 */
import java.util.Scanner;
public class ArrayOperations {

   
    public static void main(String[] args) {
          int[] numbers = new int[15];
           Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
         System.out.println("Values stored in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Enter a number to search:");
        int numToSearch = scanner.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numToSearch) {
                found = true;
                index = i;
                break;
            }
        }
           if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[numbers.length - 1 - i] = numbers[i];
             System.out.println("Values stored in the reversed array:");
            System.out.print(reversedNumbers[i] + " ");
        }
        System.out.println();
         int sum = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }
 System.out.println("Sum of all elements in the array: " + sum);
        System.out.println("Product of all elements in the array: " + product);
        
        scanner.close();
        }
    }
