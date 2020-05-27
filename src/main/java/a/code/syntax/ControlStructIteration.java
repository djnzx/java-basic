package a.code.syntax;

public class ControlStructIteration {
  public static void main(String[] args) {
    // for loop, full syntax
    for (int i = 0; i < 10; i++) { // 0..9
      System.out.printf("x=%d, x*x=%d\n", i, i*i);
    }
    System.out.println("----");

    // for loop, downstream
    for (int i = 10; i > 0; i--) { // 10..1
      System.out.printf("x=%d, x*x=%d\n", i, i*i);
    }
    System.out.println("----");

    // for loop, shortened #1
    for (int i = 0;; i++) {
      if (i >= 5) break;
      System.out.printf("x=%d, x*x*x=%d\n", i, i*i*i);
    }
    System.out.println("----");

    // for loop, shortened #2
    for (int i = 0;;) {
      if (i >= 5) break;
      System.out.printf("x=%d, x*x*x=%d\n", i, i*i*i);
      i++;
    }
    System.out.println("----");

    // for loop, shortened #3
    int i = 0;
    for (;;) {
      if (i >= 5) break;
      System.out.printf("x=%d, x*x*x=%d\n", i, i*i*i);
      i++;
    }
    System.out.println("----");

    // while way 1
    char letter = 'A';
    while (letter < 'Z' + 1) {
      System.out.printf("%c ", letter);
      letter++;
    }
    System.out.println("\n----");

    // while way 2
    letter = 'a';
    while (true) {
      if (letter > 'z') break;
      System.out.printf("%c ", letter);
      letter++;
    }
    System.out.println("\n----");

    // do-while
    int k = 11;
    do {
      System.out.println(k);
      k--;
    } while (k > 0);

  }
}
