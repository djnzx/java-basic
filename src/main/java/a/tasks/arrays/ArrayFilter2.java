package a.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayFilter2 {
  /**
   * generate an array of length=30
   * from range [-10, 10]
   * split this array into 3 different arrays:
   * negative, positive even, positive odd elems
   */
  public static void main(String[] args) {
    int[] origin = generate();
    int[] negatives = filter_negatives(origin);
    int[] odd = filter_odd(origin);
    int[] even = filter_even(origin);

    System.out.printf("origin: %s\n", Arrays.toString(origin));
    System.out.printf("negatives: %s\n", Arrays.toString(negatives));
    System.out.printf("odd: %s\n", Arrays.toString(odd));
    System.out.printf("even: %s\n", Arrays.toString(even));
  }

  private static int[] filter_even(int[] origin) {
    int[] dst = new int[origin.length];
    int index = 0;
    for (int item: origin) {
      if (item >= 0 && item % 2 == 0) {
        dst[index++] = item;
      }
    }
    return Arrays.copyOf(dst, index);
  }

  private static int[] filter_odd(int[] origin) {
    int[] dst = new int[origin.length];
    int index = 0;
    for (int value: origin) {
      if (value >= 0 && value % 2 != 0) {
        dst[index++] = value;
      }
    }
    return Arrays.copyOf(dst, index);
  }

  private static int[] filter_negatives(int[] origin) {
    int[] dst = new int[origin.length];
    int index = 0;
    for (int item: origin) {
      if (item < 0) {
        dst[index++] = item;
      }
    }
    return Arrays.copyOf(dst, index);
  }

  private static int[] generate() {
    Random random = new Random();
    int[] a = new int[30];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(20) - 10;
    }
    return a;
  }

}
