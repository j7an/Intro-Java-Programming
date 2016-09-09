/* How cold is it outside? The temperature alone is not enough to provide the
answer. Other factors including wind speed, rela- tive humidity, and sunshine
play important roles in determining coldness outside. In 2001, the National
Weather Service (NWS) implemented the new wind-chill temperature to measure the
coldness using temperature and wind speed. The formula is

twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16

where ta is the outside temperature measured in degrees Fahrenheit and v is the
speed measured in miles per hour. twc is the wind-chill temperature. The formula
cannot be used for wind speeds below 2 mph or temperatures below -58oF or above
41oF.

Write a program that prompts the user to enter a temperature between - 58 oF
and 41oF and a wind speed greater than or equal to 2 and displays the wind-chill
temperature. Use Math.pow(a, b) to compute v0.16
*/

import java.util.Scanner;

public class WindchillTemperature {
  public static void main(String[] args) {
    double temp = 45.0,
      windSpeed = 0.0,
      windchillIndex = 0.0;
      
    Scanner input = new Scanner(System.in);
    
    while (temp < -58 || temp > 41) {
      System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
      temp = input.nextDouble();
    }
    
    while (windSpeed < 2) {
      System.out.print("Enter the wind speed (>=2) in miles per hour: ");
      windSpeed = input.nextDouble();
    }
    
    windchillIndex = 35.74 + (0.6215 * temp) -
      (35.75 * Math.pow(windSpeed, 0.16)) +
      (0.4275 * temp * Math.pow(windSpeed, 0.16));
    System.out.println("The wind chill index is " + windchillIndex);
  }
}