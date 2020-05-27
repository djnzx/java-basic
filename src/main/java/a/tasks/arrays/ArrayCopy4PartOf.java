package a.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopy4PartOf {
  public static void main(String[] args) {
    int[] origin = new Random().ints(0,20).limit(10).toArray();
    int[] destination = Arrays.copyOf(origin, 5);

    System.out.printf("Origin: %s\n", Arrays.toString(origin));
    System.out.printf("Copied: %s\n", Arrays.toString(destination));
  }
}
