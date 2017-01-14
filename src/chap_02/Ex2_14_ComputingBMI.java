/* Body Mass Index (BMI) is a measure of health on weight. It can be calculated
by taking your weight in kilograms and dividing by the square of your height in
meters. Write a program that prompts the user to enter a weight in pounds and
height in inches and displays the BMI. Note that one pound is 0.45359237
kilograms and one inch is 0.0254 meters.
*/

package chap_02;

import java.util.Scanner;

public class Ex2_14_ComputingBMI {
  public static void main(String[] args) {
    double weightPounds,
      heightInches;
      
    Scanner input = new Scanner(System.in);
    System.out.print("Enter weight in pounds: ");
    weightPounds = input.nextDouble();
    System.out.print("Enter height in inches: ");
    heightInches = input.nextDouble();
    
    System.out.println("BMI is " + (weightPounds * 0.45359237) / Math.pow((heightInches * 0.0254), 2));
  }
}