/* 3.19 (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes the
 * perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of
 * every pair of two edges is greater than the remaining edge.
 */

package chap_03;

import java.util.Scanner;

public class Ex3_19_PerimeterTriangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useDelimiter("[,\n]");

    System.out.print("Enter three edges of a triangle (e.g. 6,3,9): ");
    double tri1 = input.nextDouble();
    double tri2 = input.nextDouble();
    double tri3 = input.nextDouble();

    boolean valid = (tri1 + tri2 > tri3) && (tri2 + tri3 > tri1) && (tri3 + tri1 > tri2);

    if (valid) {
      System.out.println("The triangle's perimeter is " + (tri1 + tri2 + tri3));
    } else {
      System.out.println("The input is invalid");
    }
  }

}
