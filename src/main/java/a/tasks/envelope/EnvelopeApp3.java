package a.tasks.envelope;

import java.util.Scanner;

public class EnvelopeApp3 {

  private static boolean isShouldBeFilled(int x, int y, int width, int height, double tan) {
    return y==1 || y==height || x==1 || x==width ||
        x == (int) (y*tan) || width - x == (int) (y*tan);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter width: ");
    final int width = sc.nextInt();
    System.out.print("Enter height: ");
    final int height = sc.nextInt();
    double tan = ((double) width) / height;
    for (int y=1; y<=height; y++) {
      for (int x=1; x<=width ; x++) {
        if (isShouldBeFilled(x, y, width, height, tan)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
