/* Write a program that reads an integer between 0 and 1000 and adds all the
digits in the integer. For example, if an integer is 932, the sum of all its
digits is 14.

Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/

package chap_02;

import java.util.Scanner;

public class Ex2_06_SumDigitsInteger {
  public static void main(String[] args) {
    int value = -1,
      total = 0;
    
    Scanner input = new Scanner(System.in);
    while (value < 0 || value > 1000) {
      System.out.print("Enter a number between 0 and 1000: ");
      value = input.nextInt();
    }
    
    while (value > 0) {
      total += value % 10;
      value /= 10;
    }
    
    System.out.println("The sum of the digits is " + total);
  }
}