package code17;

public class WhatsNewIn17 {

  /** type inference */
  void m2() {
    var x = 1; // type is int
  }

  /** advanced instanceof */
  Integer m1(Object x) {
    if (x instanceof String s) {
      return s.length();
    }
    return -1;
  }

  /** switch */
  Integer m2(String s) {
    return switch (s) {
      case "a" -> 1;
      case "b" -> 2;
      default -> -1;
    };
  }

  /** strings */
  static void m3() {
    var s = """
        hello
        World""";
    System.out.printf("->%s<-", s);
  }

  public static void main(String[] args) {
    m3();
  }

}
