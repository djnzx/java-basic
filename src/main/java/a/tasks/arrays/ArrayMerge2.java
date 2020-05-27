package a.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayMerge2 {
  public static void main(String[] args) {
    final int LEN = 10;
    int[] first = new Random().ints(0,20).limit(LEN).toArray();
    int[] second = new Random().ints(0,20).limit(LEN).toArray();

    int[] joined = new int[first.length + second.length];
    for (int i = 0; i < first.length; i++) {
      joined[i] = first[i];
      joined[first.length + i] = second[i];
    }

    System.out.printf("First:  %s\n", Arrays.toString(first));
    System.out.printf("Second: %s\n", Arrays.toString(second));
    System.out.printf("Mixed:  %s\n", Arrays.toString(joined));
  }
}
