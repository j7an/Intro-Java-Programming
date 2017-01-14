/* Rewrite Programming Exercise 1.11 to prompt the user to enter the number of
years and displays the population after the number of years. Use the hint in
Programming Exercise 1.11 for this program. The population should be cast into
an integer. 
*/

package chap_02;

import java.util.Scanner;

public class Ex2_11_PopulationProjection {
  public static void main(String[] args) {
    int population = 312032486;
    int year = 365;
    int hour = 24;
    int minute = 60;
    int second = 60;
    
    double birthPerYear = (year * hour * minute * second) / 7.0;
    double deathPerYear = (year * hour * minute * second) / 13.0;
    double immigrantPerYear = (year * hour * minute * second) / 45.0;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of years: ");
    int totYear = input.nextInt();

    for (int i = 1; i <= totYear; i++) {
      System.out.print("Original year " + i + " population: " + population + " -> ");
      population = (int) Math.round(population + birthPerYear - deathPerYear + immigrantPerYear);
      System.out.println("Final year " + i + " population: " + population);
    }
  }
}