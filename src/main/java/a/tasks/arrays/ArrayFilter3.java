package a.tasks.arrays;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayFilter3 {

  private static int[] generate(int len) {
    final int[] data = new int[len];
    for (int i = 0; i < data.length; i++) {
      data[i] = (int)(Math.random()*200-100);
    }
    return data;
  }

  private static int[] filter(int[] origin, Predicate<Integer> p) {
    int[] tmp = new int[origin.length];
    int pos = 0;
    for (int el: origin) {
      if (p.test(el)) {
        tmp[pos++] = el;
      }
    }
    return Arrays.copyOf(tmp, pos);
  }

  public static void main(String[] args) {
    final int LEN = 30;
    final int[] origin = generate(LEN);
    int[] po = filter(origin, x -> x>=0 && x%2!=0);
    int[] pe = filter(origin, x -> x>=0 && x%2==0);
    int[] no = filter(origin, x -> x<0 && x%2!=0);
    int[] ne = filter(origin, x -> x<0 && x%2==0);
    System.out.println(Arrays.toString(origin));
    System.out.println(Arrays.toString(ne));
    System.out.println(Arrays.toString(no));
    System.out.println(Arrays.toString(pe));
    System.out.println(Arrays.toString(po));
  }
}
