package a.code.strings;

public class StringsApp {

  public static void main(String[] args) {
    String name = "  Jim  ";
    String hello_message = "Hello, "+ name;
    String hello_message2 = String.format("Hello, %s", name);
    String trimmed = name.trim(); // "Jim"
    boolean hello_starts = "Hello World".startsWith("Hello"); // true
    boolean hello_ends = "Hello".endsWith("hello"); // false
    String[] splitted = "Apple,Banana,Pineapple".split(",");
    boolean hello = "Hello".equals("Hello"); //true
    "Hello".equalsIgnoreCase("HELLO"); //true
    "Hello".substring(0, 1); // H
    "Hello".substring(1); // ello
    "Hello".indexOf('l'); // 2
    String s1 = "Hello";
    String s2 = "Привет";
    String s3 = "Əliyev";
    System.out.println(s1.length());  // 5
    System.out.println(s2.length());  // 6
    System.out.println(s3.length());  // 6
    System.out.println(s1.getBytes().length); // 5
    System.out.println(s2.getBytes().length); // 12
    System.out.println(s3.getBytes().length); // 7
    char c = s1.charAt(1); // e
    s1.contains("ll"); // true
  }
}
