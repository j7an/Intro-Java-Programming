/* 3.20 (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to compute the wind-chill
 * temperature. The formula is valid for temperatures in the range between −58oF and 41oF and wind speed greater than
 * or equal to 2. Write a program that prompts the user to enter a temperature and a wind speed. The program displays
 * the wind-chill temperature if the input is valid; otherwise, it displays a message indicating whether the temperature
 * and/or wind speed is invalid.
 */

package chap_03;

import java.util.Scanner;

public class Ex3_20_WindChill {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in).useDelimiter("[,\n]");

    System.out.print("Enter temperature and wind speed (e.g. 75,5): ");
    double temp = input.nextDouble();
    double windSpeed = input.nextDouble();

    if (temp > -58 && temp < 41 && windSpeed >= 2) {
      double windchillIndex = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16))
          + (0.4275 * temp * Math.pow(windSpeed, 0.16));
      System.out.println("The wind chill index is " + windchillIndex);
    } else {
      if (temp <= -58 || temp >= 41) {
        System.out.println("The temperature you entered [" + temp + "] needs to be between -58 and 41 degrees");
      } else {
        System.out.println("The wind speed you entered [" + windSpeed + "] needs to be greater than or equal to 2");
      }
    }
  }

}
