package a.code.generics;

public class TypeWrappersBoxUnbox {
  public static void main(String[] args) {
    // primitive variable allocation
    int i = 5;

    // type wrapper class creation
    Integer j2 = new Integer(6);

    // lot of useful methods
    String is = Integer.toString(i);
    String js = j2.toString();

    // auto boxing: int -> Integer
    Integer j1 = 6;
    j1 = i;

    // auto unboxing Integer -> int
    int i2 = j2;
  }
}
