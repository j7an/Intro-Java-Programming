/* Given an airplane’s acceleration a and take-off speed v, you can compute the
minimum runway length needed for an airplane to take off using the following
formula:

length = v^2 / 2a

Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
*/

import java.util.Scanner;

public class FindingRunwayLength {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter speed and acceleration: ");
    double velocity = input.nextDouble(),
      acceleration = input.nextDouble();
      
    double length = Math.pow(velocity, 2) / (2 * acceleration);
    
    System.out.println("The minimum runway length for this airplane is " + length);
  }
}