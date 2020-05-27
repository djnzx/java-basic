package a.code.syntax;

import java.util.Random;

public class WhileContinueApp {
  private static int[] generate() {
    Random random = new Random();
    int[] a = new int[30];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(20) - 10;
    }
    return a;
  }

  public static void main(String[] args) {
    int[] generated = generate();

    for (int val: generated) {
      if (val % 2 == 0) {
        System.out.printf("%d ",val);
      }
    }
    System.out.println();

    for (int val: generated) {
      if (val % 2 != 0) continue;
      System.out.printf("%d ",val);
    }
    System.out.println();

  }
}
