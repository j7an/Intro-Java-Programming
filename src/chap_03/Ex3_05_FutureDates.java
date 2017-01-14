/* Write a program that prompts the user to enter an integer for today’s day of
the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the
user to enter the number of days after today for a future day and dis- play the
future day of the week.
*/

package chap_03;

import java.util.Scanner;

public class Ex3_05_FutureDates {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter today's day: ");
    int today = input.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int elapsed = input.nextInt();
    
    System.out.println("Today is " + weekday(today) + " and the future day is "
      + weekday(today + elapsed));
  }
  
  public static String weekday(int num) {
    String day = null;
    
    switch (num % 7) {
      case 0:
        day = "Sunday";
        break;
      case 1:
        day = "Monday";
        break;
      case 2:
        day = "Tuesday";
        break;
      case 3:
        day = "Wednesday";
        break;
      case 4:
        day = "Thursday";
        break;
      case 5:
        day = "Friday";
        break;
      case 6:
        day = "Saturday";
        break;
      default:
        System.out.println("Error: Invalid Status");
        System.exit(1);
    }
    
    return day;
  }
}