package a.code.randoms;

import java.util.Random;

public class RandomApp {
  public static void main(String[] args) {
    // one double value from the range [0..1)
    double rnd1 = Math.random();
    System.out.println(rnd1);

    // one int value from the range [0..100)
    int rnd2 = (int) (Math.random() * 100);

    // one int value from the range [-100..100]
    int rnd3 = (int) (Math.random() * 201 - 100);

    // many values
    Random random = new Random();

    for (int i = 0; i < 5; i++) {
      int rndx = random.nextInt();
      System.out.println(rndx);
    }

    // many values from range [0, N)
    for (int i = 0; i < 10; i++) {
      int rndy = random.nextInt(5);
      System.out.println(rndy);
    }

  }
}
