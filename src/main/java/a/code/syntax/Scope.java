package a.code.syntax;

public class Scope {
  public static void main(String[] args) {
    for (int a = 0; a < 10; a++) {
      System.out.println(a);
    }
// isn't available here because closed curly brace
//    a = 11;

    if (true) {
      int b= 777;
    }
// isn't available here because closed curly brace
//    b = 888;

    {
      int b = 5;
    }
// isn't available here because closed curly brace
//    b = 7;
  }
}
