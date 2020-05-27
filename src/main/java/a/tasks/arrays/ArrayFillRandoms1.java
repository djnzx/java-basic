package a.tasks.arrays;

import java.util.Arrays;

public class ArrayFillRandoms1 {
  public static void main(String[] args) {
    final int LEN = 10;
    final int[] origin = new int[LEN];
    for (int i = 0; i < origin.length; i++) {
      origin[i] = (int)(Math.random()*200-100);
    }

    System.out.printf("Origin: %s\n", Arrays.toString(origin));
  }
}
