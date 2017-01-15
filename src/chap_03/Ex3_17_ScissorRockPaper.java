/* 3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock- paper game. (A scissor can
 * cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0,
 * 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and
 * displays a message indicating whether the user or the computer wins, loses, or draws.
 */

package chap_03;

import java.util.Scanner;

public class Ex3_17_ScissorRockPaper {

  public static void main(String[] args) {
    
    String[] SRP = {"scissor", "rock", "paper"};
    
    Scanner input = new Scanner(System.in);

    System.out.print("scissor (0), rock (1), paper (2): ");

    int user = input.nextInt();
    int computer = (int) (Math.random() * 3);

    switch (user) {
    case 0:
      switch (computer) {
      case 0:
        System.out.println("The computer is " + SRP[computer] +". You are " + SRP[user] + " too. It is a draw");
        break;
      case 1:
        System.out.println("The computer is " + SRP[computer] + ". You are " + SRP[user] + ". You lost");
        break;
      case 2:
        System.out.println("The computer is " + SRP[computer] + ". You are " + SRP[user] + ". You won");
        break;
      }
      break;
    case 1:
      switch (computer) {
      case 0:
        System.out.println("The computer is " + SRP[computer] + ". You are " + SRP[user] + ". You won");
        break;
      case 1:
        System.out.println("The computer is " + SRP[computer] +". You are " + SRP[user] + " too. It is a draw");
        break;
      case 2:
        System.out.println("The computer is " + SRP[computer] + ". You are " + SRP[user] + ". You lost");
        break;
      }
      break;
    case 2:
      switch (computer) {
      case 0:
        System.out.println("The computer is " + SRP[computer] + ". You are " + SRP[user] + ". You lost");
        break;
      case 1:
        System.out.println("The computer is " + SRP[computer] + ". You are " + SRP[user] + ". You won");
        break;
      case 2:
        System.out.println("The computer is " + SRP[computer] +". You are " + SRP[user] + " too. It is a draw");
        break;
      }
      break;
    default:
      System.out.println("Error: invalid status");
      System.exit(1);
    }

  }

}
