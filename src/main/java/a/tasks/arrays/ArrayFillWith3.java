package a.tasks.arrays;

import java.util.Scanner;

public class ArrayFillWith3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter size:");
    int n = scan.nextInt();
    int[][] data = new int[n][n];
    for (int c = 0; c < n / 2 + 1; c++) {
      for (int e = c; e < data.length - c; e++) {
        for (int f = c; f < data.length - c; f++) {
          data[e][f] = n - 2 - c;
        }
      }
    }
    for (int[] row: data) {
      for (int el: row) {
        System.out.print(el + " ");
      }
      System.out.println();
    }
  }
}
