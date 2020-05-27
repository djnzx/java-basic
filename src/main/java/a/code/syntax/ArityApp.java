package a.code.syntax;

public class ArityApp {
  // operator arity;
  // prefix / infix notation
  // unary
  // binary
  // ternary
  public static void main(String[] args) {
    int z=6;

    // binary, infix
    int a = 5 + 7;

    // unary, prefix
    boolean isEligigle = ! false;
    --z;

    // unary, postfix
    z++;

    // conventional way
    String s;
    if (z > 5) {
      s = "More than FIVE";
    } else {
      s = "Less tan FIVE";
    }

    // ternary operator assignment
    s = z > 5 ? "More than FIVE" : "Less tan FIVE";

//        z = 11;
    s = z > 10 ? "More then TEN" :
        z > 9 ? "More than 9" :
            z > 8 ? "More than 8" : "smth ELSE";

    System.out.println(s);
  }
}
