/* (Find the number of days in a month) Write a program that prompts the user to
enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.

http://introcs.cs.princeton.edu/java/12types/LeapYear.java.html
*/

import java.util.Scanner;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class DaysInMonth2 {
  public static void main(String[] args) {
    int days = 0;
    
    Scanner input = new Scanner(System.in).useDelimiter("[,\n]");
    
    System.out.print("Enter the month and year e.g. mm,yyyy: ");
    int month = input.nextInt();
    int year = input.nextInt();
    
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, 1);
    days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    
    String monthString = new DateFormatSymbols().getMonths()[month-1];
    
    System.out.println(monthString + " " + year + " has " + days + " days");
  }
}