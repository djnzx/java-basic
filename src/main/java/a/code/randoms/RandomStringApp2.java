package a.code.randoms;

import java.util.Random;

public class RandomStringApp2 {
  public static void main(String[] args) {
    String s = new Random().ints('A', 'Z')
        .limit(30)
        .collect(
            StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append
        ).toString();
    System.out.println(s);
  }
}
