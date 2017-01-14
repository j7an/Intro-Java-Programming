/*
Write a program that displays the area and perimeter of a rectangle with the
width of 4.5 and height of 7.9 using the following formula:
area = width * height
*/

package chap_1;

public class Ex1_09_AreaPerimeterRectangle {
  public static void main(String[] args) {
    double width = 4.5;
    double height = 7.9;
    
    System.out.println("Rectangle Area: " + (width * height));
    System.out.println("Rectangle Perimeter: " + (2 * (width + height)));
  }
}