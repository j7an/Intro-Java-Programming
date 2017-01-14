/* 3.12 (Palindrome number) Write a program that prompts the user to enter a
three-digit integer and determines whether it is a palindrome number. A number
is palin- drome if it reads the same from right to left and from left to right.
Here is a sample run of this program:
*/

package chap_03;

import java.util.Scanner;

public class Ex3_12_PalindromeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a 3-digit number: ");
    int num = input.nextInt();
    
    String stringNum = String.valueOf(num);
    String temp = "";

    for (int i = stringNum.length() - 1; i >= 0; i--) {
      temp += stringNum.charAt(i);
    }

    System.out.println(num + " is" + (stringNum.equals(temp) ? " a" : " not a") + " palindrome");
  }
}