/* Write a program that prompts the user to enter values for a, b, and c and
displays the result based on the discriminant. If the discriminant is positive,
display two roots. If the discriminant is 0, display one root. Otherwise,
display “The equation has no real roots”.
*/

package chap_03;

import java.util.Scanner;

public class Ex3_01_QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a, b, c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    
    double discriminant = Math.pow(b, 2) - (4 * a * c);
    
    if (discriminant > 0) {
      double root1 = (-1 * b + Math.sqrt(discriminant)) / 2 * a;
      double root2 = (-1 * b - Math.sqrt(discriminant)) / 2 * a;
      System.out.println("The equation has two roots " + root1 + " and " + root2);
    } else if (discriminant == 0) {
      double root = (-1 * b + Math.sqrt(discriminant)) / 2 * a;
      System.out.println("The equation has one root " + root);
    } else {
      System.out.println("The equation has no real roots");
    }
  }
}