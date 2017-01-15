/* 3.18 (Cost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of
 * shipping based on the weight of the package (in pounds).
 * 3.5, if 0 < w <= 1
 * 5.5, if 1 < w <= 3
 * 8.5, if 3 < w <= 10
 * 10.5,if 10 < w <= 20
 * Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the
 * weight is greater than 20, display a message “the package cannot be shipped.”
 */

package chap_03;

import java.util.Scanner;

public class Ex3_18_CostShipping {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter weight of package: ");
    double weight = input.nextDouble();
    
    double cost = 0.0;
    
    if (weight > 0 && weight <= 1) {
      System.out.println("The shipping cost is $3.50");
    } else if (weight > 1 && weight <= 3) {
      System.out.println("The shipping cost is $5.50");
    } else if (weight > 3 && weight <= 10) {
      System.out.println("The shipping cost is $8.50");
    } else if (weight > 10 && weight <= 20) {
      System.out.println("The shipping cost is $10.50");
    } else {
      System.out.println("The package cannot be shipped.");
    }
    
  }

}
