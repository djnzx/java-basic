package a.code.randoms;

import java.util.Arrays;
import java.util.Random;

public class RandomStreamApp {
  public static void main(String[] args) {
    int[] ints = new Random()
        .ints(-100, 100)
        .limit(20)
        .toArray();
    System.out.println(Arrays.toString(ints));
  }
}
