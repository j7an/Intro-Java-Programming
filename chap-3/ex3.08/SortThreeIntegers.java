/* Write a program that prompts the user to enter three integers and display the
integers in non-decreasing order.
*/

import java.util.Scanner;

public class SortThreeIntegers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter three integers: ");
    
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int temp = 0;
    
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    System.out.print("Sorted integers are: " + num1 + ", " + num2 + ", " + num3);
  }
}