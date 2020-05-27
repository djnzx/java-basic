package a.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopy1 {
  public static void main(String[] args) {
    int[] origin = new Random().ints(0,20).limit(10).toArray();
    int[] destination = new int[origin.length];

    for (int i = 0; i < origin.length; i++) {
      destination[i] = origin[i];
    }

    System.out.printf("Origin: %s\n", Arrays.toString(origin));
    System.out.printf("Copied: %s\n", Arrays.toString(destination));
  }
}
