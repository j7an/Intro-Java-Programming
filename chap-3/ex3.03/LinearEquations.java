/* A linear equation can be solved using Cramer’s rule given in Programming
Exercise 1.13. Write a program that prompts the user to enter a, b, c, d, e,
and f and displays the result. If ad - bc is 0, report that “The equation has no
solution.”
*/

import java.util.Scanner;

public class LinearEquations {
  public static void main(String[] args) {
    // double a = 3.4;
    // double b = 50.2;
    // double e = 44.5;
    // double c = 2.1;
    // double d = .55;
    // double f = 5.9;
    double x, y;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a, b, c, d, e, f: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();
    
    if ((a * d - b * c) == 0) {
      System.out.println("The equation has no solution");
    } else {
      x = (e * d - b * f) / (a * d - b * c);
      y = (a * f - e * c) / (a * d - b * c);
      System.out.println("x is " + x + " and y is " + y);
    }
    // System.out.println("x: " + x);
    // System.out.println("y: " + y);
  }
}