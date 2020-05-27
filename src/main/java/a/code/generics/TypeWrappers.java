package a.code.generics;

public class TypeWrappers {
  public static void main(String[] args) {
    byte b1 = 42;
    Byte b2 = new Byte((byte)42);

    short s1 = 30000;
    Short s2 = 30000;

    int i1 = 1;
    Integer i2 = 1;
    Integer i3 = new Integer(1);

    // boxing
    Integer i5 = i1;

    // unboxing
    int i6 = i2;

    long l1 = 2;
    Long l2 = 2L;

    float f1 = 2.5F;
    Float f2 = 2.5F;

    double d1 = 1.234;
    Double d2 = 1.234;

    char c1 = 'A';
    Character c2 = 'B';

    boolean valid = true;
    Boolean isEligibleForDiscount = false;

    final int k = 7;
  }
}
