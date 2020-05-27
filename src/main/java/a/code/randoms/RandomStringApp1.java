package a.code.randoms;

import java.util.Random;

public class RandomStringApp1 {
  public static void main(String[] args) {
    String s = new Random().ints('A', 'Z')
        .limit(30)
        .mapToObj(n -> String.valueOf((char) n))
        .reduce((s1,s2) -> s1+s2)
        .orElse("");
    System.out.println(s);
  }
}
