/* 3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or
 * tails. The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the user
 * to enter a guess and reports whether the guess is correct or incorrect.
 */

package chap_3;

import java.util.Scanner;

public class Ex3_14_HeadTails {

  public static void main(String[] args) {
    int coin = (int) (Math.random() * 2);

    System.out.print("Guess the next flip of the coin [0 = heads, 1 = tails]: ");
    Scanner input = new Scanner(System.in);
    int guess = input.nextInt();

    System.out.println("Your guess of " + guess + (guess == coin ? " is correct" : " is wrong"));
  }

}
