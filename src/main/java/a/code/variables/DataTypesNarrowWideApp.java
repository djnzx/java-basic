package a.code.variables;

public class DataTypesNarrowWideApp {
  public static void main(String[] args) {
    // type widening (automatic)
    byte  v1 = 5;  // 1 byte
    short v2 = v1; // 1 -> 2 bytes
    int   v3 = v2; // 2 -> 4 bytes
    long  v4 = v2; // 2 -> 8 bytes

    // type narrowing
    int i5 = 555; // 4 bytes
    // way #1: by compiler casting
    byte b2 = (byte)i5;
    // way #2: by math rule (remainder)
    byte b3 = 555 % 256;
    // way #3: by using only one byte using bitwise operation
    byte b4 = 555 & 0xFF;
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);

    float f1 = 4.5F;
    int f2 = (int) f1;
    // by math rule
    int f3 = Math.round(f1);
    // down
    double f4 = Math.floor(f1);
    // up
    double f5 = Math.ceil(f1);
    System.out.println(f1); // 4.5
    System.out.println(f2); // 4
    System.out.println(f3); // 5
    System.out.println(f4); // 4.0
    System.out.println(f5); // 5.0

    // b2 = "Hello"; // impossible because of static typing
  }
}
