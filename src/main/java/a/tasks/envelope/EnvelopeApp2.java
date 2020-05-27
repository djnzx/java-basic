package a.tasks.envelope;

import java.util.Scanner;

public class EnvelopeApp2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter width: ");
    final int width = sc.nextInt();
    System.out.print("Enter height: ");
    final int height = sc.nextInt();
    double tan = ((double) width) / height;
    for (int y=1; y<=height; y++) {
      for (int x=1; x<=width ; x++) {
        if (y==1 || y==height || x==1 || x==width ||
            x == (int) (y*tan) || width - x == (int) (y*tan)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
