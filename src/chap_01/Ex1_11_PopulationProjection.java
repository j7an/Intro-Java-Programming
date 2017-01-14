/*
The U.S. Census Bureau projects population based on the following assumptions:
* One birth every 7 seconds
* One death every 13 seconds
* One new immigrant every 45 seconds
Write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and one year has 365 days. Hint:
In Java, if two integers perform division, the result is an integer. The
fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is
2 (not 2.5). To get an accurate result with the fractional part, one of the
values involved in the division must be a number with a decimal point. For
example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/

package chap_01;

public class Ex1_11_PopulationProjection {
  public static void main(String[] args) {
    int population = 312032486;
    int year = 365;
    int hour = 24;
    int minute = 60;
    int second = 60;
    
    double birthPerYear = (year * hour * minute * second) / 7.0;
    double deathPerYear = (year * hour * minute * second) / 13.0;
    double immigrantPerYear = (year * hour * minute * second) / 45.0;

    for (int i = 1; i <= 5; i++) {
      System.out.print("Original year " + i + " population: " + population + " -> ");
      population = (int) Math.round(population + birthPerYear - deathPerYear + immigrantPerYear);
      System.out.println("Final year " + i + " population: " + population);
    }
  }
}