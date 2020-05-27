package a.code.syntax;

public class ControlStructIfSwitch {
  public static void main(String[] args) {
    // if-branching
    boolean v1 = true;
    // ...
    if (v1 == true) {
      System.out.println("V is true");
    } else {
      System.out.println("V is false");
    }

    // switch-case branching
    int x = 2;
    switch (x) {
      case 1:
        System.out.println("x = 1");
        break;
      case 2:
        System.out.println("x = 2");
        break;
      case 5:
        System.out.println("x = 5");
        break;
      default:
        throw new IllegalArgumentException("Smth went wrong");
    }
  }
}
