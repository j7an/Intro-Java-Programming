/*
Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program
that displays the average speed in miles per hour. (Note that 1 mile is 1.6
kilometers.
*/

public class AverageSpeedMiles {
  public static void main(String[] args) {
    double miles = 14 / 1.6;
    double hours = 45.5 / 60;

    System.out.println(miles + " miles");
    System.out.println(hours + " hours");
    System.out.println(miles / hours + " mph");
  }
}