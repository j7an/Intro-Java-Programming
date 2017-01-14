/* 3.16 (Random point) Write a program that displays a random coordinate in a rectangle. The rectangle is centered at
 * (0, 0) with width 100 and height 200.
 */

package chap_03;

public class Ex3_16_RandomPoint {

  public static void main(String[] args) {
    int widthMin = -50;
    int widthMax = 50;
    int heightMin = -100;
    int heightMax = 100;

    int widthRand = (int) (Math.random() * ((widthMax - widthMin) + 1)) + widthMin;
    int heightRand = (int) (Math.random() * ((heightMax - heightMin) + 1)) + heightMin;

    System.out.println("Random point in rectangle is: (" + widthRand + ", " + heightRand + ")");
  }

}
