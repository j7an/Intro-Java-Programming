/*
Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a
program that displays the average speed in kilometers per hour. (Note that 1
mile is 1.6 kilometers.)
*/

package chap_01;

public class Ex1_12_AverageSpeedKilometers {
  public static void main(String[] args) {
    int miles = 24;
    double kilometers = miles * 1.6;
    double hours = 1;
    double kpm;
    
    hours = hours + (40 / 60) + (35 / 60 / 60);
    kpm = kilometers / hours;
    
    System.out.println("Kilometers per hour: " + kpm);
  }
}