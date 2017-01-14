/* Write a program that reads the subtotal and the gratuity rate, then computes
the gratuity and total. For example, if the user enters 10 for subtotal and 15%
for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
*/

package chap_02;

import java.util.Scanner;

public class Ex2_05_CalculateTips {
  public static void main(String[] args) {
    double subtotal = 0.0,
      gratuityRate = 0.0,
      gratuity = 0.0,
      total = 0.0;
      
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");
    subtotal = input.nextDouble();
    gratuityRate = input.nextDouble();
    
    gratuity = subtotal * (gratuityRate / 100);
    total = subtotal + gratuity;
    
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}