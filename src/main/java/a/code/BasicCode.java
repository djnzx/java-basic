package a.code;

public class BasicCode {

  static int z_default = 99;
  char c = 'z';
  int price = 30;

  public static int add(int a, int b) {
    int c = a + b;
    String s = "alex";
    for (int i = 0; i < s.length(); i++) {
      char charAt = s.charAt(i);
      c = c + charAt;
    }
    return c;
  }

  public static void main(String[] args) {

    char a1 = 'A';
    int a2 = 'A';

    String msg = "Helllo";
    int z = add(5, 7);
    System.out.println(msg);
    System.out.println(z);
    boolean isEligibleFor = false;
    if (z == 13) {
      System.out.println("eligible 13");
    } else if (z == 12) {
      System.out.println("eligible 12");
    }
    else {
      System.out.println("not eligible");
    }

    z = 5;

    switch (z) {
      case 1:
        System.out.println(1);
        break;
      case 5:
        System.out.println(5);
        break;
      case 12:
        System.out.println(12);
        break;
      default:
        System.out.println("other than 1,5,12");
    }

  }
}
