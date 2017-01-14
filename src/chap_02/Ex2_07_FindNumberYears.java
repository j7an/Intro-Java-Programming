/* Write a program that prompts the user to enter the minutes (e.g., 1 billion),
and displays the number of years and days for the min- utes. For simplicity,
assume a year has 365 days.
*/

package chap_02;

import java.util.Scanner;

public class Ex2_07_FindNumberYears {
  public static void main(String[] args) {
    int minutes = 0,
      year = 0,
      days = 0,
      daysRemaining = 0;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of minutes: ");
    minutes = input.nextInt();
    
    days = minutes / 60 / 24;
    year = days / 365;
    daysRemaining = days % 365;
    System.out.println(minutes + " minutes is approximately " + year + " years and " + daysRemaining + " days");
  }
}