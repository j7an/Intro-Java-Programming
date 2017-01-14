/* (Find the number of days in a month) Write a program that prompts the user to
enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.

http://introcs.cs.princeton.edu/java/12types/LeapYear.java.html
*/

package chap_03;

import java.util.Scanner;
import java.text.DateFormatSymbols;

public class Ex3_11_DaysInMonth {
  public static void main(String[] args) {
    int days = 0;
    boolean isLeapYear = false;
    
    Scanner input = new Scanner(System.in).useDelimiter("[,\n]");
    
    System.out.print("Enter the month and year e.g. mm,yyyy: ");
    int month = input.nextInt();
    int year = input.nextInt();
    
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        days = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        break;
      case 2:
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        if (isLeapYear) {
          days = 29;
        } else {
          days = 28;
        }
        break;
      default: System.out.println("Error: invalid month");
        System.exit(1);
    }
    
    String monthString = new DateFormatSymbols().getMonths()[month-1];
    
    System.out.println(monthString + " " + year + " has " + days + " days");
  }
}