/* Write a program that prompts the user to enter the distance to drive, the
fuel efficiency of the car in miles per gallon, and the price per gallon, and
displays the cost of the trip.
*/

import java.util.Scanner;

public class CostDriving {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the driving distance: ");
    double distance = input.nextDouble();
    System.out.print("Enter miles per gallon: ");
    double mpg = input.nextDouble();
    System.out.print("Enter price per gallon: ");
    double ppg = input.nextDouble();
    
    double gallonUsed = distance / mpg;
    double cost = ppg * gallonUsed;
    
    System.out.println("The cost of driving is $" + cost);
  }
}