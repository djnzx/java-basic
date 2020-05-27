package a.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopy3 {
  public static void main(String[] args) {
    int[] origin = new Random().ints(0,20).limit(10).toArray();
    int[] destination = new int[origin.length];

    System.arraycopy(origin, 0, destination, 0, origin.length);

    System.out.printf("Origin: %s\n", Arrays.toString(origin));
    System.out.printf("Copied: %s\n", Arrays.toString(destination));
  }
}
