package a.code.strings;

public class StringLocationApp {
  public static void main(String[] args) {
    // this string will be allocated in the STRING POOL
    String john = "John";
    // this string will be allocated in the HEAP
    String jim = new String("Jim");
  }
}
