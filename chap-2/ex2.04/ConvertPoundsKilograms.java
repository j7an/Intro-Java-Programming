/* Write a program that converts pounds into kilo- grams. The program prompts
the user to enter a number in pounds, converts it to kilograms, and displays
the result. One pound is 0.454 kilograms.
*/

import java.util.Scanner;

public class ConvertPoundsKilograms {
  public static void main(String[] args) {
    double pounds = 0.0,
      kilograms = 0.0;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number in pounds: ");
    pounds = input.nextDouble();
    
    kilograms = pounds * .454;
    
    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  }
}