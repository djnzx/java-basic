package a.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayFillRandoms2 {
  public static void main(String[] args) {
    final int LEN = 10;
    int[] origin = new Random().ints(0,20).limit(LEN).toArray();

    System.out.printf("Origin: %s\n", Arrays.toString(origin));
  }
}
