/*
Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:

perimeter = 2 * radius * pi
area = radius * radius * pi
*/

public class AreaPerimeterCircle {
  public static void main(String[] args) {
    double radius = 5.5;
    
    System.out.println("perimeter = " + 2 * radius * Math.PI);
    System.out.println("area = " + radius * radius * Math.PI);
  }
}