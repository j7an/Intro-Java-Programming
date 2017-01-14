/* Write a program that prompts the user to enter the side of a hexagon and
displays its area.
*/

package chap_02;

import java.util.Scanner;

public class Ex2_16_AreaHexagon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the side: ");
    double side = input.nextDouble();
    
    System.out.println("The area of the hexagon is " +
      ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2));
  }
}