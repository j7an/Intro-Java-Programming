/* Write a program that reads a number in feet, converts it to meters, and
displays the result. One foot is 0.305 meter.
*/

import java.util.Scanner;

public class ConvertFeetMeters {
  public static void main(String[] args) {
    double feet = 0.0,
      meters = 0.0;
      
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    feet = input.nextDouble();
    
    meters = feet * .305;
    
    System.out.println(feet + " feet is " + meters + " meters");
  }
}