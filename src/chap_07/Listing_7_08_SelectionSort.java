package chap_07;

import java.util.Arrays;

public class Listing_7_08_SelectionSort {
  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // find minimum
      double currentMin = list[i];
      int currentMinIndex = i;
      
      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      
      // swap
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
  
  public static void main(String[] args) {
    double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    selectionSort(list);
    System.out.println(Arrays.toString(list));
  }
}
